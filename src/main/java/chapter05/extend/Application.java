package chapter05.extend;

import chapter05.extend.model.*;

/**
 * 이동 수단
 */
public class Application {
    public static void main(String[] args) {
        WheelBased car = new Car("자동차");
        WheelBased bicycle = new Bicycle("자전거");
        NonWheelBased ship = new Ship("배");

        car.getWheelCount();
        bicycle.getWheelCount();

        ship.chargeBattery();

        car.start();
        ship.start();
        bicycle.start();

        car.stop();
        ship.stop();
        bicycle.stop();
    }
}
