package edu.ar.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.ar.unju.fi.ejercicio17.model.Jugador;


public class Main {

	public static void main(String[] args) {
		
		List<Jugador> jugadores = new ArrayList<Jugador>();
		Scanner entrada = new Scanner(System.in);
		
		int op = 0;	
		
		do {
			System.out.println("\nMENÚ");
			System.out.print("Por favor seleccione una opción: ");
			
		    System.out.println("\n 1- Alta de jugador");
		    System.out.println("2- Mostrar datos de un jugador");
		    System.out.println("3- Mostrar jugadores ordenados por apellido");
		    System.out.println("4- Modificar datos de un jugador");
		    System.out.println("5- Eliminar un jugador");
		    System.out.println("6- Mostrar el número total de jugadores");
		    System.out.println("7- Mostrar jugadores por nacionalidad");
		    System.out.println("8- Salir");

			try {	
				op = entrada.nextInt();
				entrada.nextLine();
				
			} catch(InputMismatchException error1) {
		        System.out.println("Error: El valor ingresado tiene que ser un entero.");
		        entrada.nextLine();

			}catch (Exception error2) {
				System.out.println("Error: " + error2.getMessage());
			}
		
		switch (op) {
        case 1:
            altaDelJugador(entrada,jugadores);
            break;
        case 2:
            mostrarJugadores(entrada,jugadores);
            break;
       case 3:
            mostrarApellidoDelJugador(jugadores);
            break;
        case 4:
            modificarJugador(entrada,jugadores);
            break;
        case 5:
            eliminarJugador(entrada,jugadores);
            break;
        case 6:
            System.out.println("\nTotal de jugadores registrados: "+jugadores.size());
            break;
       case 7:
            mostrarNacionalidadDelJugador(entrada,jugadores);
            break;
        case 8:
            System.out.println("Se cerró el menú.");
            break;
        default:
            System.out.println("Opción no válida. Intente nuevamente.");
		}
		}while (op!=8);
		entrada.close();
	}
	
	//Metodos para la ejecucion
	public static void altaDelJugador(Scanner sc,List<Jugador> jugadores){
        try {
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese el apellido del jugador: ");
            String apellido = sc.nextLine();

            System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
            LocalDate fechaNacimiento = LocalDate.parse(sc.nextLine());

            System.out.print("Ingrese la nacionalidad del jugador:");
            String nacionalidad = sc.nextLine();

            System.out.print("Ingrese la estatura del jugador (en cm): ");
            double estatura = sc.nextDouble();

            System.out.print("Ingrese el peso del jugador: ");
            double peso = sc.nextDouble();
            
            int opPos;
            String posicion = "";
            
            do {
            	
                System.out.print("\nSeleccione la posición del jugador: ");
                
                System.out.println("\n1- Delantero");
                System.out.println("2- Medio");
                System.out.println("3- Defensa");
                System.out.println("4- Arquero");  
                opPos  = sc.nextInt();
	            switch(opPos) {
	            	case 1:
	            		posicion ="Delantero";
	            		break;
	            	case 2:
	            		posicion="Medio";
	            		break;
	            	case 3:
	            		posicion="Defensa";
	            		break;
	            	case 4:
	            		posicion="Arquero";
	            		break;
	            	default:
	            		System.out.println("Opción inválida, intente nuevamente");
	            }     		
	         }while (opPos<1 ||opPos>4);

            //Creación del objeto Jugador.
            Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
            jugadores.add(jugador);
            System.out.println("Jugador dado de alta correctamente.");
            
            
        } catch(InputMismatchException e1) {
	        System.out.println("Error: El valor ingresado no es válido.");
	        sc.nextLine();
        } catch (Exception e) {
            System.out.println("Error al dar de alta al jugador: " + e.getMessage());
        }
	}
	
	//Método para mostrar los todos los jugadores
	public static void mostrarJugadores(Scanner entrada,List<Jugador> jugadores){
		try {
			System.out.println("Ingrese el nombre del jugador que quiera buscar: ");
			String nombre = entrada.nextLine();
			
			System.out.println("Ingrese el apellido:");
			String apellido = entrada.nextLine();
			
			//Método que busca el jugador ingresado
			Jugador jugador = buscarJugador(nombre, apellido, jugadores); 
			if (jugador!= null) {
                System.out.println(jugador.toString());
            } else {
                System.out.println("No se pudo encontrar al jugador.");
            }
		}catch(Exception e) {
			System.out.println("No se pudo mostrar el jugador: " + e.getMessage());
		}
	}
	
	//Método para mostrar la lista de jugadores ordenados por apellido.
	public static void mostrarApellidoDelJugador(List<Jugador> jugadores) {
		
		try{
			//Ordena la lista de jugadores por apellido.
			
			Collections.sort(jugadores, (jug1, jug2) -> jug1.getApellido().compareToIgnoreCase(jug2.getApellido()));
			
			System.out.println("Jugadores ordenados por apellido:");
			for (Jugador j : jugadores) {
				System.out.println(j.toString());
			}
		}catch(Exception e){
			System.out.println("Error al cargar y mostrar los jugadores ordenados: " + e.getMessage());
		}	
	}
	
	//Método para modificar los jugadores
	public static void  modificarJugador(Scanner entrada,List<Jugador> jugadores) {
		try {
			
			System.out.println("\nIngrese el nombre del jugador que quiera buscar: ");
			String nombre = entrada.nextLine();
			
			System.out.println("Ingrese el apellido: ");
			String apellido = entrada.nextLine();
			
			//Buscamos el jugador:
			int jugador = buscIndJugador(nombre, apellido, jugadores); 
	
			if (jugador!=-1) {
				System.out.print("Ingrese el nombre del jugador: ");
				jugadores.get(jugador).setNombre(entrada.nextLine());
		
				System.out.print("Ingrese el apellido del jugador: ");
				jugadores.get(jugador).setApellido(entrada.nextLine());
				            
				System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
				jugadores.get(jugador).setFechaNacimiento(LocalDate.parse(entrada.nextLine()));
			
				System.out.print("Ingrese la nacionalidad del jugador: ");
				jugadores.get(jugador).setNacionalidad(entrada.next());
			
				System.out.print("Ingrese la estatura del jugador: ");
				jugadores.get(jugador).setEstatura(entrada.nextDouble());
		
				System.out.print("Ingrese el peso del jugador: ");
				jugadores.get(jugador).setPeso(entrada.nextDouble());
				
				
				int opPosicion;
				String posicion = "";
				
				do {
				System.out.print("Seleccione la posicion del jugador: ");
				
				System.out.println("\n1- Delantero");
				System.out.println("2- Medio");
				System.out.println("3- Defensa");
				System.out.println("4- Arquero");  
				
				opPosicion  = entrada.nextInt();
				
					switch(opPosicion) {
				            	case 1:
				            		posicion = "Delantero";
				            		break;
				            	case 2:
				            		posicion = "Medio";
				            		break;
				            	case 3:
				            		posicion = "Defensa";
				            		break;
				            	case 4:
				            		posicion = "Delantero";
				            		break;
				            	default:
				            		System.out.println("No se pudo ingresar la opcion, intente nuevamente.");
					} 
				}while (opPosicion<1 ||opPosicion>4);
				
				jugadores.get(jugador).setPosicion(posicion);
				System.out.println("Se han modificado los datos.");
			}else {
				System.out.println("Jugador no encontrado.");
			}
		}catch(InputMismatchException error) {
			System.out.println("Error: El valor ingresado es erróneo.");
		    entrada.nextLine();
		    
	    }catch (Exception e) {
	            System.out.println("Error al cargar los datos modificados: " + e.getMessage());
	    }
	}
	
	//Método para eliminar un jugador:
	public static void eliminarJugador(Scanner entrada,List<Jugador>jugadores) {

		try {
			System.out.println("Ingrese nombre del jugador a eliminar: ");
			String nombre = entrada.nextLine();
			
			System.out.println("Ingrese el apellido: ");
			String apellido = entrada.nextLine();
			
			int jugador = buscIndJugador(nombre, apellido, jugadores); 
			
			if (jugador != -1) {
				jugadores.remove(jugador);
				System.out.println("Jugador eliminado");
			}
            else 
            	System.out.println("No se pudo encontrar al jugador");
		}
	    catch (Exception error) {
	        System.out.println("Error al eliminar los datos del jugador: " + error.getMessage());
	    }
	}
	public static void mostrarNacionalidadDelJugador(Scanner entrada,List<Jugador>jugadores){
		
		System.out.println("Ingrese la nacionalidad del jugador: ");
		String nacionalidad = entrada.next();
		
		int cont = 0;
		
		for (int i=0; i<jugadores.size();i++) {
			if(jugadores.get(i).getNacionalidad().equals(nacionalidad))
				cont++;
		}
		
		System.out.println("Existen " + cont + " jugadores de nacionalidad " + nacionalidad);
	}
	 
	// Método para buscar jugadores
	public static Jugador buscarJugador(String nombre, String apellido, List<Jugador>jugadores) {
		Jugador jugadorEncontrado = new Jugador();
		
		try {        	
            for (Jugador jugador : jugadores) {
            	if (jugador.getApellido().equals(apellido) && jugador.getNombre().equals(nombre)) {
            		jugadorEncontrado = jugador;
            	}                
            }
        } catch (Exception error) {
            System.out.println("Error al mostrar los jugadores ordenados: " + error.getMessage());
        }
        return jugadorEncontrado;
		
	}
	
	//Buscar la posicion donde se encuentra el jugador:
	public static int buscIndJugador(String nombre, String apellido, List<Jugador>jugadores) {
		int jug =-1;
            for (Jugador jugador : jugadores) {
            	if (jugador.getApellido().equals(apellido) && jugador.getNombre().equals(nombre)) {
            		jug = jugadores.indexOf(jugador);
            	}                
            }
            return jug;
        } 
	}
