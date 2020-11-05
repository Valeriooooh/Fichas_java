package aulas2;

import java.util.Scanner;

public class LerComSanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digete o seu nome: ");
		Scanner s = new Scanner(System.in);
		String nome = s.nextLine();
		System.out.println("Olá "+nome);
		s.close();
	}

}
