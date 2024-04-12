package edu.ar.unju.fi.ejercicio8.main;

import java.util.Scanner;

import edu.ar.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un valor númerico: ");
		int n = scanner.nextInt();
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		calculadora.setN(n);
		
		double sumatoria = calculadora.calcularSumatoria();
		System.out.println("La sumatoria de 1 hasta " + n + " es: " + sumatoria);
		double productoria = calculadora.calcularProductoria();
		System.out.println("La productoria de 1 hasta " + n + " es: " + productoria);
		
		scanner.close();
		
	}

}
