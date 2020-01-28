package introduction;

public class Welcome
{
    public static void main(String[] args)
    {
        String[] greeting = new String[3];
        greeting[0] = "Witaj, Pawel!";
        greeting[1] = "Zaczynamy przygode z java";
        greeting[2] = "Nie bedzie tak strasznie";
        for (String g : greeting)
            System.out.println(g);

        //poniżej użyłem zmiennych które sam zdeklarowałem

        int vacationDays;
        vacationDays = 12;
        System.out.println(vacationDays);

        double sallary;
        sallary = 1.744D;
        System.out.print(sallary);


    }
}

