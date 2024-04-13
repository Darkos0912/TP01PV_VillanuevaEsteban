package edu.ar.unju.fi.ejercicio9.main;

import java.util.Scanner;

import edu.ar.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		
		while(i<3) {
			Producto producto = new Producto();
			
			System.out.println("Ingrese el nombre del producto: ");
			String nombre = scanner.next();
			producto.setNombre(nombre);
			
			System.out.println("Ingrese el código del producto: ");
			String codigo = scanner.next();
			producto.setCodigo(codigo);
			
			System.out.println("Ingrese el precio del producto: ");
			double precio = scanner.nextDouble();
			producto.setPrecio(precio);
			
			System.out.println("Ingrese el descuento que le asignará al producto (Entre 0 y 50): ");
			int descuento = scanner.nextInt();
			producto.setDescuento(descuento);
			
			
			System.out.println(producto.toString());
			System.out.println("El precio con el descuento asignado es el siguiente: " + producto.calcularDescuento());
			
			i++;
		}
		
		scanner.close();
	}

}
