package Aulas1;

import java.util.Scanner;

public class LerComScanner {
	public static void main(String[] args){
		
		System.out.println("Qual é o seu nome?: ");
		
		Scanner scanIn = new Scanner(System.in); 
		String nome = scanIn.nextLine();
		
		System.out.printf("Olá %s", nome);
		
	}
}
