package atividadeB;

import java.io.*;

public class NotaAluno {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		double notaTrab; 
		double notaTeste; 
		double relatorio;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Qual � o seu nome? ");
		String nome = in.readLine();
		
		System.out.println("\nNota do trabalho: ");
		notaTrab = Double.parseDouble(in.readLine());
		
		System.out.println("Nota do teste: ");
		notaTeste = Double.parseDouble(in.readLine());
		
		System.out.println("Nota do Relat�rio do Trabalho Pr�tico: ");
		relatorio = Double.parseDouble(in.readLine());
		
		System.out.printf("Ol� %s \nNota do trabalho: %.2f\nNota do teste %.2f"
				+ "\nNota do Relat�rio %.2f", nome, notaTrab, notaTeste, relatorio);
		
		notaTrab = notaTrab * 0.5;
		notaTeste = notaTeste * 0.3; 
		relatorio = relatorio * 0.2;
		
		double media = notaTeste + notaTrab + relatorio;
		System.out.println("\nA m�dia � " + media);
	}

}
