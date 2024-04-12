package edu.ar.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private int dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	public Persona() {
		
	}
	
	public Persona(int dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	

	public Persona(int dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}

	public int calcularEdadPersona() {
		LocalDate actual = LocalDate.now();
		Period periodo = Period.between(this.getFechaNacimiento(), actual);
		int edad = periodo.getYears();
		return edad;
	}
	
	public boolean mayorDeEdad() {
		if(this.calcularEdadPersona() > 18) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String mensajeEdad() {
		if(this.mayorDeEdad() == true) {
			return "La persona es mayor de edad.";
		}
		else {
			return "La persona no es mayor de edad.";
		}
	}
	
	public String mostrarDatos() {
		return this.getNombre() + " de DNI: " + this.getDni() + ", nacido en " + this.getFechaNacimiento() + ", en la provincia de " + this.getProvincia() + ", tiene " + this.calcularEdadPersona() + " años. " + this.mensajeEdad();
	}

	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	
}
