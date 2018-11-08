package flujos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Por favor, introduce su nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.print("Introduzca su edad: ");
		int edad = scanner.nextInt();
		
		System.out.print("Introduzca su saldo disponible: ");
		double disponible = scanner.nextDouble();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Disponible: " + disponible);
		
		File archivo = new File("pasajero.txt");
		try {
			FileWriter fw = new FileWriter(archivo);
			fw.write("Hola que tal");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
