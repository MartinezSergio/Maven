package es.indra.aerolineas.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

import es.indra.aerolineas.beans.impl.Pasajero;

public class WriteFile {
	
	public void escribirFichero(Pasajero p) {
		
		File archivo = new File("pasajero.txt");
		
		try {
			FileWriter fw = new FileWriter(archivo);
			fw.write(p.toString());
			fw.close();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		
		}
	

}
