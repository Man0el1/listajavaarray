import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Escreva um algoritmo que Leia 15 nomes de pessoas e armazene-os em um Vetor. Após a digitação do\n" +
                "último nome, imprima-os na sequência contrária (ou seja, o último nome digitado deve ser o primeiro a ser\n" +
                "impresso, etc)");
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[15];
        for (int i = 0; i < nomes.length; i++){
            System.out.printf("Digite o nome %d: ", i + 1);
            nomes[i] = sc.nextLine();
        }
        for (int i = nomes.length - 1; i >= 0; i--){
            System.out.print(nomes[i] + " ");
        }
    }
}
