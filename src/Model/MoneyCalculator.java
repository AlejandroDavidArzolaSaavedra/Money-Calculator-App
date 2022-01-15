package Model;

import View.MoneyView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MoneyCalculator {
    private Currency from = new Currency();
    private Currency to = new Currency();
    private Money money = new Money(1.00);
    private List<MoneyView> moneyCalculatorViewList = new ArrayList<>();
    public MoneyCalculator() {
    }
    public Currency getFrom() {
        return from;
    }

    public void setFrom(Currency from) {
        this.from = from;
    }

    public Currency getTo() {
        return to;
    }

    public void setTo(Currency to) {
        this.to = to;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }
    
    public void addMoneyCalculatorView(MoneyView moneyView){
        if(!moneyCalculatorViewList.contains(moneyView)){
            moneyCalculatorViewList.add(moneyView);
        }
    }
    
    public void removeMoneyCalculatorView(MoneyView moneyView){
        moneyCalculatorViewList.remove(moneyView);
    }
    
    public void updateMoneyCalculator(Currency from, Currency to, Money money){
        if(!from.getSymbol().isEmpty() & !from.getName().isEmpty() & !from.getCode().isEmpty()){
            setFrom(from);
        }
        
        if(!to.getSymbol().isEmpty() & !to.getName().isEmpty() & !to.getCode().isEmpty()){
            setTo(to);
        }
        setMoney(money);
        updateMoneyCalculatorView();
    }

    private void updateMoneyCalculatorView() {
        Iterator<MoneyView> notifyMoneyViews = moneyCalculatorViewList.iterator();
        while(notifyMoneyViews.hasNext()){
            (notifyMoneyViews.next()).refreshMoneyCalculatorView(from,to,money);
        }
    }
}
