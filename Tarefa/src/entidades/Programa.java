package entidades;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ContaBancaria conta;

		System.out.print("Digite o numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Insira o titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Existir deposito inicial (S/N)? ");
		char responde = sc.next().charAt(0);
		if (responde == 'S') {
			System.out.println("Digite o valor do deposito inicial: ");
			double ValorDepositoInicial = sc.nextDouble();
			conta = new ContaBancaria(numero, nome, ValorDepositoInicial);
		}else {
			conta = new ContaBancaria(numero, nome);
		}
		
		System.out.println();
		System.out.println("Dados da Conta Bancaria: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Insira o valor de Deposito: ");
		double ValorDeposito = sc.nextDouble();
		conta.deposito(ValorDeposito);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Insira um valor de saque: ");
		double ValorSaque = sc.nextDouble();
		conta.saque(ValorSaque);
		System.out.println("Dados da conta Atualizado: ");
		System.out.println(conta);
		

		sc.close();
	}
}
