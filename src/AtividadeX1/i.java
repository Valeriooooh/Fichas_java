package AtividadeX1;

public class i {
    public static void main(String[] args) {
        int [] tabela = {-4, 1, 4, 25, 3, 25, 7, 8, 06, 97, 322};
        int max = 0;
        int min = 990;

        for (int value:tabela) {

            if(value > max){
                max = value;
            }

            if(min > value){
                min = value;
            }
        }
        System.out.println("O menor valor é " + min);
        System.out.println("O maior valor é " +max);
    }
}
