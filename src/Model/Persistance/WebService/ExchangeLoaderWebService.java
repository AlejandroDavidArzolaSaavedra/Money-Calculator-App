package Model.Persistance.WebService;
import Model.Currency;
import Model.ExchangeRate;
import Model.Persistance.ExchangeRateLoader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ExchangeLoaderWebService implements ExchangeRateLoader  {
    public ExchangeLoaderWebService(){}   
    @Override
    public ExchangeRate getExchange(Currency from, Currency to) throws IOException  {
        URLConnection connection = new URL("https://free.currconv.com/api/v7/convert?q=" + from.getCode() + "_" + to.getCode() + "&compact=ultra&apiKey=5d5bb5a2057fc16b91ae").openConnection();
        try (BufferedReader reader = 
                new BufferedReader(new InputStreamReader(connection.getInputStream()))){
            String line = reader.readLine();
            String linel = line.substring(line.indexOf(line) + 11, line.indexOf("}"));
            Double valor = Double.parseDouble(linel);
            ExchangeRate rate = new ExchangeRate(valor);
            return rate;
        }
    }
}
