package task2;

public class Ship extends Vehicle {
    int passengers;
    String port;

    public Ship(int passengers, String port) {
        this.passengers = passengers;
        this.port = port;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "passengers=" + passengers +
                ", port='" + port + '\'' +
                ", cost=" + cost +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
