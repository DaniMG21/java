package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio8 {
	
	public static void main (String[] args){
		
		int a;
		
		
		double f;
	
		String s = JOptionPane.showInputDialog("Grados centigrados");

		a = Integer.parseInt(s);
		
		//System.out.println(s);
		
		f = 32 + ( 9*a / 5.0);
		
		System.out.println(f);
		
		
		
		
	}
}
