package arrays;

public class Arrays {

    public static void main(String[] args) {
        // 1 typ elementu int [], nastepnie deklarujemy nazwe tablicy ages np

        int [] ages = new int[3];
        ages [0] = 10;
        ages [1] = 30;
        ages [2] = 50;
        //inny sposob na inicjalizacje tablicy
        int [] heights =new int[] {12, 32, 56, 63, 43, 78, 32, 54, 89};

//        System.out.println("Element 1 to " + "to " + ages[0]);
//        System.out.println("Element 2 to " + "to " + ages[1]);
//        System.out.println("Element 3 to " + "to " + ages[2]);
//
//        System.out.println("wielkość tablicy: " + ages.length); //ilosc eeleentow w tablicy
//
//        System.out.println("Używamy pętli");                    //tutaj rzykład z pętlą

        int i =0;
        while (i < heights.length) {
            System.out.println("Element " + (i + 1) + " to " + heights[i]);
            i++; //inkrementacja zatrzymujac pętle
        }


    }
}
