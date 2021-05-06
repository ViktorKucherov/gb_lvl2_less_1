package viktor.kucherov;

public interface PlayerActions {
    void runInfo();
    void jumpInfo();
    boolean runThroughTreadmill(Treadmill treadmill);
    boolean jumpThroughWall(Wall wall);
    String successRunStatus(boolean status);
    String successJumpStatus(boolean status);

}
