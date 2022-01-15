package Model;

public class Money {
    private Double amount;
    private Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    
    public Money() {}
    public Money(Double amount){ setAmount(amount); }
    
    public Double getAmount(){
        return this.amount;
    }
    
    public final void setAmount(Double newAmount) {
        this.amount = newAmount;
    }
    
}
