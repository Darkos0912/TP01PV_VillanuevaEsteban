package edu.ar.unju.fi.ejercicio10.main;

import java.util.Scanner;

import edu.ar.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = 0;
		int cont = 1;
		
		while(i<3) {
			
			Pizza pizza = new Pizza();
			
			System.out.println("Ingrese el diámetro de la pizza que desee: (20, 30 o 40)");
			int diametro = scanner.nextInt();
			pizza.setDiametro(diametro);
			
			System.out.println("¿Quiere ingredientes especiales? (true o false): ");
			boolean iEspeciales = scanner.nextBoolean();
			pizza.setiEspeciales(iEspeciales);
			
			pizza.setPrecio(pizza.calcularPrecio());
			pizza.setArea(pizza.calcularArea());
			
			if(diametro == 20 || diametro == 30 || diametro == 40) {
				System.out.println("**Pizza " + cont + "**");
				System.out.println("Diametro: " + diametro);
				System.out.println("Ingredientes especiales: " + iEspeciales);
				System.out.println("Precio Pizza: " + pizza.getPrecio());
				System.out.println("Área de la pizza: " + pizza.getArea());
			}
			
			i++;
			cont++;
		}
		
		scanner.close();
	}

}
