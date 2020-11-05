package sessao4;

import java.util.Scanner; 

public class AtividadeB1a {
	static public void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		int n1 = sc.nextInt(); 
		
		System.out.println("Isira outro valor: ");
		int n2 = sc.nextInt();
		
		n1 = n1 >= n2 ? n1 : n2;
		
		System.out.printf("O maior valor é %d", n1);
		
		sc.close();
	}
}
