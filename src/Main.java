public class Main {
    public static void main(String[] args) {
        int priceTicket = 115; // Стоимость билета
        int amountPrice = 20; // Количество рублей для одной бонусной миссии

        int bonusMile = priceTicket / amountPrice;

        System.out.println("Количество начисленных милей: " + bonusMile);
    }
}
