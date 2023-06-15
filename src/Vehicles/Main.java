package Vehicles;

public class Main {
    public static void main(String[] args) {
        Vehicles car = Vehicles.CAR;
        Vehicles motorcycle = Vehicles.MOTORCYCLE;
        Vehicles truck = Vehicles.TRUCK;

        System.out.println(car);
        System.out.println(motorcycle);
        System.out.println(truck);

        System.out.println("Car color: " + car.getColor());
    }
}

