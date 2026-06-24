import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CurrencyService {

    private static Map<String, BigDecimal> rates = new HashMap<>();

    static {
        rates.put("USD", new BigDecimal("1"));
        rates.put("INR", new BigDecimal("83.50"));
        rates.put("EUR", new BigDecimal("0.92"));
        rates.put("GBP", new BigDecimal("0.79"));
        rates.put("JPY", new BigDecimal("157.20"));
        rates.put("CAD", new BigDecimal("1.37"));
rates.put("AUD", new BigDecimal("1.53"));
rates.put("CNY", new BigDecimal("7.18"));
rates.put("SGD", new BigDecimal("1.35"));
rates.put("AED", new BigDecimal("3.67"));
    }

    public static BigDecimal getRate(String currency) {
        return rates.get(currency);
    }
}