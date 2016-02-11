package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio8C {

	public static void main(String[] args) {

		int mes;

		String mes2 = JOptionPane.showInputDialog("Introduzca un número de 1 a 12 referente a un mes");

		mes = Integer.parseInt(mes2);

		if ( mes == 1){

			JOptionPane.showMessageDialog(null, "Este mes es Enero :" + "\n" + "Tiene 31 días" + "\n" + "Este mes corresponde al número 1");

		}else if ( mes == 2){

			JOptionPane.showMessageDialog(null, "Este mes es Febrero :" + "\n" + "Tiene 29 días" + "\n" + "Este mes corresponde al número 2");

		}else if ( mes == 3){

			JOptionPane.showMessageDialog(null, "Este mes es Marzo :" + "\n" + "Tiene 31 días" + "\n" + "Este mes corresponde al número 3");

		}else if ( mes == 4){

			JOptionPane.showMessageDialog(null, "Este mes es Abril :" + "\n" + "Tiene 30 días" + "\n" + "Este mes corresponde al número 4");

		}else if ( mes == 5){


			JOptionPane.showMessageDialog(null, "Este mes es Mayo :" + "\n" + "Tiene 31 días" + "\n" + "Este mes corresponde al número 5");

		}else if ( mes == 6){


			JOptionPane.showMessageDialog(null, "Este mes es Junio :" + "\n" + "Tiene 30 días" + "\n" + "Este mes corresponde al número 6");

		}else if ( mes == 7){

			JOptionPane.showMessageDialog(null, "Este mes es Julio :" + "\n" + "Tiene 31 días" + "\n" + "Este mes corresponde al número 7");

		}else if ( mes == 8){

			JOptionPane.showMessageDialog(null, "Este mes es Agosto :" + "\n" + "Tiene 31 días" + "\n" + "Este mes corresponde al número 8");

		}else if ( mes == 9){


			JOptionPane.showMessageDialog(null, "Este mes es Septiembre :" + "\n" + "Tiene 30 días" + "\n" + "Este mes corresponde al número 9");

		}else if ( mes == 10){


			JOptionPane.showMessageDialog(null, "Este mes es Octubre :" + "\n" + "Tiene 31 días" + "\n" + "Este mes corresponde al número 10");

		}else if ( mes == 11){

			JOptionPane.showMessageDialog(null, "Este mes es Noviembre :" + "\n" + "Tiene 30 días" + "\n" + "Este mes corresponde al número 11");

		}else if ( mes == 12){

			JOptionPane.showMessageDialog(null, "Este mes es Diciembre :" + "\n" + "Tiene 31 días" + "\n" + "Este mes corresponde al número 12" + "\n" + "¡Feliz Navidad");

		}else{

			JOptionPane.showMessageDialog(null, "El número correspondiente a un mes no es correcto");

		}

	}



}
