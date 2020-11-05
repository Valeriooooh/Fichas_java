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
			System.out.printf("%d � primo", n1);
		}
		
		System.out.println(""
				+ "1 - Soma\n"
				+ "2 - Subtra��o\n"
				+ "3 - Multiplica��o\n"
				+ "4 - Divis�o\n"
				+ "5 - Sair");
		
		System.out.print("Resposta: ");
		op = sc.nextInt(); 
		
		System.out.print(numPrimo(n1)); 
		System.out.print(numPrimo(n2));
		
		switch(op){
		case 1:
			System.out.println("\nA soma � "+ n1+n2);
			break;
		case 2: 
			System.out.println("\nA subtra��o � "+ (n1-n2)); 
			break;
		case 3:
			System.out.println("\nA multiplica��o � "+ n1*n2);
			break;
		case 4: 
			System.out.printf("\nA divis�o � %.4f", n1/n2); 
			break; 
		case 5:
			System.out.println("\nVoc� saiu");
			System.exit(0);
			break;
		default:
			System.out.println("Op��o inv�lida");
			
		}
		
		sc.close();
	}
	
	static double numPrimo(double x){
		
		if(x % x == 1 || x % 1 == x){
			System.out.printf("%d � primo", x);
			return x;
			
		}else
			return x;
	}
}
