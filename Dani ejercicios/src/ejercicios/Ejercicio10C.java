package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio10C {

	public static void main(String[] args) {

		double n1;
		double n2;
		
		String n1b = JOptionPane.showInputDialog("Introduzca un n�mero");
		String n2b = JOptionPane.showInputDialog("Introduzca un n�mero");
		
		n1 = Double.parseDouble(n1b);
		n2 = Double.parseDouble(n2b);
		
		if(n2 == 0){
			
			JOptionPane.showMessageDialog(null, "No se puede dividir un n�mero entre 0");
			
		}else{
			
			JOptionPane.showMessageDialog(null, "El resultado de la divisi�n de: " + "\n" + n1 + " / " + n2 + " = " + n1/n2) ;
			
		}
		
		
	}

}
