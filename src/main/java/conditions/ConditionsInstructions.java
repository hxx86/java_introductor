package conditions;

import java.util.Scanner;

public class ConditionsInstructions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cześć jak masz na imie? " );
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + " !");

        if (name.endsWith("a")) {
            System.out.println("Zgaduję , że jesteś kobietą. ");
        } else {
            System.out.println("Zgaduję , że jesteś męszczyzną. ");
        }

        System.out.println("Ile masz lat " );
        int age = scanner.nextInt();
        String ending = "lat ";
        if (age < 10 || age > 20) {
        switch (age % 10) {     //<=== % to reszta z dzielenia  modulo czyli reszta na przykład (93 % 10) zostaje 3
            case 2:
            case 3:
            case 4:
                ending = "lata ";
                break;
            default:
                ending = "lat ";
        }
        }
        System.out.println("fajnie że masz " + age + " " + ending + "! ");


        if (age >= 21) {
            System.out.println("jesteś osobą dorosłą w USA ");
            //if mozna laczyc z innymi ifami przyklad w usa wiek dorosly to 21 lat
        } else if (age>=18){
            System.out.println("jesteś osobą dorosłą w Polsce");

        }





    }
}
