package arrays;

public class Matrix {
//tablica wielowymiarowa
    public static void main(String[] args) {
        char [][] tree = new char[][] {        //tree zawiera referencje do innych tablic
            {' ',' ',' ','_', '*', '_'},
            {' ',' ',' ','*', '*', '*'},
            {' ',' ','*' ,'*', '*', '*','*'},    // tablice nie muszą mieć tyh samych rozmiarów
        };

        //używamy pętli for która jest ściśle przygotowana
        //do przeglądania tablic.
        for (int i= 0 ; i<tree.length ; i++) {
            for (int j=0 ; j < tree[i].length ; j++) {
                System.out.print(tree[i][j]);
            }
            System.out.println();
        }


    }

}
