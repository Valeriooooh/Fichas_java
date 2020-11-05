package atividadeB;

import java.io.*; 

public class MedidasRetangulo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		double comp; 
		double larg; 

		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Digite o comprimeto: ");
		comp = Double.parseDouble(in.readLine());
		
		System.out.println("Digite a largura: ");
		larg= Double.parseDouble(in.readLine());
		
		double area = comp*larg;
		double perimetro = 2*comp+2*larg;
		
		System.out.println("A aréa do retângulo é de " + Math.round(area));
		System.out.println("O perímetro do retângulo é de "+ Math.round(perimetro));
	}
	

}
