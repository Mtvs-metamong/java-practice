package chapter04.practice.model;

import chapter04.practice.service.EngineService;

public class Bicycle extends WheelBased implements EngineService {

    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void getWheelCount() {
        System.out.println(getName() + "의 바퀴 갯수 : 2");
    }
}
