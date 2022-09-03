package Lista06;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantNega = 0, soma = 0;
        int [] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o " + (i + 1) + " numero:");
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (vetor[i] < 0) {
                quantNega++;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (vetor[i] > 0) {
                soma = soma + vetor[i];
            }
        }
        System.out.println("Quantidade de numeros negativos: " + quantNega);
        System.out.println("A soma dos numeros positivos desse vetor é: " + soma);
    }
}
