package petrolstation;

public class Station {
    int gasAmount;

    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    void refill(Car c) {
        gasAmount -= c.capacity;
        c.gasAmount += c.capacity;
    }
}
