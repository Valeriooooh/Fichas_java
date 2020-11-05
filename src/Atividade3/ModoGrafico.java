package Atividade3;

import javax.swing.JOptionPane;

public class ModoGrafico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome; 
		nome = JOptionPane.showInputDialog("Insira o seu nome: "); 
		String mensagem = "O nome inserido foi "+nome;
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
