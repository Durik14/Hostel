
import java.util.Scanner;


public class HostelEnvious extends Person{
    //Клас завідуючого - наслідник класу людина
    private String hostel;//назва гуртожитку


    //Конструктор класу
    public HostelEnvious(String firstName, String lastName, int age, String hostel) {
        super(firstName, lastName, age);
        this.setHostel(hostel);
    }

    //Метод визначення назви гуртожитку за який відповідає завідуючий
    public String getHostel() {
        return hostel;
    }
    public  void setHostel( String h)
    {
        if(h=="")
        {
            hostel = "Славні Студенти";
        }
        else {
            hostel = h;
        }
    }

    //Перевизначений метод з класу Person
    @Override
    public void introduce() {
        Scanner s = new Scanner(System.in);
        System.out.println("Вітаємо вас у нашому гуртожитку для того щоб получити доступ до даних завідуючого введіть пароль ");
        int st = s.nextInt();
        if (st == 7777) {
            System.out.println("Привіт! Я завідуючий гуртожитку  " + getFirstName() + " " + getLastName() + ".Я можу надати житло студентам у гуртожитку" + hostel  );
        } else {
            System.out.println("ПОМИЛКА!!!Невірний пароль");
        }
    }
}