import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println(
                "Escreva um algoritmo que leia 8 elementos em um vetor inteiro A. Construa outro vetor B, de mesma\n" +
                        "dimensão de A, com seus elementos sendo a multiplicação do elemento correspondente de A por 3.\n"
                        +
                        "Mostre os elementos de B.");
        Scanner sc = new Scanner(System.in);
        int[] A = new int[8];
        int[] B = new int[8];
        for (int i = 0; i < A.length; i++) {
            System.out.printf("Digite valor %d: ", i + 1);
            A[i] = sc.nextInt();
            B[i] = A[i] * 3;
        }
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        sc.close();
    }
}
