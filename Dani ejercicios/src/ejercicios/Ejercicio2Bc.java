package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio2Bc {



	public static void main(String[] args) {

		int result;
		int result2;
		
		String resultb = JOptionPane.showInputDialog("Introduzca un número");
		String resultb2 = JOptionPane.showInputDialog("Introduzca un número");
		
		result = Integer.parseInt(resultb);
		result2 = Integer.parseInt(resultb2);
		
		int i = 0;
		int solucion = 0;
		
		while(solucion > i){
			
			solucion = result * result2;
			
			System.out.println(solucion);
			
		}
		
		
		
		
		
		
		
	}
}		