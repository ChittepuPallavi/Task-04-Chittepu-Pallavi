import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Amount: ");
            BigDecimal amount =
                    new BigDecimal(sc.nextLine());

            System.out.print("From Currency: ");
            String from =
                    sc.nextLine().toUpperCase();

            System.out.print("To Currency: ");
            String to =
                    sc.nextLine().toUpperCase();

            if(!Validator.isValidCurrency(from)
                    || !Validator.isValidCurrency(to)) {

                System.out.println("Invalid Currency");
                return;
            }

            BigDecimal result =
                    CurrencyConverter.convert(
                            amount,
                            from,
                            to);

            System.out.println(
                    "Converted Amount = " + result);

        } catch(Exception e) {

            System.out.println("Invalid Input");

        }

        sc.close();
    }
}