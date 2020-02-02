package classes.basics;

public class User {
   public String name;
    String lastname;
    int age;

    static final int MIN_AGE = 18;

   public User(String name, String lastname, int age){
        this.name=name;
        this.lastname=lastname;
        this.age=age;
    }

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
        return isAdult; //return mzoe wystapic w metodach void ale wtedy jest uzywana jako zatrzyanie

    }



}
