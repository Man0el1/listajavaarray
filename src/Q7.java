import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamanho do array: ");
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++){
            System.out.printf("Array num %d: ", i + 1);
            a[i] = sc.nextInt();
        }
        int aux = a[0];
        for(int i = 1; i < N; i++){
            if(aux < a[i]){
                aux = a[i];
            }
        }
        System.out.print("Maior numero: " + aux);
    }
}
