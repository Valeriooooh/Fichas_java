package atividadeE1;

import java.util.Scanner;

public class Complex {
	static public void main(String[] args){
		String op = ""; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é o seu sexo?(m/F): "); 

		
		while(!op.equals("#")){
			
			op = sc.nextLine(); 
			/*if(op.equals("m") || op.equals("M")){
				System.out.println("Masculino"); 
			}
			
			if(op.equals("f") || op.equals("F")){
				System.out.println("Feminino"); 
			}*/
			
			switch(op)
			{
			case "f":
			case "F":
				System.out.println("Feminino");
				break; 
			case "m":
			case "M":
				System.out.println("Masculino");
				break; 
			
			}
		}
		
		sc.close();
	}
}
