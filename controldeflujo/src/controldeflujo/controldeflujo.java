package controldeflujo;

import java.util.Scanner;

public class controldeflujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * if(condicion) si se cumple {
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * }
		 * 
		 * 
		 * if(condicion) si se cumple {
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * } else {
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * }
		 * 
		 * if (condicion) si se cumple {
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * }
		 * "si se cumple la concion de else if se ejecuta"
		 * else if(condicion) si se cumple {
		 * }
		 * "si se cumple la concion de else if se ejecuta"
		 * else if(condicion) si se cumple {
		 * 		codigo
		 * 		codigo
		 * 		codigo
		 * }
		 * 
		 * si ninguna condicion se cumple ejecuta ese
		 * else {
		 * 
		 * }
		 */
		
		/*
		 * se le la edad del usuario pór consola, si la edad 
		 * es mayor a 18 años, se muestra al usuario 
		 * que puede votar, en caso contrario se mostrara un mensaje 
		 * indicando que no puede votar 
		 */
		
		Scanner leerEdad = new Scanner(System.in);
		System.out.println("Ingresas tu edad");
		int edad = leerEdad.nextInt();
		String mensaje = votar(edad);
		System.out.println(mensaje);
		
		/*
		 * Escribir un programa que pida el nombre y la edad de un participante
		 si la edad es mayor o igual a 18 y menor o igual a 29, mostrar un
		 mensaje que diga "Felicidades + nombreIngresado, estas aceptado en
		 el programa de generation Java Full Stack".
		 En caso de no cumplirse la condición, mostrar un mensaje que diga
		 "No cumples lo requisitos para el bootcamp Java Full Stack"
         import java.util.Scanner; 
		 */
	}

	public static String votar(int edad) {
		String mensaje = "";
		if(edad >=18) {
			mensaje = "Felicidades puedes votar";
		} else {
			mensaje = "No puedes votar";
		}
		
		return mensaje;
			
		}
	
	}
