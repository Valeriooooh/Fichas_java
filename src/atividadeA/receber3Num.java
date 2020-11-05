package atividadeA;

import java.io.*;

public class receber3Num {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int num = 0, soma = 0, i = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Digite 3 números: ");
		
		
		for (i = 0; i <=2; i++){
			num = Integer.parseInt(in.readLine()); 
			soma += num;
		}
		
		System.out.println("A somados números é" + soma);
	}

}
