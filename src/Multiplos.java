import java.util.Scanner;

public class Multiplos {
	////metodo main inicia a execuçao do aplicativo java
	public static void main(String[] args) {
		//usado para ler a entrada do usuário a partir do teclado.
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o primeiro número inteiro: ");
		int numero1 = scanner.nextInt();

		System.out.print("Digite o segundo número inteiro: ");
		int numero2 = scanner.nextInt();

		if (numero2 != 0 && numero1 % numero2 == 0) {
			System.out.println(numero1 + " é um múltiplo de " + numero2);
		} else {
			System.out.println(numero1 + " não é um múltiplo de " + numero2);
		}

		scanner.close();
	}// fim do método main
}// fim da classe Multiplos