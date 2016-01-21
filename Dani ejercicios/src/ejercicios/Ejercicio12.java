package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio12 {
	
	
	public static void main (String[] args){

		double radio;
		
		double PI = Math.PI;
		
		String s = JOptionPane.showInputDialog("¿Cuál es el radio de la esfera?");
		
		radio = Integer.parseInt(s);
		
		JOptionPane.showMessageDialog(null,"El volumen de la esfera es " + 4/3.0*PI*radio*radio*radio);
	}

}
