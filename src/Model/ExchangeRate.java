package Model;
public class ExchangeRate {
    private Double rate;
    private Currency from;

    public ExchangeRate() {}
    public ExchangeRate(Double rate){ setRate(rate); }
    
    public Double getRate() {
        return this.rate;
    }
    public final void setRate(Double newRate) {
        this.rate = newRate;
    }
    
    public Currency getFrom() {
        return from;
    }

    public void setFrom(Currency from) {
        this.from = from;
    }

}
 