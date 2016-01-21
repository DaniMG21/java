package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio5C {

	public static void main(String[] args) {
		
		String y = JOptionPane.showInputDialog(null, "Introduce una palabra");
		
	    String z = JOptionPane.showInputDialog(null, "Introduce una palabra");
	    
	    if (y.equals(z)){
	    	
	    	JOptionPane.showMessageDialog(null, "Las palabras introducidas son iguales");
	    	
	    }else{
	    	
	    	JOptionPane.showMessageDialog(null, "Las palabras introducidas no son iguales");
	    	
	    }
		
		
		

	}

}
