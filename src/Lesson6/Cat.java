package Lesson6;

public class Cat extends  Animals {

        public Cat (String name) {
            super (name);
            this.runPoint = 200;
            this.swimPoint = 0;
        }

    void letsSwim (int swimDistance){
            System.out.println("PSSSSSSSSSSSSSSSSSSSSS!!! Meou!!! I can`t swim!!!");
    }


}
