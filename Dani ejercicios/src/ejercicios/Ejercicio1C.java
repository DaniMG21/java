package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio1C {
	
public static void main (String [] args){
	
	int a;
	
	String b = JOptionPane.showInputDialog("Inserta un número");
	
	a = Integer.parseInt(b);
	
	
	
	if (a >= 0) {
		
		JOptionPane.showMessageDialog(null, b +" es positivo");
		
	} else {
		
		JOptionPane.showMessageDialog(null, b +" es negativo");}
}


}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




