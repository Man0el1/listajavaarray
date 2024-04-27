import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println(
                "Leia 20 elementos em um vetor A e construa o vetor B com elementos de A, porém invertidos, ou seja, o\n"
                        +
                        "primeiro elemento de A passa a ser o último elemento de B, e assim por diante. Mostre os 2 vetores, o\n"
                        +
                        "maior elemento do vetor A e o menor elemento do vetor B.");
        Scanner sc = new Scanner(System.in);
        int[] A = new int[20];
        int[] B = new int[20];
        int j = 0, aux;
        for (int i = 0; i < A.length; i++) {
            System.out.print("Insira numero " + (i + 1) + ": ");
            A[i] = sc.nextInt();
        }
        for (int i = 19; i >= 0; i--) {
            B[j] = A[i];
            j++;
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        aux = A[0];
        for (int i = 0; i < A.length - 1; i++) {
            if (aux < A[i]) {
                aux = A[i];
            }
        }
        System.out.println(aux);
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
        aux = B[0];
        for (int i = 1; i < 20 - 1; i++) {
            if (aux > B[i]) {
                aux = B[i];
            }
        }
        System.out.println(aux);
        sc.close();
    }
}
