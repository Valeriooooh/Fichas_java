package AtividadeX1;

public class g {
    public static void main(String[] args) {
        int [] tabela = {1, 4, 25, 3, 25, 7, 8, 06, 97, 322};
        float sum = 0;

        for (int value:tabela) {
            sum += value;
        }
        System.out.println("A média é: " + sum/10);
    }
}
