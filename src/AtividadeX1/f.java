package AtividadeX1;

import java.util.Scanner;

public class f {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String op;

            System.out.println("Insira dois valores: ");
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            System.out.println(""
                    + "[1] - Soma\n"
                    + "[2] - Subtração\n"
                    + "[3] - Multiplicação\n"
                    + "[4] - Divisão\n"
                    + "[--] - Sair");

            System.out.print("Resposta: ");
            op = sc.nextLine();

        switch (op) {
            case "1" -> System.out.println("\nA soma é " + (n1 + n2));
            case "2" -> System.out.println("\nA subtração é " + (n1 - n2));
            case "3" -> System.out.println("\nA multiplicação é " + (n1 * n2));
            case "4" -> System.out.printf("\nA divisão é %.4f", (n1 / n2));
            case "--" -> {
                System.out.println("\nVocê saiu");
                System.exit(0);
            }
            default -> System.out.println("Opção inválida");
        }

            sc.close();
    }

}
