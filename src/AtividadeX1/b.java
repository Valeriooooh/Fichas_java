package AtividadeX1;

import java.util.Scanner;

public class b {
	static public void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual � o seu nome?: ");
		String nome = sc.nextLine(); 
		
		System.out.println("Qual � o seu sexo?(m/F): "); 
		String sexo = sc.nextLine(); 
		
		if(sexo.equals("m") || sexo.equals("M")){
			System.out.printf("Ol� Sr. %s", nome); 
		}
			
		if(sexo.equals("f") || sexo.equals("F")){
			System.out.printf("Ol� Sra. %s", nome); 
		}
		
		sc.close();
	}
}
