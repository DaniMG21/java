package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio7C {

	public static void main(String[] args) {
		
		int hh;
		String hh2 = JOptionPane.showInputDialog("Introduzca una hora");
		hh = Integer.parseInt(hh2);
		int mm;
		String mm2 = JOptionPane.showInputDialog("Introduzca unos minutos");
		mm = Integer.parseInt(mm2);
		int ss;
		String ss2 = JOptionPane.showInputDialog("Introduzca unos segundos");
		ss = Integer.parseInt(ss2);
		
		if(( hh < 0 || hh > 23 )||( mm < 0 || hh > 59)||(ss < 0 || ss > 59)){
			
			JOptionPane.showMessageDialog(null, "Es una hora incorrecta"   );
			
		}else{
			
			JOptionPane.showMessageDialog(null, "Son las: " + "\n" + hh + " horas" + "\n" + mm + " minutos" + "\n" + ss + " segundos" + "\n");
			
		}
		
		
		

	}

}
