package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio12C {

	public static void main(String[] args) {

		int n1;
		int n2;
		int n3;
		int n4;
		int n5;

		String n1b = JOptionPane.showInputDialog(null, "Introduzca un número" + "\n" + "(1/5)");
		String n2b = JOptionPane.showInputDialog(null, "Introduzca un número" + "\n" + "(2/5)");
		String n3b = JOptionPane.showInputDialog(null, "Introduzca un número" + "\n" + "(3/5)");
		String n4b = JOptionPane.showInputDialog(null, "Introduzca un número" + "\n" + "(4/5)");
		String n5b = JOptionPane.showInputDialog(null, "Introduzca un número" + "\n" + "(5/5)");

		n1 = Integer.parseInt(n1b);
		n2 = Integer.parseInt(n2b);
		n3 = Integer.parseInt(n3b);
		n4 = Integer.parseInt(n4b);
		n5 = Integer.parseInt(n5b);

		int contador = 0 ;

		if(n1%10 == 2){
			contador++;

		}

		if(n2%10 == 2){
			contador++;

		}

		if(n3%10 == 2){
			contador++;

		}

		if(n4%10 == 2){
			contador++;

		}

		if(n5%10 == 2){
			contador++;

		}

		JOptionPane.showMessageDialog(null,  "Hay " +contador + " numeros acabados en 2");

	}

}
