
// Exercício 2.6: Product.Java
// Calcula o produto de três inteiros.
import java.util.Scanner; // programa utiliza Scanner

public class Product {
	public static void main(String[] args) {
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
        //Declarando as variasveis
		int x; // primeiro número inserido pelo usuário
		int y; // segundo número inserido pelo usuário continua

		int z; // terceiro número inserido pelo usuário
		int result; // produto dos números
        //d) Solicite que o usuário insira o primeiro inteiro
		System.out.print("Enter first integer: "); // solicita entrada
		x = input.nextInt(); // lê o primeiro inteiro
        //g) Leia o segundo inteiro digitado pelo usuário e armazene-o na variável y
		System.out.print("Enter second integer: "); // solicita entrada
		y = input.nextInt(); // lê o segundo inteiro
        //i) Leia o terceiro inteiro digitado pelo usuário e armazene-o na variável z.
		System.out.print("Enter third integer: "); // solicita entrada
		z = input.nextInt(); // lê o terceiro inteiro
        //j) Compute o produto dos três inteiros contidos nas variáveis x, y e z 
		//e atribua o resultado à variável result
		result = x * y * z; // calcula o produto dos números

		System.out.printf("Product is %d%n", result);
	} // fim do método main
} // fim da classe Product