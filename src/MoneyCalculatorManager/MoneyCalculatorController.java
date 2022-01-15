package MoneyCalculatorManager;
import Controller.MoneyEditController;
import Model.MoneyCalculator;
import View.MoneyDisplayView;
import View.MoneyEditView;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoneyCalculatorController {
    public static void main(String[] args) throws IOException{
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        
        MoneyEditView moneyEditView = new MoneyEditView(moneyCalculator);
        moneyCalculator.addMoneyCalculatorView(moneyEditView);
        createIG(moneyEditView,"Money Calculator");
        
        MoneyDisplayView moneyDisplayView = new MoneyDisplayView();
        moneyCalculator.addMoneyCalculatorView(moneyDisplayView);
        createIG(moneyDisplayView, "Money Calculator Display");
        moneyDisplayView.setLocation(50,250);
        MoneyEditController mon = new MoneyEditController(moneyCalculator,moneyEditView);
        mon.iniciar();
    }

    private static  void createIG(JPanel contenido, String titulo) {
        JFrame appFrame = new JFrame();
        appFrame.setTitle(titulo);
        appFrame.getContentPane().add(contenido);
        appFrame.setResizable(false);
        appFrame.addWindowListener(new windowClose());
        appFrame.pack();
        appFrame.setLocationRelativeTo(null);
        appFrame.setSize(700,300);
        appFrame.setVisible(true);
    
    }
    
    private static class windowClose extends WindowAdapter{
        public void windowClosing(WindowEvent window){
            System.exit(0);
        }
    }
}
