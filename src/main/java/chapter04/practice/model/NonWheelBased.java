package chapter04.practice.model;

import chapter04.practice.service.EngineService;

public abstract class NonWheelBased implements EngineService {

    private String name;

    public NonWheelBased(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void start() {
        System.out.println("Starting " + getName());
    }

    @Override
    public void stop() {
        System.out.println("Stopping " + getName());
    }

    public abstract void chargeBattery();
}
