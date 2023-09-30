
public class Student {

	// variavel de instancia
	private String name;
	private double average;// media

	public Student(String name, double average) {
		this.name = name;

		// valida que a média é > 0.0 e <= 100.0; caso contrário,
		// armazena o valor padrão da média da variável de instância (0.0)
		if (average >= 0.0)
			if (average <= 100.0)
				this.average = average; // atribui à variável de instância
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAverage() {
		return average;
	}

	// define a média de Student
	public void setAverage(double studentAverage) {
		// valida que a média é > 0.0 e <= 100.0; caso contrário,
		// armazena o valor padrão da média da variável de instância (0.0)
		if (average >= 0.0)
			if (average <= 100.0)
				this.average = average; // atribui à variável de instância
	}

	// determina e retorna a letra da nota de Student
	public String getLetterGrade() {
		String letterGrade = ""; // inicializado como uma String vazia
		if (average >= 90.0)
			letterGrade = "A";
		else if (average >= 80.0)
			letterGrade = "B";
		else if (average >= 70.0)
			letterGrade = "C";
		else if (average >= 60.0)
			letterGrade = "D";
		else
			letterGrade = "F";

		return letterGrade;
	}
}// finaliza a classe Student
