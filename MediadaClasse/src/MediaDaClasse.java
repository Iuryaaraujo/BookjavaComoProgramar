import java.util.Scanner;

public class MediaDaClasse {

	public static void main(String[] args) {
		// cria Scanner para obter entrada a partir da janela de comando
		Scanner sc = new Scanner(System.in);
		
		// fase de inicialização
		int total = 0; // inicializa a soma das notas inseridas pelo usuário
		int contadorDeNotas = 1; // inicializa nº da nota a ser inserido em seguida
		
		// fase de processamento utiliza repetição controlada por contador
		while (contadorDeNotas <= 10) { // faz o loop 10 vezes
			System.out.print("insira a nota: "); // prompt
			int nota = sc.nextInt();// insere a nota
			total += nota;// add nota ao total
			contadorDeNotas += +1;//incrementa o contador por 1
		}
		// fase de término
		int media = total / 10; // divisão de inteiros produz um resultado inteiro
		
		// exibe o total e a média das notas
		System.out.printf("%nO total de todas as 10 notas é %d%n", total);
		System.out.printf("A média da turma é %d%n", media);


	}
}
