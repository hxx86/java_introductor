package classes;

class User {
    String name;
    String lastname;
    int age;

    User(String name, String lastname, int age){
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



}
