package rvt;

public class PaymentTerminal {
    private double money;  
    private int affordableMeals; 
    private int heartyMeals;  

    public PaymentTerminal() {
        this.money = 1000.0;
    }

    public double eatAffordably(double payment) {
        double afforablePrice = 2.50;
        double change;
        if (payment >= 2.50) {
            change = payment - afforablePrice;
            this.money += (payment - change);
            return change;
        } else {
            return payment;
        }

    }

    public double eatHeartily(double payment) { 
     double heartilyPrice = 4.30;
        double change;
        if (payment >= 4.30) {
            change = payment - heartilyPrice;
            this.money += (payment - change);
            return change;
        } else {
            return payment;
        }
    }

     public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.50){
            this.affordableMeals += 1;
            card.takeMoney(2.50);
            return true;
        } else {
            return false;
        }
    }
    public boolean eatHeartily(PaymentCard card) {
    if (card.balance() >= 4.30){
            this.heartyMeals += 1;
            card.takeMoney(4.30);
            return true;
        } else {
            return false;
        }
    }
    public void addMoneyToCard(PaymentCard card, double sum) {
    if (sum > 0) {
        card.addMoney(sum);
        this.money += sum;
    }
}

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

}
