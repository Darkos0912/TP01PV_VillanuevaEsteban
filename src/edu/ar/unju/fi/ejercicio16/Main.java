package edu.ar.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] listaNombres = new String[5];
		Scanner entrada = new Scanner(System.in);
		
		int nombres = 0;
		int aux;
		byte posicion;
		
		// Ingreso de nombres para almacenarlos en el array listaNombres.
		for (int i=0;i<5;i++) {
			System.out.println("Ingrese un nombre: ");
			listaNombres[i] = entrada.next();
		}
		
		// Impresión de los valores del array con sus posiciones respectivas, para luego corroborar la funcionalidad del programa.
		System.out.println("\nLista de nombres y sus respectivas posiciones:\n");
		while (nombres<=listaNombres.length-1) {
			System.out.println("Posición " + nombres +  ": " + listaNombres[nombres]);
			nombres++;
		}
		
		// Impresión de la longitud del array.
		System.out.println("\nLa longitud del array es: "+listaNombres.length);
		
		
		// Ingreso del indice que referenciará el nombre, del array, a eliminar.
		do {
			System.out.println("\nIngrese la posición del nombre a borrar:");
			posicion = entrada.nextByte();
			
			if (posicion>4 || posicion<0) {
				System.out.println("La posicion que usted ingresó es incorrecta: introduzca los valores comprendidos entre [0,4].");
			}
		}while(posicion>4 || posicion<0);
		
		aux=posicion;

		do {
			if (aux<(listaNombres.length-1)) {
				listaNombres[aux]=listaNombres[aux+1];
				aux++;
			}
			else
				listaNombres[aux]="";
		}while (listaNombres[listaNombres.length-1]!="");
		
		nombres=0;
		
		//Impresión de los valores del array con sus nuevas posiciones respectivas, quedando en blanco el último lugar, dado que los valores se adelantan.
		while (nombres<=listaNombres.length-1) {
			System.out.println("\nPosicion " + nombres + ": " + listaNombres[nombres]);
			nombres++;
		}

	}
}
