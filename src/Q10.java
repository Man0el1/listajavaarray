import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        System.out.println(
                "Escreva um programa que dados dois vetores de 20 números cada, gere um terceiro vetor para\n" +
                        "intercalar os elementos dos dois.");
        Scanner sc = new Scanner(System.in);
        int[] vet1 = new int[20];
        int[] vet2 = new int[20];
        int[] vet3 = new int[vet1.length + vet2.length];
        int aux, ads = 0;
        for (int i = 0; i < vet1.length; i++) {
            System.out.print("Insira dados do vetor 1." + (i + 1) + ": ");
            vet1[i] = sc.nextInt();
        }
        for (int i = 0; i < vet2.length; i++) {
            System.out.print("Insira dados do vetor 2." + (i + 1) + ": ");
            vet2[i] = sc.nextInt();
        }
        for (int i = 0; i < vet3.length / 2; i++) {
            vet3[i] = vet1[i];
        }
        for (int i = vet1.length; i < vet3.length; i++) {
            vet3[i] = vet2[ads];
            ads++;
        }
        for (int i = 0; i < vet3.length - 1; i++) {
            for (int j = 0; j < vet3.length - 1; j++) {
                if (vet3[j] > vet3[j + 1]) {
                    aux = vet3[j];
                    vet3[j] = vet3[j + 1];
                    vet3[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < vet3.length; i++) {
            System.out.print(vet3[i] + " ");
        }
        sc.close();
    }
}