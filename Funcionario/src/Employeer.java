
public class Employeer {

	//Variavel de instancia
	private String nome;
	private String sobrenome;
	private double salario;
	//Construtor
	public Employeer(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		 // Verifique se o salário mensal é positivo, caso contrário, defina como 0.0
		if(salario > 0.0) {
			this.salario += salario;
		}else {
			this.salario = 0.0;
		}
	}

	 // Método para obter o primeiro nome
	public String getNome() {
		return nome;
	}
	// Método para configurar o primeiro nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	 // Método para obter o sobrenome
	public String getSobrenome() {
		return sobrenome;
	}
	// Método para configurar o sobrenome
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	// Método para obter o salário mensal
	public double getSalario() {
		return salario;
	}
	// Método para configurar o salário mensal
	public void setSalario(double salario) {
		 // Verifique se o salário mensal é positivo, caso contrário, defina como 0.0
        if (salario > 0.0) {
            this.salario = salario;
        } else {
            this.salario = 0.0;
        }
    }
	// Método para calcular o salário anual
    public double getSalarioAnual() {
        return salario * 12;
    }

    // Método para dar um aumento de 10%
    public void darAumento() {
        salario *= 1.10;
    }
}

