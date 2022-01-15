package View;
import Model.Currency;
import Model.Money;

public interface MoneyView {
    public void refreshMoneyCalculatorView(Currency from, Currency to , Money money);
}
