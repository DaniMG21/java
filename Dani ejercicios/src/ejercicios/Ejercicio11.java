package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio11 {
	
	
	public static void main (String[] args){
		
		int a;
		int b;
		
		String s = JOptionPane.showInputDialog("¿Cuál es la longitud del primer cateto?");
		
		String z = JOptionPane.showInputDialog("¿Cuál es la longitud del segundo cateto?");
		
		a = Integer.parseInt(s);
		
		b = Integer.parseInt(z);
		
		JOptionPane.showMessageDialog(null,"La hipotenusa es " + Math.sqrt(a*a+b*b));
		
	}

}
