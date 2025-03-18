package chapter05.extend.model;

import chapter05.extend.service.EngineService;
import lombok.Getter;

@Getter
public class Bicycle extends WheelBased  implements EngineService {
    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void getWheelCount() {
        System.out.println("바퀴 수 : 2");
    }
}
