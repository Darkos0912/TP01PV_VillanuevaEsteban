package edu.ar.unju.fi.ejercicio12.main;

import java.util.Scanner;

import edu.ar.unju.fi.ejercicio12.model.Persona;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Persona persona = new Persona();

		DateFormat formateador = new SimpleDateFormat("dd/M/yy");
		Calendar calendario = new GregorianCalendar();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un nombre: ");
		String nombre = scanner.next();
		persona.setNombre(nombre);
		
		System.out.println("Ingrese el apellido: ");
		String apellido = scanner.next();
		persona.setApellido(apellido);
		
		System.out.println("Ingrese fecha de nacimiento (dd/M/yy): ");
		String fechaNacimientoString = scanner.next();
		
		Date fecha = formateador.parse(fechaNacimientoString);
		calendario.setTime(fecha);
		
		persona.setFechaNacimiento(calendario);
		
		System.out.println("Nombre: " + persona.getNombre() + " " + persona.getApellido());
		System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
		System.out.println("Edad: " + persona.edadPersona());
		System.out.println("Signo de zodíaco: " + persona.signoPersona());
		System.out.println("Estación: " + persona.estacionAñoPersona());
		
		scanner.close();
		
	}

}
