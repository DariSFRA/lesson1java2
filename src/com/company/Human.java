package com.company;

public class Human implements Participant {
    public boolean lost;
    private final int runLimit;
    private final int jumpLimit;
    public Human(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }
    @Override
    public boolean getStatus() {
        return this.lost;
    }
    @Override
    public void run(RunningTrack runningTrack) {
        if (runningTrack.length <= runLimit) {
            System.out.printf("Человек смог пробежать - %s\n", runningTrack);
        } else {
            System.out.printf("Человек не смог пробежать - %s\n", runningTrack);
            lost = true;
        }
    }
    @Override
    public  void jump(Wall wall) {
        if (wall.height <= jumpLimit) {
            System.out.printf("Человек смог прыгнуть - %s\n", wall);
        } else {
            System.out.printf("Человек не смог прыгнуть - %s\n", wall);
            lost = true;
        }
    }
}
