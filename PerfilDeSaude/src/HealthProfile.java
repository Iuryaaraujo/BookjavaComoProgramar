import java.util.Calendar;
//variavel de instancia
public class HealthProfile {
	private String nome;
	private String sobrenome;
	private String sexo;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	private double altura; // em metros
	private double peso; // em quilogramas

	// Construtor
	public HealthProfile(String nome, String sobrenome, String sexo, int diaNascimento, int mesNascimento,
			int anoNascimento, double altura, double peso) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
		this.altura = altura;
		this.peso = peso;
	}

	// Método para configurar o nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Método para obter o nome
	public String getNome() {
		return nome;
	}

	// Método para configurar o sobrenome
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	// Método para obter o sobrenome
	public String getSobrenome() {
		return sobrenome;
	}

	// Método para configurar o sexo
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	// Método para obter o sexo
	public String getSexo() {
		return sexo;
	}

	// Método para configurar o dia de nascimento
	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	// Método para obter o dia de nascimento
	public int getDiaNascimento() {
		return diaNascimento;
	}

	// Método para configurar o mês de nascimento
	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	// Método para obter o mês de nascimento
	public int getMesNascimento() {
		return mesNascimento;
	}

	// Método para configurar o ano de nascimento
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	// Método para obter o ano de nascimento
	public int getAnoNascimento() {
		return anoNascimento;
	}

	// Método para configurar a altura
	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Método para obter a altura
	public double getAltura() {
		return altura;
	}

	// Método para configurar o peso
	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Método para obter o peso
	public double getPeso() {
		return peso;
	}

	// Método para calcular e retornar a idade em anos
	public int calcularIdade() {
		Calendar cal = Calendar.getInstance();
		int anoAtual = cal.get(Calendar.YEAR);
		int mesAtual = cal.get(Calendar.MONTH) + 1; // Adicionar 1 porque janeiro é 0
		int diaAtual = cal.get(Calendar.DAY_OF_MONTH);

		int idade = anoAtual - anoNascimento;

		// Ajuste se o aniversário ainda não ocorreu este ano
		if (mesNascimento > mesAtual || (mesNascimento == mesAtual && diaNascimento > diaAtual)) {
			idade--;
		}

		return idade;
	}

	// Método para calcular e retornar o IMC (Índice de Massa Corporal)
	public double calcularIMC() {
		return peso / (altura * altura);
	}

	// Método para calcular e retornar a frequência cardíaca máxima
	public int calcularFrequenciaCardiacaMaxima() {
		return 220 - calcularIdade();
	}

	// Método para calcular e retornar o intervalo de frequência cardíaca alvo
	public String calcularFrequenciaCardiacaAlvo() {
		int frequenciaMaxima = calcularFrequenciaCardiacaMaxima();
		int minimoAlvo = (int) (frequenciaMaxima * 0.5); // 50% da frequência máxima
		int maximoAlvo = (int) (frequenciaMaxima * 0.85); // 85% da frequência máxima

		return minimoAlvo + " - " + maximoAlvo;
	}
}
