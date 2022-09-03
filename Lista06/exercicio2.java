package Lista06;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetor = new int[5];
        int ma = 0, me = 0, soma = 0;
        double med;

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o " + (i + 1) + " numero:");
            vetor[i] = sc.nextInt();
            if (i == 0) {
                ma = vetor[i];
                me = vetor[i];
            } else {
                if (vetor[i] > ma) {
                    ma = vetor[i];
                } else if (vetor[i] < me) {
                    me = vetor[i];
                }
            }
        }
        med = soma / 5;
        for (int i = 0; i < 5; i++) {
            soma = soma + vetor[i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("O maior valor é o: " + ma);
        System.out.println("O menor valor é o: " + me);
        System.out.println("A media dos valores é de: " + med);
    }
}
