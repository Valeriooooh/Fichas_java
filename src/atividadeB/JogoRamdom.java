package atividadeB;

import java.util.Scanner; 

public class JogoRamdom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0, tentativas = 0;
		Scanner sc = new Scanner(System.in); 
		
		double num = Math.random(); 
		int RandomNum = (int)(1 + (num * (100-1))); 
		
		for(i = 0; i <= 3; i++){
			//System.out.println(RandomNum);
			
			System.out.println("Insira um número: ");
			int resposta = sc.nextInt(); 
			
			if(RandomNum < resposta){
				System.out.println("O número inserido é superior"); 
				tentativas++; 
			}
			
			if(RandomNum > resposta){
				System.out.println("O número inserido é inferior"); 
				tentativas++; 
			}
			
			if(RandomNum == resposta){
				System.out.println("PARABÉNS você acertou!!");
				System.out.printf("Teve %d tentativas", tentativas);
				break; 
			}
			
			if(i == 3){
				System.out.println("As tentativas acabaram");
			}
		}
		
		sc.close();
	}

}
