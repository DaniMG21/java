package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void main (String []args){
		
		
		int radio;
		
		String s = JOptionPane.showInputDialog("¿Cuál es el valor del radio de la circunferencia?");
		
		radio = Integer.parseInt(s);
		
		double z = 2*Math.PI*radio;
		
		
		double x = Math.PI*radio*radio;
		
		
		
		JOptionPane.showMessageDialog(null, "La longitud de la circunferencia es " + z);
		
		JOptionPane.showMessageDialog(null, "El área de la circunferencia es "+ x);
		

	}
}
