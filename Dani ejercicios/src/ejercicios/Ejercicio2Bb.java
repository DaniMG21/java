package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio2Bb {

	public static void main(String[] args) {
		 
		int resultado = 1;
		
		int z;
		
		int base;
		
		String base2 = JOptionPane.showInputDialog("Introduzca un n�mero");
		
		base = Integer.parseInt(base2);
		
		String y = JOptionPane.showInputDialog(null, "Intoduzca un n�mero");
		
		z = Integer.parseInt(y);
		
		int i = 0;

		while (i < z){
			
			resultado = base * resultado ;
			
			i++;
			
		}
		
		System.out.println(resultado);

	}

}
