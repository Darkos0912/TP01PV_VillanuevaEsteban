package edu.ar.unju.fi.ejercicio18.model;

public enum Pais {
	
	ARGENTINA("Argentina",1),BOLIVIA("bolivia",2);
	
	private int codigo;
	private String pais;
	
	public int getCod() {
		return codigo;
	}

	public String getPais() {
		return pais;
	}
	
	private Pais(String pais,int codigo) {
		this.pais =pais;
		this.codigo=codigo;
	}
}
