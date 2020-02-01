package introduction;

public class Strings {

    public static void main(String[] args) {
        String text = "Ala ma kota";
        String text2 = "Ala ma kota";

        System.out.println("text1: " + text + " , text2: " + text2);
        System.out.println("czy obie zmiene to to samo? " + text.equals(text2)); //tutaj porównałem text z text2

        // utworz string "ala a kota" uzywajac StringBuildera i metody oppened.

        StringBuilder builder = new StringBuilder();
        builder.append("Ala ");
        builder.append("ma ");
        builder.append("dwa ");
        builder.append("koty ");
        String resoultText = builder.toString();

        System.out.println("Napis utworzony przez buildera " + builder.toString());
// ilość znaków w zdaniu
        String text3 = "Litwo oojcczyzno moja ";
        int n = text.length();
        System.out.println("ilość liter to " + n);

// która literka to która literka
        char five = text.charAt(4);
        System.out.println("piąta literka w napisie to "+ five);

//czy "Ala ma kota zaczyna sie od Ala."
        boolean alaStartWith = text.startsWith("Ala");


        System.out.println("Czy napis ala ma kota zaczyna się od Ala ? " + alaStartWith );

//sprawdz na którymmiejscu znajduje sie znak "d " wnapisie "abcdefgh"
        String text4 = ("abcdefgh");
        //to do at home.


    }
}
