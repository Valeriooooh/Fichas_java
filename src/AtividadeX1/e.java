package AtividadeX1;

import java.util.Scanner;

public class e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean primo = false;

		while(!primo){

			System.out.println("Digite um  número primo: ");
			num = sc.nextInt();

			int c = 0;
			for (int i = num; i >= 1; i--) {

				if(num % i == 0){
					c++;
				}
			}

			if(c == 2){
				System.out.println("É primo");
				primo = true;
			}else
				System.out.println("Não é primo");

		}
		
	}

}
