import java.util.Locale;

public class Louco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double x = 10.12345;
		System.out.println(x);
		System.out.printf("%.2f%n", x);//quantas casas decimais contadas
		System.out.printf("%.4f%n", x);
		//Concatenar varios elementos em um mesmos comando de escrita
		System.out.println("RESULTADO = " + x + " METROS");
		//concatenar com duas casas decimais
		System.out.printf("RESULTADO = %.2f METROS%n", x);

	}

}
