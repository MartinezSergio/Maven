package es.indra.demomysql.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LogAspect {

	@Before("execution(* es.indra.demomysql.service.impl.*.*(..))")
	public void antesDeLosMetodos(JoinPoint join) {
		// Advice
		System.out.println("Dentro del aspecto para: " + join);
		// System.out.println("log de la operación: " + join);

	}

	@Around("execution(* es.indra.demomysql.controller.*.*(..))")
	public void tiempoEjecucion(ProceedingJoinPoint join) throws Throwable {
		long inicio = System.currentTimeMillis();

		join.proceed();

		long tiempo = System.currentTimeMillis() - inicio;

		System.out.println("Tiempo de ejecicion: " + tiempo + "ms");

	}

}
