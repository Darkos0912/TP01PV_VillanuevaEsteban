package edu.ar.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private String codigo;
	private double precio;
	private int descuento;
	
	public Producto() {
		
	}
	
		
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", descuento=" + descuento + "]";
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	public double calcularDescuento() {
		double precioDescuento = 0;
		double precioFinal = precio;
		
		if(descuento > 0 && descuento <= 50) {
			precioDescuento = (precio * descuento) / 100;
			precioFinal = precioFinal - precioDescuento;
		}
		
		if (descuento > 50) {
			System.out.println("Descuento no corresponde");
		}
		
		return precioFinal;
	}
	
}
