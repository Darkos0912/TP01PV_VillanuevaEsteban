package edu.ar.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresar un numero entero");
		int numIngresado = scanner.nextInt();
		
		if(numIngresado % 2 == 0) {
			int par = numIngresado * 3;
			System.out.println("El número ingresado es par, el triple de su valor es el siguiente: " + par);
		}else {
			int impar = numIngresado * 2;
			System.out.println("El número ingresado es impar, el doble de su valor es el siguiente: " + impar);
		}
	}

}
