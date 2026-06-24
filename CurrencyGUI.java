import javax.swing.*;
import java.awt.*;
import java.math.BigDecimal;

public class CurrencyGUI extends JFrame {

    JComboBox<Currency> fromBox;
JComboBox<Currency> toBox;
    JTextField amountField;
    JTextField resultField;
    JButton convertButton;

    public CurrencyGUI() {

        setTitle("Currency Converter");
        setSize(450,300);
        setLayout(new GridLayout(5,2,10,10));

        Currency[] currencies = {

    new Currency("🇮🇳 India - INR (₹)", "INR"),
    new Currency("🇺🇸 United States - USD ($)", "USD"),
    new Currency("🇬🇧 United Kingdom - GBP (£)", "GBP"),
    new Currency("🇪🇺 Eurozone - EUR (€)", "EUR"),
    new Currency("🇯🇵 Japan - JPY (¥)", "JPY"),
    new Currency("🇨🇦 Canada - CAD (C$)", "CAD"),
    new Currency("🇦🇺 Australia - AUD (A$)", "AUD"),
    new Currency("🇨🇳 China - CNY (¥)", "CNY"),
    new Currency("🇸🇬 Singapore - SGD (S$)", "SGD"),
    new Currency("🇦🇪 UAE - AED (د.إ)", "AED")

};

        fromBox = new JComboBox<>(currencies);
        toBox = new JComboBox<>(currencies);

        amountField = new JTextField();
        resultField = new JTextField();

        convertButton = new JButton("Convert");

        add(new JLabel("From Currency"));
        add(fromBox);

        add(new JLabel("To Currency"));
        add(toBox);

        add(new JLabel("Amount"));
        add(amountField);

        add(new JLabel("Converted Amount"));
        add(resultField);

        add(new JLabel(""));
        add(convertButton);

        convertButton.addActionListener(e -> convertCurrency());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void convertCurrency() {

        try {

            BigDecimal amount =
                    new BigDecimal(amountField.getText());

           Currency fromCurrency =
        (Currency) fromBox.getSelectedItem();

Currency toCurrency =
        (Currency) toBox.getSelectedItem();

String from = fromCurrency.getCode();
String to = toCurrency.getCode();

            BigDecimal result =
                    CurrencyConverter.convert(
                            amount,
                            from,
                            to);

            resultField.setText(result.toString());

        } catch(Exception ex) {

            JOptionPane.showMessageDialog(
                    this,
                    "Enter Valid Amount");
        }
    }

    public static void main(String[] args) {

        new CurrencyGUI();
    }
}