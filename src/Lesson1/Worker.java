package Lesson1;

public class Worker {
    private int workerId;
    private String workerName;
    private String workerPosition;
    private String workerEmail;
    private int workerPhone;
    private int workerSalary;
    private int workerAge;
    private String workerSex;

    public Worker (int workerId , String workerName , String workerPosition , String workerEmail , int workerPhone , int workerSalary , int workerAge , String workerSex) {
        this.workerId = workerId;
        this.workerName = workerName;
        this.workerPosition = workerPosition;
        this.workerEmail = workerEmail;
        this.workerPhone = workerPhone;
        this.workerSalary = workerSalary;
        this.workerAge = workerAge;
        this.workerSex = workerSex;
    }

    public void workerInformation(){
        System.out.println("ID:" + workerId + ", Worker name:" + workerName + ", position:" + workerPosition + ", Email:" + workerEmail + ", Phone:" + workerPhone + ", salary:" + workerSalary + "age:" + workerAge + ", sex:" + workerSex);
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerPosition() {
        return workerPosition;
    }

    public void setWorkerPosition(String workerPosition) {
        this.workerPosition = workerPosition;
    }

    public String getWorkerEmail() {
        return workerEmail;
    }

    public void setWorkerEmail(String workerEmail) {
        this.workerEmail = workerEmail;
    }

    public int getWorkerPhone() {
        return workerPhone;
    }

    public void setWorkerPhone(int workerPhone) {
        this.workerPhone = workerPhone;
    }

    public int getWorkerSalary() {
        return workerSalary;
    }

    public void setWorkerSalary(int workerSalary) {
        this.workerSalary = workerSalary;
    }

    public int getWorkerAge() {
        return workerAge;
    }

    public void setWorkerAge(int workerAge) {
        this.workerAge = workerAge;
    }

    public String getWorkerSex() {
        return workerSex;
    }

    public void setWorkerSex(String workerSex) {
        this.workerSex = workerSex;
    }



    //1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2. Конструктор класса должен заполнять эти поля при создании объекта.
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//4. Создать массив из 5 сотрудников.
//            Пример:
//    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
//    persArray[1] = new Person(...);
//...
//    persArray[4] = new Person(...);

//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
}
