package lesson_8;

public class Main {
    public static void main(String[] args) {

    Employee[] employees = new Employee[5];
    employees[0]= new Employee("Андреев Иван Олегович", "Бухгалтер", "Ivan@gmail.com", "+375000000",700.23,43);
    employees[1] = new Employee("Павлов Олег Валентинович","Стажёр","Oleg@gmail.com","+375111111",500,20);
    employees[2] = new Employee("Сидоров Сидор Сидорович", "Программист", "sidorov@mail.com", "+3752377788", 70000, 41);
    employees[3] = new Employee("Антонов Антон Антонов", "Дизайнер", "antonov@mail.com", "+375311122", 55000, 28);
    employees[4] = new Employee("Алексеева Анна Алексеевна", "Аналитик", "alekseeva@mail.com", "+375366699", 60000, 50);

// Вывод информации только о сотрудниках старше 40 лет
    System.out.println("Сотрудники старше 40 лет:");
    for (Employee employee : employees) {
        if (employee.getAge() > 40) {
            employee.printInfo();
        }
    }
    }
}