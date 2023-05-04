package vehicleApp;

public class Car extends Vehicle {
    
    protected static int wheels;
    private String type;
    protected int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type) {
        super(name);
        this.type = type;
        this.gears = gears;
        this.doors = doors;
        this.isManual = isManual;
        this.wheels = wheels;
        currentGear = 1;
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("changeGear method called: changed to " + this.currentGear + " gear");
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        move(newSpeed, newDirection);
        System.out.println("Change speed method is called: speed -> " + newSpeed + " direction -> " + newDirection);
    }
    
}
