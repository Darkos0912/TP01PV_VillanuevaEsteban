package edu.ar.unju.fi.ejercicio11;

public class Main {

	public static void main(String[] args) {
		int i = 2;
		int j = 40;
		
		for (;j > 0; j--, i++) {
			int valor = j * i;
            System.out.print(valor + " ");
        }
	}

}