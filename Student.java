import java.util.Scanner;
public class Student extends Person {
    //Клас студент - наслідник класу людина
    private int course;//номер курсу студента
    private String hostel;//Назва гуртожитку

    //Конструктор класу, та разом з тим і ініціалізація основного класу
    public Student(String firstName, String lastName, int age, int course, String hostel) {
        super(firstName, lastName, age);
        this.course = course;
        this.hostel = hostel;
    }

    // Перевизначений метод introduce() з класу Person

    @Override
    public void introduce(){
        Scanner s = new Scanner(System.in);
        System.out.println("Вітаємо вас у нашому гуртожитку для того щоб получити доступ до даних студента введіть пароль ");
        int st = s.nextInt();
        if(st==1111){

        System.out.println(" Я студент " + getFirstName() + " " + getLastName() +
                ". Я навчаюся на " + course + " курсі та проживаю у гуртожитку " + hostel + ".");
    }
        else  {
            System.out.println("ПОМИЛКА!!!Невірний пароль");




        }
    }
}




