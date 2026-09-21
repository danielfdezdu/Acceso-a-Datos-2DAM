package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)){
			String nombre;

			System.out.println("Cómo te llamas?");
			nombre = in.nextLine();

			if (nombre.equals("Carla"))
				System.out.println("Hola Skadi");
			else
				System.out.println("Hola 2ºDAM");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
