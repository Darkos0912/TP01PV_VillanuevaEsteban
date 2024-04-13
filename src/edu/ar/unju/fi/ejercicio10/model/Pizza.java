package edu.ar.unju.fi.ejercicio10.model;

public class Pizza {
	private int diametro;
	private double precio;
	private double area;
	private boolean iEspeciales;
	
	private final int pizzaPña = 500;
	private final int pizzaMdna = 750;
	private final int pizzaGnde = 1000;
	
	public Pizza() {
		
	}
	
	public double calcularPrecio() {
		double precio = 0;
		
		switch(diametro) {
			case 20:
				precio = (iEspeciales) ? 4500 + pizzaPña : 4500;
				break;
			case 30:
				precio = (iEspeciales) ? 4800 + pizzaMdna : 4800;
				break;
			case 40:
				precio = (iEspeciales) ? 5500 + pizzaGnde : 5500;
				break;
			default:
				System.out.println("El diámetro es inválido");
				break;
		}
		
		return precio;
	}
	
	public double calcularArea() {
		double area = 0;
		area = Math.PI * Math.pow((diametro/2), 2);
		return area;
	}
	
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isiEspeciales() {
		return iEspeciales;
	}
	public void setiEspeciales(boolean iEspeciales) {
		this.iEspeciales = iEspeciales;
	}
	public int getPizzaPña() {
		return pizzaPña;
	}
	public int getPizzaMdna() {
		return pizzaMdna;
	}
	public int getPizzaGnde() {
		return pizzaGnde;
	}
	
	
}
