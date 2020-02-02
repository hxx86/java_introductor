package classes.basics;

public class Test {

    public static void main(String[] args) {
        User adam = new User("Adam", "kowalski", 45);
       //  adam.name = "Adam";
        // adam.lastname = "Kowalski";
      //  adam.age = 36;
       // System.out.println(adam.name);  //nazwa andam . pole name
      //  System.out.println(adam.lastname);
      //  System.out.println(adam.age);

        User jozek = new User("jozek", "nowak", 34);
       // jozek.name = "Jozek";
        //jozek.lastname = "nowak";
       // jozek.age = 42;
        jozek.introduce();

        User cloneJozek = new User(jozek);
        cloneJozek.introduce();
        cloneJozek.name = "Robert";
        cloneJozek.introduce();

        System.out.println("Jozek:" + jozek + "  ,Robert: " + cloneJozek);

    }
}
