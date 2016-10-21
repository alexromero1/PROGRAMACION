/*Nombre: Notas
 * 
 * ANALISIS
 * Este ejercicio mostrara en pantalla el mensaje de SUSPENSO/APROBADO/BIEN/NOTABLE/SOBRESALIENTE en relacion al 
 * numero introducido.
 * 
 * PG
 * Inicio
 * 	leerVariables
 * 	Mientras (Numero fuera de rango 0-10)
 * 	mostrarMensaje
 * 	
 * Fin
 * 
 * */

import java.io.*;
import java.util.*;

public class Notas{
	public static void main (String[]args){
		
		//Declaracion variables
		int nota;
		Scanner teclado = new Scanner (System.in);
		
		//leerVariables
		System.out.println("Introduce la nota de 0 a 10");
		nota = teclado.nextInt();
		
		//Mientras
		while (nota<0 || nota>10){
			System.out.println("Introduce un numero del 0 al 10");
			nota = teclado.nextInt();
		}
		//mostrarMensaje
		if (nota>0 && nota<5){
			System.out.println("SUSPENSO");
		}
		else{
				
			if (nota>=5 && nota <6){
				System.out.println("APROBADO");
			}
			else{
					
				if (nota >=6 && nota<7){
					System.out.println("BIEN");
				}	
				else{
					
					if(nota >=7 && nota<8){
						System.out.println("NOTABLE");
					}
					else{
							System.out.println("SOBRESALIENTE");
					}
				}
			}
		}
	}
}
