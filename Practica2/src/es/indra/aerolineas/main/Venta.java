/**
 * 
 */
package es.indra.aerolineas.main;

import java.io.IOException;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.beans.impl.Aerolinea;
import es.indra.aerolineas.beans.impl.Billete;
import es.indra.aerolineas.beans.impl.Empleado;
import es.indra.aerolineas.beans.impl.Pasajero;
import es.indra.aerolineas.beans.impl.Vuelo;

/**
 * @author josejarizav
 *
 */
public class Venta{
	
	private static Vuelo[] creaVuelos() {
		Vuelo[] vuelos = new Vuelo[10];
		for (int i = 0; i < vuelos.length; i++) {	
			int a = (int) (Math.random()*10+1);
			vuelos[i] = new Vuelo(i,"SD" + a, "MAD","VLC", i * 10, true   );
		}
		return vuelos;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args){

		Vuelo[] vuelos = creaVuelos();		
		
		IAerolinea aa = new Aerolinea(10, "American Airlines",vuelos);
		
		try {
			aa.consultarVuelos("MAD");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		aa.consultarVuelos("MAD","BCN");
		
		
		aa.anularVuelos();
		aa.anularVuelos("AUX22");
		aa.anularVuelos("SD32", "DF33");
		
		Empleado emp = new Empleado();
		emp.setNombre("Vendedor 1");
		
		Pasajero p = new Pasajero();
		
		Vuelo[] vuelosPasajero = {vuelos[0], vuelos[4]};
		
		p.setId(10);
		p.setNombre("Jose Julian");
		p.setApellidos("Ariza Valderrama");
		p.setVuelos(vuelosPasajero);
		
		System.out.println("*************************************************************************");
		
		System.out.println("|\tBienvenidos a aerolineas ".concat(aa.getNombre()));
		
		System.out.println("|\tLe atiende:  ".concat(emp.getNombre()));
		
		System.out.printf("|\tTenemos %s vuelos disponibles%n",aa.getVuelos().length);
		
		System.out.printf("|\t%s, gracias por confiar en nosotros. Tienes %s vuelos comprados %n", p.getNombre(),p.getVuelos().length );
		
		System.out.println("*************************************************************************");
		
		
		Billete b1 = new Billete(10, vuelos[1], p, "07/11/2018", "18A");
		Billete b2 = new Billete(11, vuelos[1], p, "08/11/2018", "22B");
		Billete b3 = new Billete(12, vuelos[2], p, "07/11/2018", "30A");
		Billete b4 = new Billete(13, vuelos[2], p, "09/11/2018", "48B");
		Billete b5 = new Billete(14, vuelos[2], p, "07/11/2018", "59A");
		System.out.println(b5.toString());
		try {
			aa.consultarVuelos("MAD");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		aa.getBilletes().put(1, b1);
		aa.getBilletes().put(2, b2);
		aa.getBilletes().put(3, b3);
		
		

	}


}
