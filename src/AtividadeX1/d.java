package AtividadeX1;

import java.util.Scanner;

public class d {
	static public void main(String[] args){
		
		Scanner sc = new Scanner(System.in); 
		int op = 0; 
		
		System.out.println("Insira dois valores: "); 
		double n1 = sc.nextDouble(); 
		double n2 = sc.nextDouble(); 
		
		if(n1 % n1 == 1 || n1 % 1 == n1){
			System.out.printf("%d é primo", n1);
		}
		
		System.out.println(""
				+ "1 - Soma\n"
				+ "2 - Subtração\n"
				+ "3 - Multiplicação\n"
				+ "4 - Divisão\n"
				+ "5 - Sair");
		
		System.out.print("Resposta: ");
		op = sc.nextInt(); 
		
		System.out.print(numPrimo(n1)); 
		System.out.print(numPrimo(n2));
		
		switch(op){
		case 1:
			System.out.println("\nA soma é "+ n1+n2);
			break;
		case 2: 
			System.out.println("\nA subtração é "+ (n1-n2)); 
			break;
		case 3:
			System.out.println("\nA multiplicação é "+ n1*n2);
			break;
		case 4: 
			System.out.printf("\nA divisão é %.4f", n1/n2); 
			break; 
		case 5:
			System.out.println("\nVocê saiu");
			System.exit(0);
			break;
		default:
			System.out.println("Opção inválida");
			
		}
		
		sc.close();
	}
	
	static double numPrimo(double x){
		
		if(x % x == 1 || x % 1 == x){
			System.out.printf("%d é primo", x);
			return x;
			
		}else
			return x;
	}
}
