package classes.basics;

public class Test {

    public static void main(String[] args) {
        User adam = new User("Adam", "kowalski", 17);
       //  adam.name = "Adam";
        // adam.lastname = "Kowalski";
      //  adam.age = 36;
        //  System.out.println(adam.name);  //nazwa andam . pole name
       //System.out.println(adam.lastname);
      // System.out.println(adam.age);

        User jozek = new User("jozek", "nowak", 34);
//        jozek.name = "Jozek";
//        jozek.lastname = "nowak";
//        jozek.age = 42;
//        jozek.introduce();

        User cloneJozek = new User(jozek);
        cloneJozek.introduce();
        cloneJozek.name = "Robert";
        cloneJozek.age = 20;
        cloneJozek.introduce();

        System.out.println("Jozek:" + jozek + "  ,Robert: " + cloneJozek);

        System.out.println("#######TEST WIEKU###########");
        System.out.println("czy Adam jest dorosły ?" + adam.isAdult());
        System.out.println("czy jozek jest dorosły ?" + jozek.isAdult());
        System.out.println("czy Robert jest dorosły ?" + cloneJozek.isAdult()); //cloneJozek to w rzeczywistosci robert


    }
}