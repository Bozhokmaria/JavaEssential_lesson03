package task2;

public class Main {
    public static void main(String[] args) {

        Vehicle plane = new Plane(2000, 350);
        plane.setCost(160000);
        plane.setSpeed(950);
        Vehicle car = new Car();
        car.setCost(30000);
        Vehicle ship = new Ship(440, "Kiev");
        ship.setCost(44000);
        ship.setSpeed(350);

        System.out.println(plane.toString());
        System.out.println(car.toString());
        System.out.println(ship.toString());

    }
}
//output: Plane{height=2000.0, passengers=350, cost=160000.0, speed=950.0, year=1999}
//Car{cost=30000.0, speed=210.0, year=1999}
//Ship{passengers=440, port='Kiev', cost=44000.0, speed=350.0, year=1999}