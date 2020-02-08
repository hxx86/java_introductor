package inheritance.abstraction;

public class Nokia3310 implements Phone {

    private int batteryLevel;

    public Nokia3310(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void sendSms(int number, String content) {
        System.out.println("Sending SMS to " + number + " with content " + content + "using Nokia 3310");

    }

    @Override
    public void makeCall(int number) {
        System.out.println("calling "+ number + "NOkia 3310");

    }

    public void  playSnake(){
        System.out.println("Playing Snake on nokia 3310");
    }
}
