package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio2Bb {

	public static void main(String[] args) {
		 
		int resultado = 1;
		
		int z;
		
		int base;
		
		String base2 = JOptionPane.showInputDialog("Introduzca un número");
		
		base = Integer.parseInt(base2);
		
		String y = JOptionPane.showInputDialog(null, "Intoduzca un número");
		
		z = Integer.parseInt(y);
		
		int i = 0;

		while (i < z){
			
			resultado = base * resultado ;
			
			i++;
			
		}
		
		System.out.println(resultado);

	}

}
