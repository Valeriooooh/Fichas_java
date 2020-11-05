package aulas2;

import java.io.*;

public class Par_impar {
	static public void main(String[] args) throws NumberFormatException, IOException{
		
		int num; 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Digite um número: ");
		num = Integer.parseInt(in.readLine());
		
		if(num % 2 == 0){
			System.out.println("O número é par \nO reasto da divisão é " + num%2);
		}else
			System.out.println("O número é ímpar \nO reasto da divisão é " + num%2);
		
	}
}
