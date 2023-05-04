package vehicleApp;

public class SUV extends Car {

    public SUV(String name, int gears, boolean isManual) {
        super(name, 4, 5, gears, isManual, "SUV");
    }

    public void acceleration(int rate) {
        int newSpeed = getCurrentSpeed() + rate;
        
    }
}