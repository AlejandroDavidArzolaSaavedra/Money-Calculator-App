package Model.Persistance;
import java.util.List;
import Model.Currency;
import java.io.IOException;

public interface CurrencyLoader {
    public abstract List<Currency> loadAllCurrency() throws IOException;
}
