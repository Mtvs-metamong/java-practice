package chapter04.z_team.model;

public abstract class Machine {
    private String name;
    private int wheel;

    public Machine(String name) {
        this.name = name;
    }

    public abstract void start();
    public abstract void stop();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

}