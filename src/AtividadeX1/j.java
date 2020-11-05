package AtividadeX1;

import java.util.Scanner;

public class j {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int resp = sc.nextInt();

        for (int i = 1; i <= resp; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%d X %d = ", i, j);
                System.out.print((j*i)+"\n");
            }
        }
        System.out.println();
    }
}
