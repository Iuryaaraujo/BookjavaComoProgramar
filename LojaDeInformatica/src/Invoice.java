public class Invoice {
	private String numero;
	private String descricao;
	private int quantidade;
	private double precoPorItem;

	// Construtor
	public Invoice(String numero, String descricao, int quantidade, double precoPorItem) {
		this.numero = numero;
		this.descricao = descricao;
		// Verifique se a quantidade é positiva, caso contrário, defina como 0
		if (quantidade > 0) {
			this.quantidade = quantidade;
		} else {
			this.quantidade = 0;
		}
		// Verifique se o preço por item é positivo, caso contrário, defina como 0.0
		if (precoPorItem > 0.0) {
			this.precoPorItem = precoPorItem;
		} else {
			this.precoPorItem = 0.0;
		}
	}

	// Método para configurar o número
	public void setNumero(String numero) {
		this.numero = numero;
	}

	// Método para obter o número
	public String getNumero() {
		return numero;
	}

	// Método para configurar a descrição
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// Método para obter a descrição
	public String getDescricao() {
		return descricao;
	}

	// Método para configurar a quantidade
	public void setQuantidade(int quantidade) {
		// Verifique se a quantidade é positiva, caso contrário, defina como 0
		if (quantidade > 0) {
			this.quantidade = quantidade;
		} else {
			this.quantidade = 0;
		}
	}

	// Método para obter a quantidade
	public int getQuantidade() {
		return quantidade;
	}

	// Método para configurar o preço por item
	public void setPrecoPorItem(double precoPorItem) {
		// Verifique se o preço por item é positivo, caso contrário, defina como 0.0
		if (precoPorItem > 0.0) {
			this.precoPorItem = precoPorItem;
		} else {
			this.precoPorItem = 0.0;
		}
	}

	// Método para obter o preço por item
	public double getPrecoPorItem() {
		return precoPorItem;
	}

	// Método para calcular o valor da fatura
	public double getInvoiceAmount() {
		return quantidade * precoPorItem;
	}
}
