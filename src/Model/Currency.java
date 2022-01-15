package Model;
import java.util.Objects;

public class Currency {
    private String code;
    private String name;
    private String symbol;
    private Money money;
    private ExchangeRate to;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.code);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Currency) {
            Currency currency = (Currency)obj;
            if(code.equals(currency.getCode())){
                return true;
            }
        }
        return false;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public ExchangeRate getTo() {
        return to;
    }

    public void setTo(ExchangeRate to) {
        this.to = to;
    }
  
    public Currency() {}
    public Currency(String code, String name, String symbol){ setCurrency(code, name, symbol); }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }
    
    public final void setCurrency(String code, String name, String symbol) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().append(name).append(", ").append(symbol).toString();
    }
}
