import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		// Crie um objeto Scanner para a entrada do usuário
		Scanner scanner = new Scanner(System.in);

		// Solicite ao usuário que insira o primeiro número inteiro
		System.out.print("Digite o primeiro número inteiro: ");
		int numero1 = scanner.nextInt();

		// Solicite ao usuário que insira o segundo número inteiro
		System.out.print("Digite o segundo número inteiro: ");
		int numero2 = scanner.nextInt();

		// Feche o Scanner, pois não precisaremos mais dele
		scanner.close();

		// Calcule a soma, produto, diferença e quociente
		int soma = numero1 + numero2;
		int produto = numero1 * numero2;
		int diferenca = numero1 - numero2;
		int quociente = numero1 / numero2;

		// Imprima os resultados
		System.out.println("Soma: " + soma);
		System.out.println("Produto: " + produto);
		System.out.println("Diferença: " + diferenca);
		System.out.println("Quociente: " + quociente);
	}
}
