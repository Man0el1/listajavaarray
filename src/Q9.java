import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("Escreva um programa que leia 100 números e exiba na tela a média, o maior, o menor, o percentual de\n" +
                "números ímpares e o percentual de múltiplos de 3.");
        int[] num = new int[100];
        int aux = 0, aux2 = 0;
        float calcMedia = 0, quntImpar = 0, quntMult3 = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            num[i] = sc.nextInt();
            if (num[i] % 2 == 1) {
                quntImpar++;
            }
            if (num[i] % 3 == 0) {
                quntMult3++;
            }
        }
        quntImpar /= num.length;
        quntMult3 /= num.length;
        quntImpar *= 100;
        quntMult3 *= 100;
        for (int i = 0; i < num.length; i++) {
            calcMedia += num[i];
        }
        calcMedia /= num.length;
        aux = num[0];
        aux2 = num[0];
        for (int i = 0; i < num.length - 1; i++) {
            if (aux < num[i]) {
                aux = num[i];
            }
            if (aux2 > num[i]) {
                aux2 = num[i];
            }
        }
        System.out.println("Media: " + calcMedia);
        System.out.println("Maior: " + aux);
        System.out.println("Menor: " + aux2);
        System.out.println("Porcentagem de impares: " + quntImpar);
        System.out.println("Porcentagem de multiplos de 3: " + quntMult3);
    }
}
