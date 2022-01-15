package Model.Persistance.Archive;
import Model.Currency;
import Model.Persistance.CurrencyLoader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CurrencyLoaderArchive implements CurrencyLoader {
    
    public CurrencyLoaderArchive(){}
    
    @Override
    public List<Currency> loadAllCurrency() throws IOException {
        FileReader fr = null;
        BufferedReader br;
        List<Currency> map = new ArrayList<>();
            try{
                fr = new FileReader(new File("C:\\Users\\Lab-DIS\\Documents\\NetBeansProjects\\MoneyCalculator\\currencies.txt"));
                br =new BufferedReader(fr);
                String linea;
                while((linea=br.readLine())!=null){
                    String[] curr = linea.split(",");
                    Currency currencies = new Currency(curr[0],curr[1],curr[2]);
                    map.add(currencies);
                    
                }
              }
          catch(IOException e){
          }finally{
             try{                    
                if( null != fr ){   
                   fr.close();     
                }                  
             }catch (IOException e2){}
        }
        return map;
    }
}
