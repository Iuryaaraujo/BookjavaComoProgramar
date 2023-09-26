
// Figura 2.15: Comparison.java
// Compara inteiros utilizando instruções if, operadores relacionais
// e operadores de igualdade.
import java.util.Scanner; // programa utiliza a classe Scanner

public class Comparison {
	// método main inicia a execução do aplicativo Java
	public static void main(String[] args) {
		// cria Scanner para obter entrada a partir da linha de comando
		Scanner sc = new Scanner(System.in);//leitura da variavel

		int number1; // primeiro número a comparar
		int number2; // segundo número a comparar
        //Insira o primeiro número inteiro:
		System.out.print("Enter first integer: "); // prompt
		number1 = sc.nextInt(); // lê o primeiro número fornecido pelo usuário
        //Insira o segundo número inteiro:
		System.out.print("Enter second integer: "); // prompt
		number2 = sc.nextInt(); // lê o segundo número fornecido pelo usuário
		if (number1 == number2)
			System.out.printf("%d == %d%n", number1, number2);
                //%d inteiro
		if (number1 != number2)
			System.out.printf("%d != %d%n", number1, number2);

		if (number1 < number2)
			System.out.printf("%d < %d%n", number1, number2);

		if (number1 > number2)
			System.out.printf("%d > %d%n", number1, number2);

		if (number1 <= number2)
			System.out.printf("%d <= %d%n", number1, number2);

		if (number1 >= number2)
			System.out.printf("%d >= %d%n", number1, number2);
	} // fim do método main
} // fim da classe Comparison