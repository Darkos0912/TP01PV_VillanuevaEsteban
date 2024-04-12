package edu.ar.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private int legajo;
	private double salario;
	
	private final double salarioMinimo = 210000.00;
	private final double aumentoMerito = 20000.00;
	
	public Empleado(String nombre, int legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		
		if(salario>=salarioMinimo) {			
			this.salario = salario;
		}
		if(salario<salarioMinimo) {
			this.salario = this.salarioMinimo;
		}
	}

	public String mostrarDatos() {
		return "Nombre del empleado: " + this.getNombre() + " . Legajo: " + this.getLegajo() + ". Salario $: " + this.getSalario();
	}
	
	public void darAumento() {
		this.setSalario( this.salario + this.aumentoMerito);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalarioMinimo() {
		return salarioMinimo;
	}

	public double getAumentoMerito() {
		return aumentoMerito;
	}
	
	
	
	
}
