import java.util.Scanner;

public class HeartRatesTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Solicite as informações da pessoa
		System.out.print("Informe o nome: ");
		String nome = input.nextLine();

		System.out.print("Informe o sobrenome: ");
		String sobrenome = input.nextLine();

		System.out.print("Informe o dia de nascimento: ");
		int diaNascimento = input.nextInt();

		System.out.print("Informe o mês de nascimento: ");
		int mesNascimento = input.nextInt();

		System.out.print("Informe o ano de nascimento: ");
		int anoNascimento = input.nextInt();

		// Crie um objeto HeartRates com as informações fornecidas
		HeartRates pessoa = new HeartRates(nome, sobrenome, diaNascimento, mesNascimento, anoNascimento);

		// Exiba as informações e resultados
		System.out.println("\nInformações da Pessoa:");
		System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
		System.out.println("Data de Nascimento: " + pessoa.getDiaNascimento() + "/" + pessoa.getMesNascimento() + "/"
				+ pessoa.getAnoNascimento());
		System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
		System.out.println("Frequência Cardíaca Máxima: " + pessoa.calcularFrequenciaCardiacaMaxima() + " bpm");
		System.out.println("Frequência Cardíaca Alvo: " + pessoa.calcularFrequenciaCardiacaAlvo() + " bpm");

		input.close();
	}
}
