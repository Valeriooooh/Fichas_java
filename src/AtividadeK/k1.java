package AtividadeK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class k1 {
    public static void main(String[] args) throws IOException {   final int TAM_ARRAY=5;      int []valores = new int[TAM_ARRAY];

        System.out.println("Insira valores para o seu Array");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<valores.length;i++)
        {   System.out.println("Insira valor");
            valores[i] = Integer.parseInt(in.readLine());
        }
        for(int j=0; j<valores.length;j++)
        {    if (valores[j]%2==0)    System.out.println(valores[j]);
        }
    }
}
