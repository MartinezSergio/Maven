package hilos;

import java.util.Set;

public class Heredando extends Thread {

	public void run() {
		super.run();

		System.out.println("Dentro de run");

		if (getName().equals("Hilo 1")) {
			try {
				sleep(3000);
				System.out.println("por fin despierto!!!!");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (getName().equals("Hilo 2")) {
			System.out.println("Soy ".concat(getName()));
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} else {
			System.out.println("Soy otro hilo: ".concat(getName()));
		}
	}

	public static void main(String[] args) {

		Heredando h = new Heredando();
		h.setName("Hilo 1");
		h.start();

		Heredando h2 = new Heredando();
		h2.setName("Hilo 2");
		h2.start();

		Heredando h3 = new Heredando();
		h3.setName("Hilo 3");
		h3.start();
		
		System.out.println("Hilos en ejecución: " + Heredando.activeCount());
		
		Set<Thread>hilos = Heredando.getAllStackTraces().keySet();
		
		for (Thread hilo : hilos) {
			StringBuilder sb = new StringBuilder();
			
			sb.append("\"" + hilo.getName() + "\"");
			sb.append(" : ");
			sb.append(hilo.getPriority());
			sb.append(", ");
			sb.append(hilo.isDaemon());
			sb.append(", ");
			sb.append(hilo.getState());
			
			System.out.println("\t" + sb);
		}
	}

}
