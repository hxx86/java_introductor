package introduction;



public class SimpleTypes {

    public static void main(String[] args) {
        int age;
        age = 34;
        System.out.println("Wiek to " + age);

        long lottoReward = 32_000_000L;
        System.out.println("wygrana w lotto " + lottoReward);

        short dayOfMonth = 29;
        System.out.println("dzień miesiąca " + dayOfMonth);
        dayOfMonth = 23;
        System.out.println("dzień miesiąca " + dayOfMonth);

        final float PI_PI = 3.14F;
        System.out.println("Liczba PI to " + PI_PI);

        double distans = 12.76788778D;
        System.out.println("Ilość Metrów i milimetrów to " + distans);

        boolean isPaid = false;
        System.out.println("czy zapłacono rachunek? " + isPaid);
        isPaid = true;
        System.out.println("a może teraz już zapłacono? " + isPaid);

    }
}
