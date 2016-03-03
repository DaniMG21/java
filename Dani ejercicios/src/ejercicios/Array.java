package ejercicios;

import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {

		/*int a = 0;

		String b = JOptionPane.showInputDialog(null, "Introduzca un número");

		a = Integer.parseInt(b);

		while (a != 7){

			b = JOptionPane.showInputDialog("Introduzca un número");
			a = Integer.parseInt(b);

		}*/


		int numElementos = 5;
		int[] miArray = new int[numElementos];

		int puntero = 0;
		while(puntero < numElementos){
			int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un número"));
			miArray[puntero] = a;
			puntero++;
		}


		double media = 0;
		double suma = 0;

		int maximo = 0;
		int minimo = Integer.MAX_VALUE;

		puntero = 0;
		while(puntero < numElementos){
			suma = suma + miArray[puntero];
			System.out.println("El elemento " + puntero + " es: " + miArray[puntero]);
			puntero++;
		}





		///////////////////
		puntero = 0;

		while( puntero < numElementos){

			if( maximo < miArray[puntero]){

				maximo = miArray[puntero];

			}
			puntero++;
		}

		puntero = 0;

		while( puntero < numElementos){

			if( minimo > miArray[puntero]){

				minimo = miArray[puntero];

			}
			puntero++;
		}

		///////////////////


		media = suma / numElementos;

		System.out.println("La suma es: " + suma);
		System.out.println("La media es: " + media);
		System.out.println("El maximo es: " + maximo);
		System.out.println("El minimo es: " + minimo);



	}

}
