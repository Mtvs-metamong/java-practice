package chapter04.z_team.model;

public class Car extends Machine implements EngineService {

    private final int wheel = 4;

    public Car(String name) {
        super(name);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    public int getWheel() {
        return wheel;
    }
}
