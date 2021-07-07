/**
 * Declara Declara Declara dos variables numéricas (con el valor que desees), 
 * muestra por consola la suma, resta, multiplicacion, division y el modulo (Resto de la division).
 * Version 1.0
 * @author Sergio Galimany Hoyo
 */
public class S2Ud4Ej1App {

	public static void main(String[] args) {
		
		// Variables.
		int a = 5;
		double b = 120.65;
		
		// Resultados.
		double suma = a+b;
		double resta = b-a;
		double multiplicacion = a*b;
		double division = b/a;
		double modulo = b%a;
		
		// Printa resultados.
		System.out.println("El valor de a es: " + a + ".");
		System.out.println("El valor de b es: " + b + ".\n");
		System.out.println("La Suma entre a y b es: " + suma + ".");
		System.out.println("La resta entre b y a: " + resta + ".");
		System.out.println("LA multiplicacion entre a y b es: " + multiplicacion + ".");
		System.out.println("La division entre b y a es: " +  division + ".");
		System.out.println("El modulo entre b y a es: " + modulo + ".");

	}

}
