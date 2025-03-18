package chapter04.z_team.model;

public abstract class WheelBased extends Machine {

    public WheelBased(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(this.getName() + " 시작 ");
    }

    @Override
    public void stop() {
        System.out.println(this.getName() + " 정지 ");
    }


}