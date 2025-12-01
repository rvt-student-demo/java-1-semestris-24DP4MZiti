package rvt;

public class Payment_Card {
    private double balance;

    public Payment_Card(double openingBalance) {
        
        this.balance = openingBalance;
    }
    public String toString() {
        return "The card has a balance of " +  this.balance + " euros";
    }

    public void eatAffordably() {
    balance -= 2.60;
}

public void eatHeartily() {
    balance -= 4.60;
}

}