package chapter05.extend.model;

import chapter05.extend.service.EngineService;

public class Ship extends NonWheelBased implements EngineService {
    public Ship(String name) {
        super(name);
    }
}
