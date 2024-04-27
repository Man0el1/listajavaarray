import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Escreva um algoritmo que Leia 10 " +
                "valores inteiros e armazene-os em um Vetor.\n" +
                "Após a digitação do último valor, imprima " +
                "os elementos com conteúdo par.");
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            System.out.printf("Insira numero %d: ", i + 1);
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }
        sc.close();
    }
}
