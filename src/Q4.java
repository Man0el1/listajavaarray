import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Escreva um programa que leia 20 números e após o fim da entrada de dados, exiba na tela, primeiro os\n" +
                "elementos com conteúdo ímpar e depois os elementos das posições pares.");
       Scanner sc = new Scanner(System.in);
        int[] num = new int[20];
        for (int i = 0; i < num.length; i++) {
            System.out.printf("Insira numero %d: ", i + 1);
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
