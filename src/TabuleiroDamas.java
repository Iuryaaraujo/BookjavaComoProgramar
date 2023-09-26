public class TabuleiroDamas {
    public static void main(String[] args) {
        int tamanho = 8; // Tamanho do tabuleiro (8x8)

        for (int linha = 0; linha < tamanho; linha++) {
            for (int coluna = 0; coluna < tamanho; coluna++) {
                // Verifica se a soma da linha e coluna é par para alternar entre '*' 
            	//e espaço em branco
                if ((linha + coluna) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Espaço em branco
                }
            }
            System.out.println(); // Quebra de linha após cada linha do tabuleiro
        }
    }
}