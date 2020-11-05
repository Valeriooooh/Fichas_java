package AtividadeX1;

import java.util.Scanner; 

public class a {
	static public void main(String[] args){
		double a=0, b=0, c =0; 
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduza a equa��o de segundo grau (ax^2 + bx + c)");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
				
		double formulaMais = (b + Math.sqrt(Math.pow(b, 2) -4*(a*c))) / (2*a);
		double formulaMenos = (b - Math.sqrt(Math.pow(b, 2) -4*(a*c))) / (2*a);
		
		System.out.println("\n"); 
		
		if(formulaMais < formulaMenos){
			System.out.println(formulaMais);
			System.out.println(formulaMenos);
			
		}else{
			System.out.println(formulaMenos);
			System.out.println(formulaMais);
		}
		
		sc.close(); 
	}
}
