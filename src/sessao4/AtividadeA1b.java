package sessao4;

import java.util.Scanner; 

public class AtividadeA1b {
	static public void main(String[] args){
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite um n�mero: ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		int n2 = sc.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		int n3 = sc.nextInt();
		

		if(n1 > n2 && n1 > n3){
			System.out.printf("\n%d � o maior n�mero", n1, n2);	
		}
		if(n2 > n1 && n2 > n3){
			System.out.printf("\n%d � o maior n�mero", n2);
		}
		if(n3 > n2 && n3 > n1){
			System.out.printf("\n%d � o maior n�mero", n3);
		}
		
		if(n1 == n2 && n1 == n3){
			System.out.println("\nOs n�meros s�o todos iguais");
		}
		
		sc.close(); 
	}
}
