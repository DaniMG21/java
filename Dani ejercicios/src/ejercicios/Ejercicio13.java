package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main (String[] args){
		
		int a ;
		
		String s = JOptionPane.showInputDialog("Introduce un número de 3 cifras");
		
		a = Integer.parseInt(s);
		
		int centenas = a/100;
		
		
		JOptionPane.showMessageDialog(null,"La primera cifra es " + centenas );
		
		int decenas =a/10-centenas*10;
		
		JOptionPane.showMessageDialog(null, "La segunda cifra es " + decenas);
		
		int unidades =a-(centenas*100+decenas*10);
		
		JOptionPane.showMessageDialog(null, "La tercera cifra es " + unidades);
		
		
		
		
		
	}

}
