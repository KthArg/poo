package Models;

public class Truck extends Vehicle {
    private double payloadCapacity;
    private int numberOfAxles;

    public Truck(String make, String model, int year, double payloadCapacity, int numberOfAxles) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }
}
