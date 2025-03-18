package chapter04.z_team.service;

public interface EngineService {

    default void DefaultEngine(String name) {
        System.out.println(name + " 시작 중!");
    }
}
