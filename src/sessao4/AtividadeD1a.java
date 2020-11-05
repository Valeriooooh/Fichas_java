package sessao4;

import java.util.Scanner;

public class AtividadeD1a {
	static public void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		int i=0;
		System.out.println("Selecione um número: "); 
		int num = sc.nextInt(); 
		
		System.out.println("Selecione o número de vezes que quer na tabuada: "); 
		int vezes = sc.nextInt(); 
		
		for( i = 1; i <= vezes; ++i ){
			System.out.printf("%d x %d = %d\n", num, i, (num * i)); 
		}
		
		sc.close(); 
	}
}

