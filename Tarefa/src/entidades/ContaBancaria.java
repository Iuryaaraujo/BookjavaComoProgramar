package entidades;

public class ContaBancaria {

	//Variavel de instancia
	private Integer numeroDaConta;
	private String titularDaConta;
	private double  saldoDaConta;
	//Construtores
	public ContaBancaria(Integer numeroDaConta, String titularDaConta) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
	}

	public ContaBancaria(Integer numeroDaConta, String titularDaConta, double depositoInicial) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
		deposito(depositoInicial);
	}
    //metodos
	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public double getSaldoDaConta() {
		return saldoDaConta;
	}

	public void setSaldoDaConta(double saldoDaConta) {
		this.saldoDaConta = saldoDaConta;
	}
	//Metodo para depositar dinheiro na conta
	public void deposito(double QuantiaDeposito) {
		if(QuantiaDeposito > 0.0)
			saldoDaConta += QuantiaDeposito;
	}
	//Metodo para sacar dinheiro da conta 
	public void saque(double QuantiaDeposito) {
		saldoDaConta -= QuantiaDeposito + 5.0; 
	}

	@Override
	public String toString() {
		return "Conta Bancaria " 
	+ numeroDaConta 
	+ ", Titular Da Conta: " 
	+ titularDaConta			
	+ ", Saldo Da Conta: $ " 
	+ String.format("%.2f", saldoDaConta);
	}	

}
