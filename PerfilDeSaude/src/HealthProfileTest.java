import java.util.Scanner;

public class HealthProfileTest {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicite as informações da pessoa
        System.out.print("Informe o nome: ");
        String nome = input.nextLine();

        System.out.print("Informe o sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.print("Informe o sexo (M/F): ");
        String sexo = input.nextLine();

        System.out.print("Informe o dia de nascimento: ");
        int diaNascimento = input.nextInt();

        System.out.print("Informe o mês de nascimento: ");
        int mesNascimento = input.nextInt();

        System.out.println("Informe o ano de nascimento:  ");
        int anoNascimento = input.nextInt();

        System.out.println("Informe a altura (em metros): ");
        double altura = input.nextDouble();

        System.out.println("Informe o peso (em quilogramas): ");
        double peso = input.nextDouble();

        // Crie um objeto HealthProfile com as informações fornecidas
        HealthProfile pessoa = new HealthProfile(nome, sobrenome, sexo, diaNascimento, mesNascimento, anoNascimento, altura, peso);

        // Exiba as informações e resultados
        System.out.println("\nInformações da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Data de Nascimento: " + pessoa.getDiaNascimento() + "/" + pessoa.getMesNascimento() + "/" + pessoa.getAnoNascimento());
        System.out.println("Altura: " + pessoa.getAltura() + " metros");
        System.out.println("Peso: " + pessoa.getPeso() + " quilogramas");
        System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
        System.out.println("IMC (Índice de Massa Corporal): " + pessoa.calcularIMC());
        System.out.println("Frequência Cardíaca Máxima: " + pessoa.calcularFrequenciaCardiacaMaxima() + " bpm");
        System.out.println("Frequência Cardíaca Alvo:" );
}
}