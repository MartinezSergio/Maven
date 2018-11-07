package es.indra.aerolineas.beans.impl;

import java.util.Scanner;

public class MetodosEntrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca el nombre por favor: ");
		String nombre = teclado.nextLine();
		
		System.out.print("Introduzca sus apellidos: ");
		String apellidos = teclado.nextLine();
		
		System.out.print("Introduzca su dni: ");
		String dni = teclado.nextLine();

		
		Pasajero p = new Pasajero();
		
		p.setId(10);
		p.setNombre(nombre);
		p.setApellidos(apellidos);
		p.setDni(dni);
		
		System.out.println("El nombre completo del pasajero es: " + p.getNombre() + " " + p.getApellidos()
		+ " con dni: " + p.getDni());
		
	}

}
