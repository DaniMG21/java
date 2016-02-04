package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio7Cb {

	public static void main(String[] args) {
		
		int hh;

		int mm;

		int ss;

		String hh2 = JOptionPane.showInputDialog("Introduzca una hora");

		hh = Integer.parseInt(hh2);

		String mm2 = JOptionPane.showInputDialog("Introduzca unos minutos");

		mm = Integer.parseInt(mm2);

		String ss2 = JOptionPane.showInputDialog("Introduzca unos segundos");

		ss = Integer.parseInt(ss2);
		
		if(( hh < 0 || hh > 23 )||( mm < 0 || hh > 59)||(ss < 0 || ss > 59)){
			
			JOptionPane.showMessageDialog(null, "La hora no es correcta");
			
		}else{
			
			JOptionPane.showMessageDialog(null, "La hora es correcta");
			
		}
		
		

	}

}
