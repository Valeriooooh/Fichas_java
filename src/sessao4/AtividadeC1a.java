package sessao4;

import java.util.Scanner; 

public class AtividadeC1a {
	static public void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("m ou f"); 
		String op = sc.nextLine(); 
		
		switch(op){
		case "m": 
			System.out.println("Masculino");
			break; 
			
		case "f": 
			System.out.println("Femenino");
			break; 
		default:
			System.out.println("Opção inválida"); 
		}
		
		sc.close();
	}
}
