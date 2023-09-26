import java.util.Scanner;

public class MaiorMenorInteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = 0;
        int menor = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");//concatenando
            numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        scanner.close();

        System.out.println("O maior número inteiro é: " + maior);
        System.out.println("O menor número inteiro é: " + menor);
    }
}