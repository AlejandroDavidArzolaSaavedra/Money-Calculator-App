package Controller;
import Model.Currency;
import Model.Money;
import Model.MoneyCalculator;
import View.MoneyEditView;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MoneyEditController {
    private final MoneyCalculator moneyCalculator;
    private final MoneyEditView moneyEditView;

    public MoneyEditController(MoneyCalculator moneyCalculator, MoneyEditView moneyEditView) {
        this.moneyCalculator = moneyCalculator;
        this.moneyEditView = moneyEditView;
    }
    
    private boolean confirmNumber(){
        return moneyEditView.getAmount().getText().matches("[0-9]+([\\.,][0-9][0-9]?)?");
    }
   
    private void updateModel() throws IOException {
        Currency newFrom = null;
        Currency newTo = null;
        Money newMoney = null;
        newFrom = (Currency) this.moneyEditView.getListMoneyFrom().getSelectedItem();
        newTo = (Currency) this.moneyEditView.getListMoneyTo().getSelectedItem();
        if(confirmNumber()){
            newMoney = new Money(Double.parseDouble(this.moneyEditView.getAmount().getText()));
        }else{
            newMoney = new Money(0.0);
        }
        this.moneyCalculator.updateMoneyCalculator(newFrom, newTo, newMoney);
    }
    
    public void iniciar(){
        moneyEditView.getListMoneyFrom().addActionListener(e -> {
            try {
                updateModel();
            } catch (IOException ex) {
                Logger.getLogger(MoneyEditController.class.getName()).log(Level.SEVERE, null, ex);
            }
});
        moneyEditView.getListMoneyTo().addActionListener(e -> {
            try {
                updateModel();
            } catch (IOException ex) {
                Logger.getLogger(MoneyEditController.class.getName()).log(Level.SEVERE, null, ex);
            }
});
    }
}
