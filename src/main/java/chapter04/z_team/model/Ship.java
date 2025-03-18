package chapter04.z_team.model;

public class Ship extends Machine implements EngineService {
    private final int wheel = 0;

    public Ship(String name) {
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
