package edu.ar.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;		
		
		do {
			System.out.println("Ingrese un numero entero entre el rango [3,10]: ");
			numero = scanner.nextInt();							
		} while(numero<3 || numero>10);
		
		int[] numeros = new int[numero];
		
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Ingrese un numero entero: ");
			numeros[i] = scanner.nextInt(); 
		}
	
		int suma = 0;
		
		for(int i=0; i<numeros.length; i++) {
			suma = suma + numeros[i];
			System.out.println("El indice " + i + " tiene el valor " + numeros[i]);
		}
		
		System.out.println("La suma de todos los valores ingresados es: " + suma);
		scanner.close();
	}

}
