 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        //Створення об'єкту завідуючого гуртожитком
        HostelEnvious envious = new HostelEnvious("Петро", "Духніч", 25, "...Славні Суденти...");

        //Стоврення об'єкту - гуртожиток
        Hostel hostel = new Hostel("Славні Студенти", envious);
        //Створення нового студента
        Student student1 = new Student("Марян ", "Городечний", 20, 2, "...Славні Студенти...");           //Створення нового студента
        Student student2 = new Student("Марія", "Сидоренко", 19, 1, "...Славні Студенти...");             //Створення нового студента
        Student student3 = new Student("Маряна", "Колич", 20, 3, "...Славні Студенти...");                //Створення нового студента
        Student student4 = new Student("Ірина", "Шевців", 17, 1, "...Славні Студенти...");                //Створення нового студента
        Student student5 = new Student("Володимир", "Ослаб", 22, 4, "...Славні Студенти...");             //Створення нового студента
        Student student6 = new Student("Андрій", "Огар", 24, 5, "...Славні Студенти...");                 //Створення нового студента
        Student student7 = new Student("Олег", "Вишеньцкий", 20, 1, "...Славні Студенти...");             //Створення нового студента
        Student student8 = new Student("Богдан", "Слюбик", 19, 1, "...Славні Студенти...");               //Створення нового студента
        Student student9 = new Student("Артем", "Довбик", 16, 2, "...Славні Студенти...");                //Створення нового студента
        Student student10 = new Student("Дмитрій", "Клчико", 20, 2, "...Славні Студенти...");             //Створення нового студента
        Student student11 = new Student("Любов", "Мазурчак", 21, 3, "...Славні Студенти...");             //Створення нового студента


        //Створення нового працівника
        Employee employee1 = new Employee("Василь", "Коваль", 30, "Прибиральник", 5000.0);
        //Створення нового працівника
        Employee employee2 = new Employee("Іван","Харків",59,"Охоронець",15.226);
        //Створення нового працівника
        Employee employee3 = new Employee("Андрій", "Коломойський", 35, "Прибилальник", 5000.0);
        //Створення нового працівника
        Employee employee4 = new Employee("Олег","Ляшко",42,"Охоронець",15.000);
        //Створення нового працівника
        Employee employee5 = new Employee("Євгенія", "Змисна", 22, "Комендантка", 20000.0);
        //Створення нового працівника
        Employee employee6 = new Employee("Галина","Заущак",29,"Комендантка",20000.0);



        hostel.AddStudent(student1);
        hostel.AddStudent(student2);
        hostel.AddStudent(student3);
        hostel.AddStudent(student4);
        hostel.AddStudent(student5);
        hostel.AddStudent(student6);
        hostel.AddStudent(student7);
        hostel.AddStudent(student8);
        hostel.AddStudent(student9);
        hostel.AddStudent(student10);
        hostel.AddStudent(student11);
        hostel.Employee(employee1);
        hostel.Employee(employee2);
        hostel.Employee(employee3);
        hostel.Employee(employee4);
        hostel.Employee(employee5);
        hostel.Employee(employee6);
        hostel.displayStudents();
        hostel.displayEmployes();
        hostel.displayBoss();

    }
}