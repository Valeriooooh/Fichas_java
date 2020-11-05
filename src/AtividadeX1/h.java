package AtividadeX1;

import java.util.Scanner;

public class h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int op = 0;

        System.out.println("Insira um número para saber o fatorial");
        int resp = sc.nextInt();

        for (int i = resp-1; i > 0; i--) {
            resp *= i;
            //op = i;
        }

        System.out.println("A resposta é " + resp);
    }
}
