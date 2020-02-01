package loops;

public class Loops {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i <= 20) {
            sum = sum + i;
            i++;  // zwiekszenie o 1
        }
        System.out.println("Suma lizba od 0 do 20 to " + sum);
        i = 1;

        do {
            if (i % 2 == 0) {
                System.out.println(i + " to liczba parzysta");
            }
            i++;

        } while (i <= 20);

    }
}