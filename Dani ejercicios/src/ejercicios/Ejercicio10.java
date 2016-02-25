package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio10 {


	public static void main (String[] args){


		double b;

		String s = JOptionPane.showInputDialog("¿Cuál es la velocidad en Km/h?" );

		b = Double.parseDouble(s);
		
		
		
		JOptionPane.showMessageDialog(null, "La velocidad en m/s es "+ b * 1000 / 3600.0);



	}

}
