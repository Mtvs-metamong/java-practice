package chapter04.practice.model;

import chapter04.practice.service.EngineService;

public class Ship extends NonWheelBased implements EngineService {

    public Ship(String name) {
        super(name);
    }

    @Override
    public void chargeBattery() {
        System.out.println(getName() + " 충전중");
    }
}
