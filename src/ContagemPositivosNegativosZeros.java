import java.util.Scanner;

public class ContagemPositivosNegativosZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Quantidade de números positivos: " + positivos);
        System.out.println("Quantidade de números negativos: " + negativos);
        System.out.println("Quantidade de números iguais a zero: " + zeros);

        scanner.close();
    }
}
