public class TabelaQuadradosCubos {
    public static void main(String[] args) {
        System.out.println("number square cube");
        
        for (int number = 0; number <= 10; number++) {
            int square = number * number;
            int cube = number * number * number;
            
            System.out.printf("%-6d %-6d %-6d%n", number, square, cube);
        }
    }
}