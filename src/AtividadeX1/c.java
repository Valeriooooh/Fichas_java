package AtividadeX1;

import java.util.Scanner;

public class c {
	static public void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual � o seu nome?: ");
		String nome = sc.nextLine(); 
		
		System.out.println("Qual � o seu sexo?(m/F): "); 
		String sexo = sc.nextLine(); 
		
		System.out.println("Quantos anos tem?: "); 
		int idade = sc.nextInt(); 
		
		System.out.println("Quantos anos tem?: "); 
		int nota = sc.nextInt();
		
		if(sexo.equals("m") || sexo.equals("M")){
			System.out.printf("Ol� Sr. %s", nome); 
		}
			
		if(sexo.equals("f") || sexo.equals("F")){
			System.out.printf("Ol� Sra. %s", nome); 
		}
		
		if(idade <= 18){
			System.out.println("voc� � MAIOR de idade");
			
		}else{
			System.out.println("voc� � Menor de idade"); 
		}
		
		if(nota < 49){
			System.out.println("voc� � MAIOR de idade");
			
		}else{
			System.out.println("voc� � MAIOR de idade");
		}
		
		sc.close();
	}
}
