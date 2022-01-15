package View;
import Model.*;
import Model.Persistance.ExchangeRateLoader;
import Model.Persistance.WebService.ExchangeLoaderWebService;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MoneyDisplayView extends JPanel implements MoneyView {
    private JTextField display;
    private URL fondo;
    private Image imagenFondo;
    public MoneyDisplayView() throws IOException{ 
        createGui(); }
    
    private void createGui() throws IOException{
        fondo = this.getClass().getResource("Images/Captura2.png");
        imagenFondo = new ImageIcon(fondo).getImage();
        imagenFondo = new ImageIcon(fondo).getImage();
        display = new JTextField(10);
        display.setText("1.13");
        display.setFont(new Font("Calibri", Font.BOLD, 40));
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5,2,2,2);
        c.gridx = 0; c.gridy = 1;
        c.ipadx = 5; c.ipady = 5;
        add(display);
        display.setEditable(false);
    }

    public void setDisplay(Double display) {
        this.display.setText(display.toString());
    }
   
    public void paintComponent(Graphics g){
        g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), null);
    }

    @Override
    public void refreshMoneyCalculatorView(Currency from, Currency to, Money money) {
        try { 
            display.setText(calculoMoneyCalculator(from,to,money));
        } catch (IOException ex) {
            Logger.getLogger(MoneyDisplayView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String calculoMoneyCalculator(Currency from, Currency to, Money money) throws IOException {
        ExchangeRateLoader ex = new ExchangeLoaderWebService();
        ExchangeRate er;
        er = ex.getExchange(from, to);
        BigDecimal bigDecimal = new BigDecimal(er.getRate()*money.getAmount()).setScale(2, RoundingMode.UP);
        return Double.toString(bigDecimal.doubleValue());
    }
}
