package AtHome;

public class Arrays {
    public static void main(String[] args) {
        int tab[] = new int[5];
        tab[0] = 6;
        tab[1] = 5;
        tab[2] = 9;
        tab[3] = 4;
        tab[4] = 1;
        //  for (int i : tab) // petla for each
        for (int i = 0; i < tab.length; i++) {
            System.out.println("zmienna i =" + tab[i]);

        }
        for (int x : tab) {
            System.out.println(x);

        }
        int n = 10;
        while (n >= 0) ;
        {
        System.out.println("cokolwiek " + n);
        n--;
    }



    }
}
