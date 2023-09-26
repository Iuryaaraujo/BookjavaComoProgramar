public class EquivalentesInteiros {
	public static void main(String[] args) {
		char[] caracteres = { 'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' ' };

		for (char c : caracteres) {
			int valorInteiro = (int) c;
			System.out.printf("O caractere %c tem o valor inteiro %d%n", c, valorInteiro);
		}
	}
}