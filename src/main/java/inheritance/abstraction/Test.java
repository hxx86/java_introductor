package inheritance.abstraction;

public class Test {

    public static void main(String[] args) {
        Phone nokia = new Nokia3310(5);
        nokia.makeCall(323233243);
        nokia.sendSms(4455443, "cześć co sychać?");
        Computer pc = new PC();
        pc.browseInternet();
        pc.sendEmail("pawelaok120@gmail.com", "cesc dziendobry");

        Phone smartPhone = new SmartPhone();
        smartPhone.sendSms(434234,"hello");
        smartPhone.makeCall(432432);

        Computer smartPhone2 = new SmartPhone();
        smartPhone2.sendEmail("hassd@hmal.pl", "hej");
        smartPhone2.browseInternet();

    }

}
