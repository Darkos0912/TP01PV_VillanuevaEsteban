package edu.ar.unju.fi.ejercicio13;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[8]; //Declarar array de 8 elementos enteros.
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Ingrese un numero entero: ");
			numeros[i] = scanner.nextInt();
		}
		
		// Mostrar el índice y su valor.
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("El indice es " + i + " y el valor del mismo es " + numeros[i]);
		}
		
		scanner.close();
	}

}
