package ejercicios;

import javax.swing.JOptionPane;

public class ParImpar {
	
	public static void main (String[]args){
		
		int a;
		
		String s = JOptionPane.showInputDialog("Introduzca un número");
		
		a = Integer.parseInt(s);
		
		if (a%2 == 0){
			JOptionPane.showMessageDialog(null, "Es par");
		}else {
			JOptionPane.showMessageDialog(null, "Es impar");
		}
	}

}
