package chapter04.practice;

import chapter04.practice.model.*;

public class Application {
    public static void main(String[] args) {

        WheelBased car = new Car("자동차");
        NonWheelBased ship = new Ship("배");
        WheelBased bicycle = new Bicycle("자전거");

        car.start();
        car.getWheelCount();
        car.stop();

        ship.start();
        ship.chargeBattery();
        ship.stop();

        bicycle.start();
        bicycle.getWheelCount();
        bicycle.stop();
    }
}
