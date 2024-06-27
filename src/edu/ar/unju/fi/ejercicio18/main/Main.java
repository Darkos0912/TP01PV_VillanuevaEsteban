package edu.ar.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import edu.ar.unju.fi.ejercicio18.model.DestinoTuristico;
import edu.ar.unju.fi.ejercicio18.model.Pais;



public class Main {

	public static void main(String[] args) {
		
		List<DestinoTuristico> destinos = new ArrayList<DestinoTuristico>();
		destinos.add(new DestinoTuristico(1,"Jujuy",500,Pais.ARGENTINA,3));
		destinos.add(new DestinoTuristico(2,"Sucre",1000,Pais.BOLIVIA,8));
		destinos.add(new DestinoTuristico(3,"Rosario",200,Pais.ARGENTINA,2));
		
		Scanner entrada = new Scanner(System.in);
		int op=0;	
		do {
			System.out.println("\nMENÚ");
			System.out.println("Por favor seleccione una opción ");
			
		    System.out.println("\n1- Alta de destino");
		    System.out.println("2- Mostrar todos los destinos");
		    System.out.println("3- Modificar pais de un destino");
		    System.out.println("4- Limpiar vuelos pendientes");
		    System.out.println("5- Eliminar un destino");
		    System.out.println("6- Mostrar destino turisticos en orden alfabetico");
		    System.out.println("7- Mostrar todos los paises");
		    System.out.println("8- Mostrar destinos turisticos hacia un pais");
		    System.out.println("9- Salir");

			try {	
				op=entrada.nextInt();
				entrada.nextLine();
				
			}catch(InputMismatchException error1) {
		        System.out.println("Error: El valor ingresado no es un entero.");
		        entrada.nextLine();

			}catch (Exception error2) {
				System.out.println("Error imprevisto. Motivo: " + error2.getMessage());
			}
		
		
			switch (op) {
				case 1:
					altaDelDestino(entrada,destinos);
					break;
				case 2:
					mostrarDestinos(destinos);
					break;
				case 3:
					modificarPais(entrada,destinos);
					break;
				case 4:
					System.out.println("¿Esta seguro que desea borrar todos los destinos? (Responda con S o N)");
					char respuesta = entrada.next().charAt(0);
					if(respuesta=='S')
						destinos.clear();
					break;
				case 5:
					eliminarDestino(entrada,destinos);
					break;
				case 6:
					mostrarDestinoAlf(destinos);
					break;
				case 7:
					mostrarPaises(destinos);
					break;
				case 8:
					mostrarDestinoPorPais(entrada,destinos);
					break;
				case 9:
					System.out.println("Se cerró el menú");
					break;
				default:
					System.out.println("Opción no válida. Intente nuevamente.");
			}
		} while (op != 9);
		
		entrada.close();
	}
	
	//Método para dar de alta un destino
	public static void altaDelDestino(Scanner entrada,List<DestinoTuristico> destinos) {
        System.out.print("Ingrese el código de su viaje: ");
        int codigo = entrada.nextInt();
		
		System.out.print("Ingrese el nombre del destino: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Ingrese el precio de su viaje: ");
        double precio = entrada.nextDouble();
        
        System.out.print("Ingrese la cantidad de días de su viaje: ");
        int dias = entrada.nextInt();
        
        System.out.print("Ingrese codigo del pais al que viaja: ");
        int codP = entrada.nextInt();
        
        if (codP==Pais.ARGENTINA.getCod())
        	 destinos.add(new DestinoTuristico(codigo,nombre,precio,Pais.ARGENTINA,dias));
        else
        	 destinos.add(new DestinoTuristico(codigo,nombre,precio,Pais.BOLIVIA,dias));
	
	}
	
	//Método para mostrar los destinos:
	public static void mostrarDestinos(List<DestinoTuristico> destinos) {
		try {
			System.out.println("\nLista de los destinos disponibles:");
			for (DestinoTuristico destinoTuristico : destinos) {
				System.out.println(destinoTuristico.toString());
			}
		}catch(Exception error) {
			System.out.println("Error al mostrar los destinos: " + error.getMessage());
		}finally {
			System.out.println("Recursos cerrados");
		}
	}
	
	//Método para modificar el pais:
	public static void modificarPais(Scanner entrada,List<DestinoTuristico> destinos) {
		try {
			System.out.println("Ingrese código del destino del Pais a modificar: ");
			int codigo = entrada.nextInt();
			int bdes = buscarDestino(codigo, destinos);
			
			if (bdes != -1) {
				System.out.println("Actualmente el pais del destino es: " + destinos.get(bdes).getPais() + "\nSeleccione a cuál desea cambiar\n");
			    System.out.println("1- Argentina");
			    System.out.println("2- Bolivia");
			    
				int codpa =entrada.nextInt();
				Pais pais = null;
				
				switch(codpa){
					case 1:
						pais = Pais.ARGENTINA;
						break;
					case 2:
						pais =Pais.BOLIVIA;
						break;
					default:
						System.out.println("No hay paises que tengan el código que se ingresó");
				}
				destinos.get(bdes).setPais(pais);
			}
			else
				System.out.println("No hay destinos que tengan el código que se ingresó");	
		}
		catch(InputMismatchException error) {
			System.out.println("Error: El valor a ingresar debe ser un numero entero: " + error.getMessage() );
		}
		catch(Exception e){
			System.out.println("Error al modificar el pais: " + e.getMessage());
		}
		finally {
			System.out.println("Recursos cerrados");
		}
		
	}
	
	//Método para eliminar un destino:
	public static void eliminarDestino(Scanner entrada, List<DestinoTuristico> destinos) {
		System.out.println("Ingrese Codigo del destino que quiera eliminar");
		try {
			
			int codigo = entrada.nextInt();
			Iterator<DestinoTuristico> itTuristico = destinos.iterator();
			
			while (itTuristico.hasNext()) {
				DestinoTuristico destino = itTuristico.next();
				
				if (destino.getCodigo()==codigo){
					itTuristico.remove();
					System.out.println("El destino se borró");	
				}
			}
		}
		catch(InputMismatchException error) {
			System.out.println("Error: El valor a ingresar debe ser un numero entero: " + error.getMessage());
		}
		catch(Exception e){
			System.out.println("Error al eliminar el destino seleccionado: " + e.getMessage());
		}
		finally {
			System.out.println("Recursos cerrados");
		}


	}
	
	//Método para mostrar destinos
	public static void mostrarDestinoAlf(List<DestinoTuristico> destinos) {
		Collections.sort(destinos, (j1, j2) -> j1.getNombre().compareToIgnoreCase(j2.getNombre()));
		for (DestinoTuristico destinoTuristico : destinos) {
			System.out.println(destinoTuristico.toString());
		}
	}
	
	//Mostrar los paises.
	public static void  mostrarPaises(List<DestinoTuristico> destinos) {
		int cont=1;
		for (DestinoTuristico destinoTuristico : destinos) {
			System.out.println("Pais de destino " + cont + ": " + destinoTuristico.getPais());
			cont++;
		}
	}
	
	//Mostrar los destinos por pais:
	public static void mostrarDestinoPorPais(Scanner entrada, List<DestinoTuristico> destinos) {
		System.out.println("Ingrese el codigo del pais que desea ver los destinos");
		try {
			int op = entrada.nextInt();
			switch(op){
				case 1:
					for (DestinoTuristico destinoTuristico : destinos) {
						if(destinoTuristico.getPais().getCod() == 1) {
							System.out.println(destinoTuristico.toString());
						}
					}
					break;
				case 2:
					for (DestinoTuristico destinoTuristico :destinos) {
						if(destinoTuristico.getPais().getCod() == 2) {
							System.out.println(destinoTuristico.toString());
						}
					}
					break;
				default:
					System.out.println("No hay destinos en ese pais en estos momentos");
					break;
				}
			}catch(InputMismatchException error) {
				System.out.println("Error: El valor a ingresar debe ser un numero entero: " + error.getMessage());
			}
			catch(Exception e){
				System.out.println("Error al seleccionar pais: " + e.getMessage());
			}
			finally {
				System.out.println("Recursos cerrados");
			}
		
		}
	
	//Buscar destinos:
	public static int buscarDestino(int codigo, List<DestinoTuristico> destinos) {
		int ind = -1;
            for (DestinoTuristico destinoTuristico : destinos) {
            	if (destinoTuristico.getCodigo() == codigo)  {
            		ind = destinos.indexOf(destinoTuristico);
            	}                
            }
            return ind;
        } 

}
