package ejercio01;

import java.util.Scanner;
/*
 * Hacer un programa que pida al usuario que introduzca 
 * una frase por pantalla, y muestre por pantalla cuántas vocales 
 * hay en el texto.
 */
public class Ejercicio01 {
	
	public static boolean esVocal(char car) {
		// Implementamos diferentes lógicas para comprobar si es vocal
		boolean es_vocal = false;
		
		System.out.println("Estamos en método esVocal.");
		if (true) es_vocal = true;
		 // No me gusta nada
		return es_vocal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cadena = "";
		int numeroVocales = 0;
		
		System.out.println("Por favor, introduce la cadena de texto: ");
		cadena = sc.nextLine();
		for (int i=0; i<cadena.length(); i++) {
			if (esVocal(cadena.charAt(i)))
					numeroVocales ++;
		}
			
		System.out.println("El número de vocales es: " + numeroVocales);
		
		sc.close();
		System.out.println("Bye.");
		
	}

}
