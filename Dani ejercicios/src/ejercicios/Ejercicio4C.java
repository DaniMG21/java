package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio4C {

	public static void main(String[] args) {
		
		
		String s = JOptionPane.showInputDialog("Introduzca un caracter");
		
		char a = s.charAt(0);
		
		if (a >= 97){
			
			JOptionPane.showMessageDialog(null, "Este caracter es min�scula");
			
		}else{
			
			JOptionPane.showMessageDialog(null, "Este caracter es May�scula");
			
		}
		
		
		
		
		
		
		


	}

}
