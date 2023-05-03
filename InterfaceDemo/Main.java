package InterfaceDemo;

public class Main {

    public static void main(String[] args){
        DeskPhone myPhone = new DeskPhone("1234556667");
        myPhone.powerOn();
        myPhone.callPhone("1234556667");
        myPhone.answer();
    }
}