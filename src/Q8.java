import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("Escreva um programa que leia o nome e a idade de 20 pessoas e exiba, após o fim da entrada de\n" +
                "dados, a idade média do grupo e o nome das pessoas com idade acima da média.");
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[20];
        int[] idades = new int[20];
        float calcMedia = 0;
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = sc.next();
            System.out.print("Idade " + (i + 1) + ": ");
            idades[i] = sc.nextInt();
        }
        for (int i = 0; i < nomes.length; i++) {
            calcMedia += idades[i];
        }
        calcMedia /= nomes.length;
        for (int i = 0; i < nomes.length; i++) {
            if (idades[i] > calcMedia){
                System.out.print(nomes[i] + " ");
            }
        }
    }
}
