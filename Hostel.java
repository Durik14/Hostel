import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Hostel {
    //Клас гуртожиток
    private List<Student> studetsHostel;//Список студентів що проживають
    private List<Employee> employeeHostel;//Список звичайних робітників
    private HostelEnvious main;//Завідуючий гуртожитком
    private String nameHostel;//Назва гуртожитку

    //Конструктор класу Hostel
    public Hostel(String Name, HostelEnvious _hostleEnv) {
        this.employeeHostel = new ArrayList<Employee>();
        this.studetsHostel = new ArrayList<Student>();

        this.nameHostel = Name;
        this.main = _hostleEnv;
    }

    //Додавання студента в якості мешканця гуртожитку
    public void AddStudent(Student student) {
        studetsHostel.add(student);
    }

    //Додавання робітника до гуртожитку
    public void Employee(Employee em) {
        employeeHostel.add(em);
    }


    public void displayStudents() {
        System.out.println("Мешканці гуртожитку:");
        for (Student s : studetsHostel) {
            s.introduce();
        }
        System.out.println();
        System.out.println();
    }

    public void displayEmployes() {
        System.out.println("Персонал гуртожитку:");
        for (Employee e : employeeHostel) {
            e.introduce();
        }
        System.out.println();
        System.out.println();
    }

    public void displayBoss() {



        System.out.println("Завідувач  гуртожитку:");

        main.introduce();
    }
}