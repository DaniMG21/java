package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio7 {
	
	public static void main (String[] args){
		
		int a;
		
		String s = JOptionPane.showInputDialog("Dame el valor de a...");
		
		a = Integer.parseInt(s);
		
		
		System.out.println("a vale " + a);
		
		System.out.println("el doble de a vale " + a *2);
		
		System.out.println("el triple de a vale " + a *3);
		
		System.out.println("el cuadrado de a vale " + a *a);
		
		System.out.println("el cubo de a vale " + a *a *a);
		
		
		
		
		
		
		
	}

}
