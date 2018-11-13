package petrolstation;

public class Main {
    public static void main(String[] args) {
        Station s1 = new Station(100000);
        Car c1 = new Car();
        s1.refill(c1);
        System.out.println("Car's gas amount: "+c1.gasAmount+", station's gas amount: "+s1.gasAmount);
    }
}