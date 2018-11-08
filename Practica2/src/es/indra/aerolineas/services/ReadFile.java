/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;


/**
 * @author aula10
 *
 */
public class ReadFile {
	
	public List<String> retornarVuelos() throws ErrorLecturaDeVuelosException{
		
		List<String> vuelos = new ArrayList<>();
		Path path = Paths.get("/Users/aula11/repositorios/practicas-curso-java/vuelos.txt");
		
				
		try {
			vuelos = Files.readAllLines(path);
			
			
			//List<String> contenido = Files.readAllLines(path);
						
			//System.out.println(contenido);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block			
			throw new ErrorLecturaDeVuelosException("Fallo leyendo el archivo",e);
		} finally {
			System.out.println("Finalizada lectura de archivos.");
		}		
		
		return vuelos;
		
	}
	
public List<String> retornarVuelosPropagandoError() throws IOException {
		
		List<String> vuelos = new ArrayList<>();
		Path path = Paths.get("/Users/aula4/repositorios/CursoJava/practicas-curso-java/vuelos.txt");
				
		
			vuelos = Files.readAllLines(path);
			
			return vuelos;
			
		
	}
/*
	public static void main(String[] args) {
		ReadFile r = new ReadFile();
		try {
			r.retornarVuelos();
		} catch (ErrorLecturaDeVuelosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/

}
