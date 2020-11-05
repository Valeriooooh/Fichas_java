package atividadeE1;

import java.util.Scanner; 

public class E1 {
	static public void main(String[]  args){
		int num =0; 
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Insira um número maior que 5"); 
		
		while(num < 5){
			num = sc.nextInt(); 
		}
	
		sc.close(); 
	}

}
