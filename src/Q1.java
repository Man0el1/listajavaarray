public class Q1 {
    public static void main(String[] args) {
        int[] num = new int[]{5, 10, 7, 6, 16, 3, 9, 2, 2, 1};
        int[] resp = new int[7];
        char letra;
        int x = 1, y = 3;
        for (int i = 0; i < num.length; i++) {
            letra = (char) ('A' + i);
            switch (letra) {
                case 'A':
                    resp[i] = x + 1;
                    break;
                case 'B':
                    resp[i] = y + 2;
                    break;
                case 'C':
                    resp[i] = x + 3;
                    break;
                case 'D':
                    resp[i] = x * 4;
                    break;
                case 'E':
                    resp[i] = y * 2;
                    break;
                case 'F':
                    resp[i] = x + y;
                    break;
                case 'G':
                    resp[i] = x + y * 4;
            }
        }
        for (int i = 0; i < resp.length; i++) {
            letra = (char) ('A' + i);
            System.out.printf("%c) ",letra);
            System.out.print(resp[i] + " ");
        }
    }
}