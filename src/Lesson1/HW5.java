package Lesson1;

public class HW5 {

    public static void main(String[] args) {

        Worker[] workerArray = new Worker [5];
        workerArray[0] = new Worker (1 ,"Sergey" , "manager" , "sergey@kompany.ru" , 1111 , 40000 , 25 ,  "Male");
        workerArray[1] = new Worker (2 ,"Ivan" , "manager" , "ivan@kompany.ru" , 2222 , 40000 , 41 ,  "Male");
        workerArray[2] = new Worker (3 ,"Viktoria" , "boss" , "viktoria@kompany.ru" , 3333 , 40000 , 45 ,  "Female");
        workerArray[3] = new Worker (4 ,"Julia" , "manager" , "julia@kompany.ru" , 4444 , 40000 , 38 ,  "Female");
        workerArray[4] = new Worker (5 ,"Evgen" , "manager" , "evgen@kompany.ru" , 5555 , 40000 , 42 ,  "Male");

        workersAgeCount(workerArray);

       }


    public static void workersAgeCount(Worker[] workerArray){

        System.out.println("На данный момент в компании числятся следующие работники старше 40 лет:");

        int agedWorkersCount = 0;

        for (int j = 0 ; j < workerArray.length ; j++ ){
            if (workerArray[j].getWorkerAge() >= 40 ) {
                agedWorkersCount++;
                System.out.println(workerArray[j].getWorkerName() + ", работает в должности: " + workerArray[j].getWorkerPosition() + ", возраст: " + workerArray[j].getWorkerAge() + " лет.");
            }

          }
        System.out.println("Итого , " + agedWorkersCount + " возрастных сотрудников");

    }





}
