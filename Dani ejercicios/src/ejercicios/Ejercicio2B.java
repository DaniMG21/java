package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio2B {

	public static void main(String[] args) {


		int x;
		int b=-1;

		String y = JOptionPane.showInputDialog(null, "Introduzca un n�mero y le mostrara la tabla de multiplicar de ese n�mero");

		x = Integer.parseInt(y);

		while( b < 10){
			
			b++;
			
			System.out.println(x + "*" + b + "=" +  x*b);
			
		}

	}


}


