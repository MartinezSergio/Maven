/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


/**
 * @author aula10
 *
 */
public class ReadFile {
	
	public void retornarVuelos() {
		Path path = Paths.get("/Users/aula10/repositorios/CursoJava/vuelos.txt");
		
		try {
			List<String> contenido = Files.readAllLines(path);
			
			System.out.println(contenido);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		ReadFile r = new ReadFile();
		r.retornarVuelos();
	}
	

}
