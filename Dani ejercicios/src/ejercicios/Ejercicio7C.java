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

			String hhs = "" + hh;
			String mms = "" + mm;
			String sss = "" + ss;

			if(hh > 9){
				hhs = "" + hh;



			}else{ 

				hhs = "0" + hh;

			}




			if(mm > 9){

				mms = "" + mm;

			}else{

				mms = "0" + mm;

			}


			if ( ss > 9){

				sss = "" + ss;

			}else{

				sss = "0" + ss;

			}



			JOptionPane.showMessageDialog(null, "Son las : " + "\n" + hhs  + " : " + mms + " : " + sss); 

			//JOptionPane.showMessageDialog(null, "Son las: " + "\n" + hh + " horas" + "\n" + mm + " minutos" + "\n" + ss + " segundos" + "\n");
		}



	}

}
