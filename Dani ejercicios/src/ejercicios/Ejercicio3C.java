package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio3C {
	
	public static void main (String[] args){
		
		int c;
		
		String s = JOptionPane.showInputDialog("Introduzca un número");
		
		
		
		c =	Integer.parseInt(s);
		
		
		String posNeg="";
		String parImpar="";
		String multi5="";
		String multi10="";
		String mayMen="";
		if (c >= 0){
			posNeg="Es positivo";
			JOptionPane.showMessageDialog(null, "Es positivo");
			
		}else{
			posNeg="Es negativo";
			JOptionPane.showMessageDialog(null, "Es negativo");
		}
		
		if (c%2 == 0){
			parImpar="Es par";
			JOptionPane.showMessageDialog(null, "Es par");
			
		}else{
			parImpar="Es impar";
			JOptionPane.showMessageDialog(null, "Es impar");
		}
			
		if (c%5 == 0){
			multi5="Es múltiplo de 5";
			JOptionPane.showMessageDialog(null, "Es múltiplo de 5");
			
		}else{
			multi5="No es múltiplo de 5";
			JOptionPane.showMessageDialog(null, "No es múltiplo de 5");
			
		}
		
		if (c%10 == 0){
			multi10="Es múltiplo de 10";
			JOptionPane.showMessageDialog(null, "Es múltiplo de 10");
		
		}else{
			multi10="No es múltiplo de 10";
			JOptionPane.showMessageDialog(null, "No es múltiplo de 10");
			
		}
		
		if (c >= 100){
			mayMen="Es mayor o igual que 100";
			JOptionPane.showMessageDialog(null, "Es mayor o igual que 100");
			
		}else{
			mayMen="Es menor que 100";
			JOptionPane.showMessageDialog(null, "Es menor que 100");
			
		}
		
		
			JOptionPane.showMessageDialog(null, posNeg + "\n" + parImpar + "\n" + multi5 + "\n" + multi10 + "\n" + mayMen);

	}

}
