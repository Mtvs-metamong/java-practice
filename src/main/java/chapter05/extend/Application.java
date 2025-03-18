package chapter05.extend;

import chapter05.extend.model.*;
import chapter05.extend.service.EngineService;

/**
 * 이동 수단
 */
public class Application {
    public static void main(String[] args) {
        EngineService[] engines = {
            new Car("자동차"),
            new Bicycle("자전거"),
            new Ship("배")
        };

        for (EngineService engine : engines) {
            engine.start();
            if (engine instanceof NonWheelBased) {
                ((NonWheelBased) engine).chargeBattery();
            } else {
                ((WheelBased) engine).getWheelCount();
            }
            engine.stop();
        }
    }
}
