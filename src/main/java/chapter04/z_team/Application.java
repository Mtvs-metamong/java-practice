package chapter04.z_team;

import chapter04.z_team.model.Bicycle;
import chapter04.z_team.model.Car;
import chapter04.z_team.model.Machine;
import chapter04.z_team.model.Ship;
import chapter04.z_team.service.EngineService;

public class Application {
    public static void main(String[] args) {
        System.out.println("=== 기계 특징과 Wheel 개수 ===");

        Machine bicycle = new Bicycle("야마하");
        Machine car = new Car("도요타");
        Machine ship = new Ship("천리안");

        // 모든 기계는 시작과 정지가 가능하다.
        bicycle.start();
        car.start();
        ship.start();

        bicycle.stop();
        car.stop();
        ship.stop();

        ((EngineService) car).DefaultEngine(car.getName());
        ((EngineService) ship).DefaultEngine(ship.getName());

        System.out.println("=== 설계의 간편화 ===");
        Machine[] machines = {bicycle, car, ship};

        for (Machine machine : machines) {
            machine.start();

            // Wheel 개수를 출력
            if (machine instanceof Bicycle) {
                System.out.println(machine.getName() + "의 바퀴 개수: " + ((Bicycle) machine).getWheel());
            } else if (machine instanceof Car) {
                System.out.println(machine.getName() + "의 바퀴 개수: " + ((Car) machine).getWheel());
            } else {
                System.out.println(machine.getName() + "은(는) 바퀴가 없습니다.");
            }

            if (machine instanceof EngineService) {
                ((EngineService) machine).DefaultEngine(machine.getName());
            }
            machine.stop();
        }
    }
}