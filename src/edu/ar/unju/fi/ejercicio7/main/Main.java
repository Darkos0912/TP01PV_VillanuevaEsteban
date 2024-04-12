package edu.ar.unju.fi.ejercicio7.main;

import java.util.Scanner;

import edu.ar.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresar el nombre del empleado: ");
		String nombre = scanner.next();
		System.out.println("Ingresar el legajo del empleado: ");
		int legajo = scanner.nextInt();
		System.out.println("Ingresar el salario del empleado: ");
		double salario = scanner.nextDouble();
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
		System.out.println(empleado.mostrarDatos());
		
		empleado.darAumento();
		
		System.out.println(empleado.mostrarDatos());
		
	}

}
