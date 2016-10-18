/*Este programa se llama Cilindro2.java
 * 
 * ANALISIS
 * Sirve para calcular el Area lateral, Area total y Volumen del cilindro establecido
 * Formulas utilizadas:
 * 		Area Lateral = 2 * PI * radio * altura
 * 		Area Total = 2 * PI * radio (radio + altura)
 * 		Volumen = PI * radio * radio * altura
 * 
 * PG
 * 	Iniciar
 * 		leerDatos
 * 		calcularAreaLateral
 * 		calcularAreaTotal
 * 		calcularVolumen
 * 	Fin
 * 
 */

import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Cilindro2 {
	public static void main (String[]args){
		
		Scanner teclado = new Scanner (System.in);
		double altura = 0;
		double radio = 0;
		double areaLateral = 0;
		double areaTotal = 0;
		double volumen = 0;
		
		//leerDatos
		System.out.println("Introduce la altura del cilindro");
		altura = teclado.nextDouble();
		System.out.println("Introduce el radio de la base");
		radio = teclado.nextDouble();
		
		//calcularAreaLateral
		if (altura<0 || radio<0){
			System.out.println("Se positivo en la vida");
		}
		else{
			areaLateral = 2 * Math.PI * radio * altura;
			System.out.println("Area lateral: " +areaLateral);
		}
		
		//calcularAreaTotal
		if (altura>0 && radio>0){
			areaTotal = 2 * Math.PI * radio * (altura + radio);
			System.out.println("Area total: " +areaTotal);
		}
			
		//calcularVolumen
		if (altura>0 && radio>0){

			volumen = Math.PI * radio * radio * altura;
			System.out.println("Volumen: " +volumen);
		}
	}
}
