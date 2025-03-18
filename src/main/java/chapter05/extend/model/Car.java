package chapter05.extend.model;

import lombok.Getter;

@Getter
public class Car extends WheelBased {
    public Car(String name) {
        super(name);
    }

    @Override
    public void getWheelCount() {
        System.out.println("바퀴 수 : 4");
    }
}
