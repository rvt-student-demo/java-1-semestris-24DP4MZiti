package rvt;

public class Main_Payment_Card {
    public static void main(String[] args) {
        Payment_Card card = new Payment_Card(50);
        System.out.println(card);

        card.eatAffordably();
        System.out.println(card);

        card.eatHeartily();
        card.eatAffordably();
        System.out.println(card);
    }
}