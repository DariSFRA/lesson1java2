package com.company;

public class Cat implements Participant {
    public boolean lost;
  private final int jumpLimit;
    private final int runLimit;

    public Cat(int runLimit, int jumpLimit) {
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
            System.out.printf("Кот смог пробежать - %s\n", runningTrack);
        }
        else {
            System.out.printf("Кот не смог пробежать - %s\n", runningTrack);
            lost = true;
        }
    }
    @Override
    public  void jump(Wall wall) {
        if (wall.height <= jumpLimit) {
            System.out.printf("Кот смог подпрыгнуть - %s\n", wall);
        } else {
            System.out.printf("Кот не смог подпрыгнуть - %s\n", wall);
            lost = true;
        }
    }

}
