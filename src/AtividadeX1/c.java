package AtividadeX1;

import java.util.Scanner;

public class c {
	static public void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?: ");
		String nome = sc.nextLine(); 
		
		System.out.println("Qual é o seu sexo?(m/F): "); 
		String sexo = sc.nextLine(); 
		
		System.out.println("Quantos anos tem?: "); 
		int idade = sc.nextInt(); 
		
		System.out.println("Quantos anos tem?: "); 
		int nota = sc.nextInt();
		
		if(sexo.equals("m") || sexo.equals("M")){
			System.out.printf("Olá Sr. %s", nome); 
		}
			
		if(sexo.equals("f") || sexo.equals("F")){
			System.out.printf("Olá Sra. %s", nome); 
		}
		
		if(idade <= 18){
			System.out.println("você é MAIOR de idade");
			
		}else{
			System.out.println("você é Menor de idade"); 
		}
		
		if(nota < 49){
			System.out.println("você é MAIOR de idade");
			
		}else{
			System.out.println("você é MAIOR de idade");
		}
		
		sc.close();
	}
}
