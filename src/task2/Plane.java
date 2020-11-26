package task2;

public class Plane extends Vehicle{
    double height;
    int passengers;

    public Plane(double height, int passengers) {
        this.height = height;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", passengers=" + passengers +
                ", cost=" + cost +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
