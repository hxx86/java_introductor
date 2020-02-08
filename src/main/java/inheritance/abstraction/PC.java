package inheritance.abstraction;

public class PC implements Computer {


    @Override
    public void sendEmail(String adress, String content) {
        System.out.println("sending email " + content +"to adress "+ adress + " Using PC");

    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing Internet using PC");

    }
}
