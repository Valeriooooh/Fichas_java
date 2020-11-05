package aulas2;

import javax.swing.JOptionPane;
import java.util.*;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero1, numero2;
		System.out.println("Insira dois números: ");
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt(); 
		
		if(numero1 == numero2){
			JOptionPane.showMessageDialog(null,"Os números são iguais");
		}
		
		if(numero1 > numero2){
			JOptionPane.showMessageDialog(null, "O maior número é " +numero1);
			}
		if(numero1 < numero2){
				JOptionPane.showMessageDialog(null, "O maior número é " +numero2);
			}
		
		if(numero1 < numero2){
			JOptionPane.showMessageDialog(null, "O menor número é " +numero1);
		}
		if(numero1 > numero2){
			JOptionPane.showMessageDialog(null, "O menor número é " + numero2);
		}
		
		entrada.close();
}
}