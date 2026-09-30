package ejercicio9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Fichero implements Iterable<String> {
	public ArrayList<String> lineas = new ArrayList<>();
	
	public Fichero (String file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String linea;
			while ((linea = br.readLine()) != null)
				lineas.add(linea);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public Fichero(File file) {
		this(file.getPath());
	}

	@Override
	public Iterator<String> iterator() {
		
		return null;
	}
	
}
	

