import java.util.Scanner;

public class CalcularTresNumeros {
	public static void main(String[] args) {
		// Crie um objeto Scanner para a entrada do usuário
		Scanner scanner = new Scanner(System.in);

		// Solicite ao usuário que insira os três números inteiros
		System.out.print("Digite o primeiro número inteiro: ");
		int numero1 = scanner.nextInt();

		System.out.print("Digite o segundo número inteiro: ");
		int numero2 = scanner.nextInt();

		System.out.print("Digite o terceiro número inteiro: ");
		int numero3 = scanner.nextInt();

		// Feche o Scanner, pois não precisaremos mais dele
		scanner.close();

		// Calcule a soma, média e produto
		int soma = numero1 + numero2 + numero3;
		int media = soma / 3;
		int produto = numero1 * numero2 * numero3;

		// Encontre o número menor e o número maior usando uma função auxiliar
		int menor = encontrarMenor(numero1, numero2, numero3);
		int maior = encontrarMaior(numero1, numero2, numero3);

		// Imprima os resultados
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Produto: " + produto);
		System.out.println("Número menor: " + menor);
		System.out.println("Número maior: " + maior);
	}

	// Função auxiliar para encontrar o número menor
	public static int encontrarMenor(int a, int b, int c) {
		int menor = a;

		if (b < menor) {
			menor = b;
		}

		if (c < menor) {
			menor = c;
		}

		return menor;
	}

	// Função auxiliar para encontrar o número maior
	public static int encontrarMaior(int a, int b, int c) {
		int maior = a;

		if (b > maior) {
			maior = b;
		}

		if (c > maior) {
			maior = c;
		}

		return maior;
	}
}