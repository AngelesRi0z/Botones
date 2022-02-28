package botones;

import java.awt.*;
import java.applet.Applet;



public class meGusta {
	public static void main(String[] args) {
		int[] lista = new int[100]; // Lista de números enteros que supondremos
									
		int contador = 0; // Declaramos e inicializamos el contador.

		for (int i = 0; i < 100; i++)
			if (lista[i] > 100)
				contador++; // Incrementamos el contador si corresponde

	
		System.out.println( contador +"Me gustan");
	}
}


