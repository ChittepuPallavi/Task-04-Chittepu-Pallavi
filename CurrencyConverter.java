import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConverter {

    public static BigDecimal convert(
            BigDecimal amount,
            String from,
            String to) {

        BigDecimal fromRate =
                CurrencyService.getRate(from);

        BigDecimal toRate =
                CurrencyService.getRate(to);

        BigDecimal usdAmount =
                amount.divide(fromRate, 10,
                        RoundingMode.HALF_EVEN);

        return usdAmount.multiply(toRate)
                .setScale(2,
                        RoundingMode.HALF_EVEN);
    }
}