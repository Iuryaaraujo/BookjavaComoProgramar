import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		//permite a leitura de entrada do usuário
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é Par.");
		} else {
			System.out.println("O número " + numero + " é Ímpar.");
		}

		scanner.close();
	}
}