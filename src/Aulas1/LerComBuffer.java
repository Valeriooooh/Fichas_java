package Aulas1;

import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.InputStreamReader;

public class LerComBuffer {
	public static void main(String[] args) throws IOException{
		int num;
		float realF;
		double real;
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in); 
		BufferedReader reader = new BufferedReader(inputStreamReader); 
		
		System.out.println("Digite um número: ");
		num = Integer.parseInt(reader.readLine());
		
		System.out.println("Dgite um número real: ");
		real = Double.parseDouble(reader.readLine());
		
		System.out.println("Digite um número float: "); 
		realF = Float.parseFloat(reader.readLine());
		
		System.out.println("\nInteiro: " + num);
		System.out.println("Real: " + real);
		System.out.println("Float: " + real);
		
		
		System.out.println("A soma dos dois é "+ (num+real));
	}
}
