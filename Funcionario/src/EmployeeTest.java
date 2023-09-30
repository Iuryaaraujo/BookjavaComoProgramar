import java.util.Locale;
import java.util.Scanner;

public class EmployeeTest {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Crie dois objeto Employeer
		Employeer emp1 = new Employeer("Iury", "Araujo", 5000.0);
		Employeer emp2 = new Employeer("Luanna", "Araujo", 6000.0);
		
		 // Exiba o salário anual de cada objeto
        System.out.println("Salário anual de emp1: " + emp1.getSalarioAnual());
        System.out.println("Salário anual de emp2: " + emp2.getSalarioAnual());

        // Dê um aumento de 10% a cada Employee
        emp1.darAumento();
        emp2.darAumento();

        // Exiba o salário anual atualizado de cada objeto
        System.out.println("\nApós o aumento de 10%:");
        System.out.printf("Salário anual de emp1: %.2f%n ",  emp1.getSalarioAnual());
        System.out.printf("Salário anual de emp2: %.2f%n", emp2.getSalarioAnual());
		sc.close();
	}
}
