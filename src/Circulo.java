import java.util.Locale;
import java.util.Scanner;

public class Circulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o raio do círculo como um inteiro: ");
		int raio = scanner.nextInt();

		double diametro = 2 * raio;
		double circunferencia = 2 * Math.PI * raio;
		double area = Math.PI * raio * raio;

		System.out.printf("Diâmetro: %.2f%n", diametro);
		System.out.printf("Circunferência: %.2f%n", circunferencia);
		System.out.printf("Área: %.2f%n", area);

		scanner.close();
	}
}