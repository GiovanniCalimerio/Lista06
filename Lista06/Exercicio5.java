package Lista06;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetor = new int[5];
        int codigo;
        int j = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira o " + (i + 1) + " numero:");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Informe um código : ");
        codigo = sc.nextInt();
        if(codigo == 0) {
            sc.close();
        } else if (codigo == 1) {
            for (int i = 0; i < vetor.length; i++) {
                System.out.println("Vetor[" + i + "] = " + vetor[i]);
            }
        } else if (codigo == 2) {
            for (int i = 4; i >= 0; i--) {
                System.out.println("Vetor[" + (j) + "] = " + vetor[i]);
                j++;
            }
        } else {
            System.out.println("Código é inválido!");
        }
    }
}
