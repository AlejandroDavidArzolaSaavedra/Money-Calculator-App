package Model.Persistance;
import Model.Currency;
import Model.ExchangeRate;
import java.io.IOException;

public interface ExchangeRateLoader {
    public abstract ExchangeRate getExchange(Currency from, Currency to) throws IOException;
}
