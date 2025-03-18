package chapter04.z_team.model;

public class Bicycle extends Machine {

    private final int wheel = 2;

    public Bicycle(String name) {
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