package classes.basics;

import javax.naming.Name;

public class User {
   public String name;
    String lastname;
    int age;
//statyczna final int name okresla wartosc minimalna lubmakxymalna wartosci
    static final int MIN_AGE = 18;





    User(User other) {
         name = other.name;
         lastname = other.lastname;
        age = other.age;


    }



    void introduce() {
        //ciało metody, jesli byly by parametry dodajemy this.name this.lastname itp
        System.out.println("imię: " + name + ", nazwisko: " + lastname + ", wiek: " + age);
    }

    boolean isAdult(){
        boolean isAdult = age >= MIN_AGE;
        return isAdult;
        //return mzoe wystapic w metodach void ale wtedy jest uzywana jako zatrzyanie



    }



}
