package edu.ar.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Ingrese un numero entero comprendido entre el rango [5,10]: ");
			numero = scanner.nextInt();
		} while(numero<5 || numero>10);
		
		String[] nombres = new String[numero];
		
		for (int i=0; i<nombres.length; i++) {
			System.out.println("Ingrese un nombre:");
			nombres[i] = scanner.next();
		}
		
		System.out.println("-------------------------");
		System.out.println("Mostrar los nombres ingresados, del primero al último: ");
		
		for(int i=0; i<nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		
		System.out.println("-------------------------");
		
		System.out.println("Mostrar los nombres ingresados, del último al primero");
		
		for(int i=nombres.length-1; i>=0; i--) {
			System.out.println(nombres[i]);
		}
		
		scanner.close();
	}

}
