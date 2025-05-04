public class Main {
    public static void main(String[] args) {

        int ticketPrice = 1500; // Стоимость билета в рублях
        int rublesPerMile = 20; // За сколько рублей даётся одна миля

        int milesEarned = ticketPrice / rublesPerMile;

        System.out.println("Начислено бонусных миль: " + milesEarned);
    }
}