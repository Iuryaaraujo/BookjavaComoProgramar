import java.util.Scanner;

public class ComparandoInteiros {
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

		// Verifique e imprima o número maior ou se eles são iguais
		if (numero1 > numero2) {
			System.out.println(numero1 + " é maior");
		} else if (numero2 > numero1) {
			System.out.println(numero2 + " é maior");
		} else {
			System.out.println("Esses numeros são iguas? ");
		}
	}
}