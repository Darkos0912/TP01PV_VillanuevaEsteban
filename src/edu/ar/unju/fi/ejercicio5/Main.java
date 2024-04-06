package edu.ar.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero entero (entre 1 y 9), para sacar su tabla de multiplicar");
		int numIngresado = scanner.nextInt();
		
		if(numIngresado < 1 || numIngresado > 9) {
			System.out.println("El valor ingresado no es correcto, por favor leer bien el mensaje.");
		}
		else {
			for(int i=0; i<=numIngresado; i++) {
				int resultado = numIngresado * i;
				System.out.println(numIngresado + " * " + i + " = " + resultado);
			}
		}
	}
}
