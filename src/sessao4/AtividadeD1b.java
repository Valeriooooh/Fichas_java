package sessao4;

import java.util.Scanner; 

public class AtividadeD1b {
	static public void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		int i=0;
		System.out.println("Selecione um número: "); 
		int num = sc.nextInt(); 
		
		for( i = 1; i <= 10; ++i ){
			System.out.printf("%d x %d = %d\n", num, i, (num * i)); 
		}
		
		sc.close(); 
	}
}
