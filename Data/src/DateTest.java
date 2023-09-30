public class DateTest {
    public static void main(String[] args) {
        // Crie um objeto Date
        Date data = new Date(9, 28, 2023);

        // Exiba a data usando o método displayDate
        System.out.print("Data: ");
        data.displayDate();

        // Altere o mês, dia e ano usando os métodos set
        data.setMes(10);
        data.setDia(15);
        data.setAno(2024);

        // Exiba a data atualizada
        System.out.print("Data atualizada: ");
        data.displayDate();
    }
}