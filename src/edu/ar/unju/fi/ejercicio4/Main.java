package edu.ar.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero entero (entre 0 y 10), para sacar su valor factorial");
		int numIngresado = scanner.nextInt();
		
		if(numIngresado < 0 || numIngresado > 10) {
			System.out.println("El valor ingresado no es correcto, por favor leer bien el mensaje.");
		}
		else if(numIngresado == 0) {
			System.out.println("El valor factorial de 0, siempre será 1");
		}
		else if (numIngresado == 1) {
			System.out.println("El valor factorial de 1, siempre será 1");
		}
		else {
			int factorial = 1;
			int numero = numIngresado;
			while(numero != 0) {
				factorial = factorial * numero;
				numero = numero - 1;
			}
			
			System.out.println("El valor factorial de " + numIngresado + " es: " + factorial);
		}
	}

}
