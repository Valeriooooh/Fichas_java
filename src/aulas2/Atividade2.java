package aulas2;

import javax.swing.JOptionPane;
import java.util.*;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Insira dois n�meros: ");
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt(); 
		
		if(numero1 == numero2){
			JOptionPane.showMessageDialog(null,"Os n�meros s�o iguais");
		}
		
		if(numero1 > numero2){
			JOptionPane.showMessageDialog(null, "O maior n�mero � " +numero1);
			}
		if(numero1 < numero2){
				JOptionPane.showMessageDialog(null, "O maior n�mero � " +numero2);
			}
		
		if(numero1 < numero2){
			JOptionPane.showMessageDialog(null, "O menor n�mero � " +numero1);
		}
		if(numero1 > numero2){
			JOptionPane.showMessageDialog(null, "O menor n�mero � " + numero2);
		}
		
		entrada.close();
}
}