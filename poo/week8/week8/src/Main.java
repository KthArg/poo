import Models.Car;
import Models.Truck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020, 4, false);
        Truck truck = new Truck("Ford", "F-150", 2019, 1300.5, 2);

        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Truck Make: " + truck.getMake());
        System.out.println("Truck Payload Capacity: " + truck.getPayloadCapacity());
    }
}