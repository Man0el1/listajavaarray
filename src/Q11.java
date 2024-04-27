import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        System.out.println(
                "Construir um algoritmo que leia um vetor para armazenar os modelos de cinco carros (exemplo: FUSCA,\n"
                        +
                        "GOL, VECTRA, etc). Leia outro vetor com o consumo desses carros, isto é, quantos quilômetros cada um\n"
                        +
                        "desses carros faz com 1 litro de combustível. Calcule e mostre:\n" +
                        "a) O modelo do carro mais econômico.\n" +
                        "b) Quantos litros de combustível cada um dos carros cadastrados consome para percorrer uma distância\n"
                        +
                        "de 1000 quilômetros.");
        Scanner sc = new Scanner(System.in);
        String[] modelos = new String[5];
        float[] consumo = new float[5];
        for (int i = 0; i < modelos.length; i++) {
            System.out.print("Digite o modelo: ");
            modelos[i] = sc.next();
            System.out.print("Digite o consumo: ");
            consumo[i] = sc.nextFloat();
        }
        float maior = consumo[0];
        String nomeMaior = modelos[0];
        for (int i = 1; i < modelos.length; i++) {
            if (consumo[i] > maior) {
                maior = consumo[i];
                nomeMaior = modelos[i];
            }
        }
        System.out.println("A): " + nomeMaior);
        for (int i = 0; i < modelos.length; i++) {
            consumo[i] = (1 / consumo[i]) * 1000;
            System.out.println("Modelo " + modelos[i] + " gasta em litros: " + consumo[i]);
        }
        sc.close();
    }
}
