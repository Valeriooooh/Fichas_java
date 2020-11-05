package sessao4;

import java.util.Scanner; 

public class AtividadeA1a {
	static public void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite um número: "); 
		int n1 = sc.nextInt(); 
		
		System.out.println("Digite outro número: "); 
		int n2 = sc.nextInt(); 
		
		if(n1 == n2){
			System.out.println("Os números são iguais");
		}
		if(n1 < n2){
			System.out.printf("%d é maior", n2);
		}else{
			System.out.printf("%d é maior", n1);
		}
	}
}
