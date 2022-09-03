package Lista06;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vetor = new int[10];

        List<Integer> NumRepetidos = new ArrayList<>();

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o " + (i + 1) + " numero:");
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            if (!NumRepetidos.contains(vetor[i])){
                for (int j = i + 1; j < vetor.length; j++) {
                    if(vetor[i] == vetor[j]){
                        NumRepetidos.add(vetor[i]);
                        break;
                    }
                }
            }
        }

        System.out.println("Números repetidos: " + NumRepetidos);
    }
}
