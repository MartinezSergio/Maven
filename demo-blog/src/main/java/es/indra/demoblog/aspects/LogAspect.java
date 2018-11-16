package es.indra.demoblog.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;

@Aspect
@Configuration
public class LogAspect {

	@Before("execution(* es.indra.demoblog.service.impl.*.*(..))")
	public void antesDeLosMetodos(JoinPoint join) {
		// Advice
		System.out.println("Dentro del aspecto para: " + join);
		// System.out.println("log de la operación: " + join);
	}

	@Around("execution(* es.indra.demoblog.controller.*.*(..))")
	public Object tiempoEjecucion(ProceedingJoinPoint pjp) throws Throwable {
		StopWatch sw = new StopWatch();
		Object retVal;
		try {
			sw.start(pjp.getTarget() + "." + pjp.getSignature());
			retVal = pjp.proceed();
		} catch (Throwable e) {
			throw e;
		} finally {
			sw.stop();
			System.out.println(sw.prettyPrint());
		}
		return retVal;
	}

}
