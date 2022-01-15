package View;
import Controller.MoneyEditController;
import Model.*;
import Model.Persistance.Archive.CurrencyLoaderArchive;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class MoneyEditView extends JPanel implements MoneyView{
    private static final String FROM = "FROM :";
    private static final String TO = "TO :";
    private static final String AMOUNT = "AMOUNT :";
    private JLabel from,to,amount;
    private JComboBox<Currency> listMoneyFrom,listMoneyTo;
    private JTextArea amountMoney;
    private URL fondo;
    private Image imagenFondo;
    private final MoneyEditController moneyEditController;
    
    public MoneyEditView(MoneyCalculator moneyCalculator) throws IOException{
        this.moneyEditController = new MoneyEditController(moneyCalculator, this );
        createGui();
    }
    
    private void createGui() throws IOException {
        fondo = this.getClass().getResource("Images/Captura.png");
        imagenFondo = new ImageIcon(fondo).getImage();
        from = new JLabel(FROM); from.setFont(new Font("Arial", Font.BOLD, 15));
        to = new JLabel(TO); to.setFont(new Font("Arial", Font.BOLD, 15));
        amount = new JLabel(AMOUNT);
        amount.setFont(new Font("Arial", Font.BOLD, 15));
        listMoneyFrom = new JComboBox(); listMoneyTo = new JComboBox();
        CurrencyLoaderArchive so = new CurrencyLoaderArchive();
        for(Currency cr: so.loadAllCurrency()){
            listMoneyFrom.addItem(cr);
            listMoneyTo.addItem(cr);
        }
        listMoneyFrom.setSelectedIndex(42); listMoneyTo.setSelectedIndex(141);
        amountMoney = new JTextArea("1.00");
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(25,2,2,2);
        c.gridx = 0; c.gridy = 1;
        c.ipadx = 5; c.ipady = 5;
        add(new JLabel(""), c); c.gridy = 2;
        add(from, c); c.gridx = 1;
        add(listMoneyFrom,c); c.gridx = 2;
        add(to, c); c.gridx = 3;
        add(listMoneyTo, c);
        c.gridx = 0; c.gridy = 3; c.gridwidth = 3;
        add(amount, c);
        c.gridx = 1; c.gridwidth = 14;
        c.ipadx = 100; c.ipady = 10;
        add(amountMoney, c);
    }
    
    public JComboBox<Currency> getListMoneyFrom() {
        return listMoneyFrom;
    }

    public JComboBox<Currency> getListMoneyTo() {
        return listMoneyTo;
    }
    
    public JTextArea getAmount() {
        return amountMoney;
    }
    
    
    public void paintComponent(Graphics g){
        g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), null);
    }   
    
    @Override
    public void refreshMoneyCalculatorView(Currency from, Currency to, Money amount) {
        this.listMoneyFrom.setSelectedItem(from);
        this.listMoneyTo.setSelectedItem(to);
        this.amountMoney.setText(Double.toString(amount.getAmount()));
    }    
}
