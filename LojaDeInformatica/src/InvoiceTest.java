public class InvoiceTest {
	public static void main(String[] args) {
		// Crie uma instância de Invoice
		Invoice fatura = new Invoice("12345", "Teclado sem fio", 2, 49.99);

		// Exiba os detalhes da fatura
		System.out.println("Número: " + fatura.getNumero());
		System.out.println("Descrição: " + fatura.getDescricao());
		System.out.println("Quantidade: " + fatura.getQuantidade());
		System.out.println("Preço por Item: " + fatura.getPrecoPorItem());
		System.out.println("Valor da Fatura: " + fatura.getInvoiceAmount());

		// Atualize a quantidade e o preço por item
		fatura.setQuantidade(3);
		fatura.setPrecoPorItem(59.99);

		// Exiba os detalhes da fatura atualizados
		System.out.println("\nDepois da Atualização:");
		System.out.println("Quantidade: " + fatura.getQuantidade());
		System.out.println("Preço por Item: " + fatura.getPrecoPorItem());
		System.out.println("Valor da Fatura: " + fatura.getInvoiceAmount());
	}
}