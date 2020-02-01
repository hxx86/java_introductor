package arrays;

public class Exercise2 {

    public static void main(String[] args) {

        String [] names = new String[] {
          "Ala",
          "Ola",
          "Andrzej",
          "Brunchilda",
          "Bożydar",
          "Sławomir",
          "Stanisław",
          "władysław",
          "Petronela",

        };
        /*
        1 wypisz imiona żeńskie
        2 wypisz imiona żeńskie niedłużesze niż 3 znaki
        3 wypisz imiona słowiańskie kończące się na "sław" lub "mir"
        4 znajdz najdłużesze imię

         */
        for (String name: names) {
            if (name.endsWith("a")) {
                System.out.println(name+ " to imie jest żeńskie " );
            } else {
                System.out.println(name+ "to imię jest męskie ");
            }




        }
    }

}
