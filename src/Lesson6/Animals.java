package Lesson6;

public class Animals {
    protected String name;
    protected int runPoint;
    protected int swimPoint;

    public Animals (String name){
        this.name = name;
    }

    void letsRun (int runDistance) {
        if (runDistance > runPoint){
            System.out.println("I can`t run so far! I`m able to run " + runPoint + " meters.");
            } else {
                runPoint -= runDistance;
                System.out.println(name + " runs " + runDistance + " meters. And now it can run " + runPoint + " meters more.");
                }
    }

    void letsSwim (int swimDistance){
        if (swimDistance > swimPoint){
            System.out.println("I can`t swim so far! I`m able to swim " + swimPoint + " meters.");
        } else {
            swimPoint -= swimDistance;
            System.out.println(name + " swims " + swimDistance + " meters. And now it can swim " + swimPoint + " meters more.");
        }
    }




}
