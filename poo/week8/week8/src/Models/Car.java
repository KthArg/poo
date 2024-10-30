package Models;

public class Car extends Vehicle {
    private int numberOfDoors;
    private boolean isElectric;

    public Car(String make, String model, int year, int numberOfDoors, boolean isElectric) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }
}
