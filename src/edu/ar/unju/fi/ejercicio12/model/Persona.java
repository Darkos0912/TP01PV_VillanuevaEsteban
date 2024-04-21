package edu.ar.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private String apellido;
	private Calendar fechaNacimiento;
	
	public Persona() {
		
	}
	
	public int edadPersona() {
		Calendar hoy = Calendar.getInstance();
		
		int añoDif = hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
		int mesDif = hoy.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
		int diaDif = hoy.get(Calendar.DAY_OF_MONTH) - fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		
		if (mesDif < 0 || (mesDif == 0 && diaDif < 0)) {
			añoDif = añoDif - 1;
		}
		return añoDif;
	}
	
	public String signoPersona() {
		int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		int mes = fechaNacimiento.get(Calendar.MONTH);
		
		 if (mes == 0) {
	            if (dia >= 20) {
	                return "Acuario";
	            } else {
	                return "Capricornio";
	            }
	        }
	        if (mes == 1) {
	            if (dia >= 19) {
	                return "Piscis";
	            } else {
	                return "Acuario";
	            }
	        }
	        if (mes == 2) {
	            if (dia >= 21) {
	                return "Aries";
	            } else {
	                return "Piscis";
	            }
	        }
	        if (mes == 3) {
	            if (dia >= 20) {
	                return "Tauro";
	            } else {
	                return "Aries";
	            }
	        }
	        if (mes == 4) {
	            if (dia >= 21) {
	                return "Geminis";
	            } else {
	                return "Tauro";
	            }
	        }
	        if (mes == 5) {
	            if (dia >= 20) {
	                return "Cancer";
	            } else {
	                return "Geminis";
	            }
	        }
	        if (mes == 6) {
	            if (dia >= 22) {
	                return "Leo";
	            } else {
	                return "Cancer";
	            }
	        }
	        if (mes == 7) {
	            if (dia >= 21) {
	                return "Virgo";
	            } else {
	                return "Leo";
	            }
	        }
	        if (mes == 8) {
	            if (dia >= 22) {
	                return "Libra";
	            } else {
	                return "Virgo";
	            }
	        }
	        if (mes == 9) {
	            if (dia >= 22) {
	                return "Escorpion";
	            } else {
	                return "Libra";
	            }
	        }
	        if (mes == 10) {
	            if (dia >= 21) {
	                return "Sagitario";
	            } else {
	                return "Escorpion";
	            }
	        }
	        if (mes == 11) {
	            if (dia >= 21) {
	                return "Capricornio";
	            } else {
	                return "Sagitario";
	            }
	        }
	        return "Signo no encontrado. Fecha inválida";
	}
	
	public String estacionAñoPersona() {
		int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		int mes = fechaNacimiento.get(Calendar.MONTH);
		
		if( (mes==11 && dia>=21) || mes==0 || mes==1 || (mes==2 && dia<20)) {
			return "Verano";
		}
		
		if( (mes==2 && dia >=20) || mes==3 || mes==4 || (mes==5 && dia<21)) {
			return "Otoño";
		}
		
		if( (mes==5 && dia>=21 || mes==6 || mes==7 || (mes==8 && dia<23))) {
			return "Invierno";
		}
		
		if( (mes==8 && dia>=23) || mes==9 || mes==10 || (mes==11 && dia<21)) {
			return "Primavera";
		}
		
		return "No hay estación";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
		
}
