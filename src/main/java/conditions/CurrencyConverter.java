package conditions;

import java.util.Scanner;

public class CurrencyConverter {

    static final float EUR = 4.31F; //<====POLe statyczne stałe float nic juz nie przypisze do float.
    static final  float USD = 3.90F; //<====POLe statyczne stałe float nic juz nie przypisze do float.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ile masz zlotych ");
        int plnAmount = scanner.nextInt();
        System.out.println("Podaj walutę [EUR], [USD]");
        scanner.nextLine(); // <== pisze to po to aby uzunąć znak nowej linii \n
        String currencySymbol = scanner.nextLine();
        float multiplier = 00F;  // <====to jest nasz przelicznik
        switch (currencySymbol) {
            case "EUR":
                multiplier = EUR;
                break;
            case "USD":
                multiplier = USD;
                break;
            default:
                System.out.println("Podano nieznaną walutę: " + currencySymbol);
        }
        System.out.println(plnAmount + " PLN to " + (plnAmount / multiplier) + " " + currencySymbol);


    }


}
