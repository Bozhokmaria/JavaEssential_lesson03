package task2;

public class Vehicle {
    double cost;
    double speed;
    int year;

    public Vehicle() {
        cost = 1000;
        speed = 210;
        year = 1999;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
