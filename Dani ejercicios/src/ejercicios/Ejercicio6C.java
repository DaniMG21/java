package ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio6C {

	public static void main(String[] args) {



		String z = JOptionPane.showInputDialog("Introduzca un n�mero");

		int n = Integer.parseInt(z);

		String y = JOptionPane.showInputDialog("Introduzca un n�mero");

		int n2 = Integer.parseInt(y);

		String x = JOptionPane.showInputDialog("Introduzca un n�mero");

		int n3 = Integer.parseInt(x);

		
		
		int elMayor = 0;
		
		
		if(n > elMayor){
			elMayor = n;
		}
		if(n2 > elMayor){
			elMayor = n2;
		}
		if(n3 > elMayor){
			elMayor = n3;
		}
		
		
		JOptionPane.showMessageDialog(null, elMayor + " es el n�mero m�s grande");
		
		
		
		
		/*
		if ( n > n2 && n > n3){

			JOptionPane.showMessageDialog(null, n + " es el n�mero m�s grande");

		}else{

			if(n2 > n && n2 > n3){

				JOptionPane.showMessageDialog(null, n2 + " es el n�mero m�s grande");

			}else{

				if(n3 > n && n3 > n2){

					JOptionPane.showMessageDialog(null, n3 + " es el n�mero m�s grande");

				}else{

					if(n == n2 && n == n3){

						JOptionPane.showMessageDialog(null,"Todos los n�meros son iguales");

					}else{

						if(n == n2){

							JOptionPane.showMessageDialog(null,"El primer y el segundo n�mero introducido son iguales y los de mayor valor");

						}else{

							if(n == n3){

								JOptionPane.showMessageDialog(null,"El primer y tercer numero son iguales y los de mayor valor");

							}else{

								if(n2 == n3){

									JOptionPane.showMessageDialog(null,"El segundo y tercer n�mero son iguales son iguales y son los de mayor valor");

								}

							}

						}

					}
				}

			}


		}*/


	}

}











