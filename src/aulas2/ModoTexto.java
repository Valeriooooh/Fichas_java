package aulas2;

import java.util.Scanner;

public class ModoTexto {
	public static void main(String[] args){
		String linha;
		int num;
		
		Scanner s = new Scanner(System.in); 
		System.out.println("Insira uma frase: ");
		
		linha =  s.nextLine();
		System.out.printf("A frase inserida foi: '%s'\n\n", linha);
		
		System.out.println("Insira uma n�mero"); 
		num = s.nextInt(); 
		System.out.printf("O n�mero inteiro: %d\n", num);
		
		System.out.println("Insira um real: ");
		double num1 = s.nextDouble(); 
		System.out.println("N�mero real: " +num1);
		
		System.out.println("\nInsira um real: "); 
		float num2 = s.nextFloat();
		System.out.println("N�mero real: "+num2); 
		
	}
}
