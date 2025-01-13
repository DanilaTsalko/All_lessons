package lesson_8;

public class Employee {
    private String FullName;
    private String title;
    private String email;
    private String phoneNumber;
    private double salary;

    public int getAge() {
        return age;
    }

    private int age;


    public Employee(String FullName, String title, String email, String phoneNumber, double salary, int age) {
        this.FullName = FullName;
        this.title = title;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.println("ФИО: " + FullName);
        System.out.println("Должность: " + title);
        System.out.println("Email: " + email);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }


}
