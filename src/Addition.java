import java.util.Scanner;

public class Addition {

	// metodo main inicia a execuçao do aplicativo java
	public static void main(String[] args) {
		//cria um scanner para obter entrada a partir da janela de comando
		Scanner sc = new Scanner(System.in);//leitura da variavel
		
		int number1; //primeiro numero a somar
		int number2; // segundo numero a somar 
		int sum;// soma de number1 e number2
		
		System.out.print("Enter first integer: ");//prompt
		number1 = sc.nextInt();//lé primeiro numero fornecido pelo usuario
		
		System.out.print("Enter second integer: "); // prompt
		number2 = sc.nextInt(); // lê o segundo número fornecido pelo usuário
		
		sum = number1 + number2; // soma os números, depois armazena o total em sum
		
		System.out.printf("Sum is %d%n", sum); // exibe a soma
		sc.close();
		//%n quebra de linha ou /n
		/*
		 * exiber informaçoes em uma janela de comando
		 * system.out.println
		 * system.out.print
		 * system.out.printf
		 */
	}// fim do método main
}// fim da classe welcome1