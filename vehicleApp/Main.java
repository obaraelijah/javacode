package vehicleApp;

public class Main {
    public static void main(String[] args)
    {
        SUV fortuner = new SUV("Fortuner", false);
        fortuner.move(40, 0);
        fortuner.acceleration(20);
        //fortuner.acceleration(-60);
        System.out.println("Current Gear: " + fortuner.getCurrentGear());
        System.out.println("Current Gear: " + fortuner.getCurrentSpeed());
    }
}
