package Main;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import pojos.Alumno;
import pojos.Streams;

public class Main {
	
	public static void main(String[] args) {
		
//	1.			
//		List<Alumno> alumnos = Streams.getAlumnos();
//		alumnos.stream()
//		.forEach(e -> System.out.println(e))
//		.forEach(System.out.println::println);
	
//	2.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		alumnos.stream()
//			.filter(e -> e.getNombre().startsWith("L") || e.getNombre().startsWith("G"))
//			.forEach(e -> System.out.println(e));
		
//	3.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		System.out.println(alumnos.stream().count());
		
//	4.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		alumnos.stream()
//			.filter(e -> e.getNota() > 9 && e.getNombreCurso().equals("PHP"))
//			.forEach(System.out::println);
		
//	5.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		alumnos.stream()
//			.limit(5)
//			.forEach(e -> System.out.println(e));
		
//	6.	
//		List<Alumno> alumnos = Streams.getAlumnos();
//		int edadMaxima = alumnos.stream()
//			.mapToInt(Alumno::getEdad)
//			.max()
//			.orElse(0);
//		System.out.println(edadMaxima);
//		alumnos
//			.stream()
//			.filter(e -> e.getEdad() == edadMaxima)
//			.forEach(System.out::println);
	
//	7.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		System.out.println(alumnos.stream().findFirst());
		
// 	8.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		alumnos.stream()
//			.filter(a -> a.getNombreCurso().endsWith("t"));
//		forEach(System.out::println);
		
//	9.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		alumnos.stream()
//			.filter(a -> a.getNombreCurso().contains("a"))
//			.forEach(System.out::println);
	
//	10.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		String[] nombres = alumnos.stream()
//			.map(Alumno::getNombre)
//			.toArray(String[]::new);
//		
//		for(String nombre: nombres)
//			System.out.println(nombre);
		
//	11.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		String[] nombresCompletos = alumnos.stream()
//			.map(a -> a.getNombre() + " " + a.getApellidos())
//			.sorted()
//			.toArray(String[]::new);
//		for(String nombre: nombresCompletos)
//			System.out.println(nombre);
	
//	12.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		boolean existe = alumnos.stream()
//			.anyMatch(a -> a.getNota() == 10);
//		System.out.println(existe);
	
//	13.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		boolean existe = alumnos.stream()
//			.anyMatch(a -> a.getNota() > 9 && a.getNombreCurso().equals("PHP"));
//		System.out.println(existe);
		
//	14.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		boolean todosAprobados = alumnos.stream()
//			.allMatch(a -> a.getNota() >= 5);
//		System.out.println(todosAprobados);
		
//	15.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		boolean ningunoSuspenso = alumnos.stream()
//			.allMatch(a -> a.getNota() < 5);
//		System.out.println(ningunoSuspenso);
		
// 	16.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		String[] palabras = alumnos.stream()
//			.map(a -> a.getNombre() + " " + a.getApellidos())
//			.flatMap(nombreCompleto -> Arrays.stream(nombreCompleto.split(" "))
//			.distinct()
//			.collect(Collector.toList());
		
	}
}
