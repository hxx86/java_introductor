package arrays;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        String[] names = new String[]{
                "Ala",
                "Ola",
                "Andrzej",
                "Brunchilda",
                "unchildana",
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
        4 znajdz najdłużesze imię mimo ze oba maja ta sama dlugosc Wtedy uzyj pętli

          int longestNameLength = 0;

        for (String name : names) {
            if (longestNameLength < name.length()) {
                longestNameLength = name.length();
                for (String name: names ) {
                    if longestNameLength == name.length()) {
                        System.out.println(name);
      ***********************************************************************************


                        for i = 0;
                        for ( ; ; ) {
                            System.out.println(names[i]);
                            i++;
                            if ()
                               break;
                               LUB





         */

       /* String newLine = System.lineSeparator();

        String multilineString = "Ala ma kota " + newLine + " Ala ma mleko" + newLine + "ala ma marchewke ";
        System.out.println(multilineString); */



        for (String name : names) {


            if (name.endsWith("a")) {
                System.out.println(name + " to imie jest żeńskie ");
            } else {
                System.out.println(name + " to imię jest męskie ");

            }
            if (name.length() == 3 && name.endsWith("a")) {  //w string length metoda jest funkcja
                {
                    System.out.println(name + " to imię żeńskie 3 literowe");
                }


                if (name.endsWith("mir") | name.endsWith("ław")) {
                    System.out.println(name + " to imię słowiańskie");
                } else {
                    System.out.println(name + " to imię nieslowianskie");
                }
            }


        }

        { StringBuilder longestName = new StringBuilder();
        StringBuilder tempLongestName = new StringBuilder();
        int longestLength = 0;
        for (String name : names) {
            if (name.length() == longestLength) {
                tempLongestName.append(name).append(" ");
                longestName.replace(0, longestName.length(), String.valueOf(tempLongestName));
            }
            if (name.length() > longestLength) {
                longestLength = name.length();
                tempLongestName.replace(0, tempLongestName.length(), name + " ");
                longestName.replace(0, longestName.length(), String.valueOf(tempLongestName));
            }
        }
        System.out.println("Najdłuższe imię/imiona to: " + longestName);
            System.out.println("**************************************************************");

    }
        for (int i = 0; i < names.length ; i++) {    //PETLA FOR Z ZATR
            if (names[i].endsWith("mir")) {
                break;
            }
            System.out.println(names[i]);
        }


    }
}
