package arrays;

public class Exercises {

    public static void main(String[] args) {


        int[] numbers = new int[]{23, 35, 56, 54, 98, 64, 34, 57, 31, 34, 57898, 88, 99, 12, 1489, 46, 788, 909};
        //znajdź maksymalną i minimalną wartość tablicy..

        int max = Integer.MIN_VALUE;
        max = numbers[0];

        int min = Integer.MAX_VALUE;
        min = numbers[0];
        double mean = 0.0D;

        for (int i = 0; i < numbers.length ; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }

            if (min > numbers[i]) {
                min = numbers[i];
            }
            mean += numbers[i];

        }
        System.out.println("Min: " + min + ", max " + max + "mean  "  + mean);

        //pętla for each
        //podzielne przez 3 liczby z tablicy
        for (int elem: numbers) {
            if (elem % 3 == 0 ) {
                System.out.println(elem + "  - jest podzielna przez 3 ");
            }
        }
    }
}