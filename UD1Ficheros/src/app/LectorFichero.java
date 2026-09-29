package app;

	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.LinkedList;
	import java.util.List;

import ejercicio7.Lector;

	public class LectorFichero implements Lector {

			private String file;
			
			public void setFile(String file) {
				this.file = file;
			}
			
			@Override
			public List<String> leer() {
				LinkedList<String> lineas = new LinkedList<>();
				
				try (BufferedReader br = new BufferedReader (new FileReader(file))) {
					
					String linea;
					
					while((linea = br.readLine()) != null )
						lineas.add(linea);
					
				} catch  (FileNotFoundException e ) {
					System.out.println(e.getMessage());
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				return lineas;			
			}
	}

