public class Main {
    public static void main(String[] args) {
        int ticketPrice = 5_000;
        int RublesForOneMile = 20;
        int bonus = ticketPrice / RublesForOneMile;

        if (ticketPrice >= 20) {
            System.out.println("Начислено бонусных миль: " + bonus);
        } else {
            System.out.println("Бонусных миль не начислено");
        }
    }
}