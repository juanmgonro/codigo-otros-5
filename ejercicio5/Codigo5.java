package codigodeotros.ejercicio5;

//Importar la clase scanner
import java.util.Scanner;
//Clase que te indica si el numero introducido es afortunado o no

public class Codigo5 {
	// Agregue el motodo main
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		// Cambie el tipo d scanner a nextInt y el nombre de la variable
		int numero = s.nextInt();
		// comente la variable c
		int mostrarNumero = numero;
		//reenombre las variables
		int afortunado = 0;
		int noAfortunado = 0;

		while (numero > 0) {
			// Quite int de los poarentesis
			int digito = numero % 10;
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afortunado++;
			} else {
				noAfortunado++;
			}
			//Deje esta operacion fuera de las condicionales para que evalue todos 
			//los numeros indivdualmente hasta llegar a este
			numero /= 10;
		}
		//Deje esta condicion fuera del while para que no lo imrima en cada ciclo
		//coloque mayor o igual para eso de la buena suerte, y que el numero de numeros
		//no afortunados al ser igual a los afortunados te den que si lo es
		if (afortunado >= noAfortunado) {
			System.out.println("El " + mostrarNumero + " es un número afortunado.");
		} else {
			System.out.println("El " + mostrarNumero + " no es un número afortunado.");
		}
		//Cerre el scanner
		s.close();
	}
}