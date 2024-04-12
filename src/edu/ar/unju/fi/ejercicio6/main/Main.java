package edu.ar.unju.fi.ejercicio6.main;

import java.util.Scanner;
import java.time.LocalDate;

import edu.ar.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduzca su dni (sin puntos ni guiones): ");
		int dni = scanner.nextInt();
		System.out.println("Introduzca su nombre: ");
		String nombre = scanner.next();
		System.out.println("Introduzca su fecha de nacimiento: ");
		String fechaNacimientoString = scanner.next();
		LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString);
		System.out.println("Introduzca el nombre de su provincia natal.");
		String provincia = scanner.next();
		scanner.close();
		
		
		Persona persona1 = new Persona(dni, nombre, fechaNacimiento, provincia);
		System.out.println(persona1.mostrarDatos());
		
		
		Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
		persona2.setProvincia(provincia);
		System.out.println(persona2.mostrarDatos());
	}

}
