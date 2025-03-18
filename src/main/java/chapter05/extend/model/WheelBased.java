package chapter05.extend.model;

import chapter05.extend.service.EngineService;
import lombok.Getter;

@Getter
public abstract class WheelBased implements EngineService {
    private final String name;

    public WheelBased(String name) {
        this.name = name;
    }

    public abstract void getWheelCount();

    @Override
    public void start() {
        System.out.println(this.name + " start");
    }

    @Override
    public void stop() {
        System.out.println(this.name + " stop");
    }

}
