public class Validator {

    public static boolean isValidCurrency(String currency) {
        return CurrencyService.getRate(currency) != null;
    }

    public static boolean isValidAmount(double amount) {
        return amount > 0;
    }
}