package chapter05.extend.model;

import chapter05.extend.service.EngineService;
import lombok.Getter;

@Getter
public abstract class NonWheelBased implements EngineService {
    private final String name;

    protected NonWheelBased(String name) {
        this.name = name;
    }

    public void chargeBattery() {
        System.out.println("배터리 또는 연료를 충전합니다.");
    }

    @Override
    public void start() {
        System.out.println(this.name + " start");
    }

    @Override
    public void stop() {
        System.out.println(this.name + " stop");
    }
}
