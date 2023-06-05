import java.util.Scanner;

public class Employee extends  Person{
    private String position;
    private double salary;

    public Employee(String firstName, String lastName, int age, String position, double salary) {
        super(firstName, lastName, age);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void introduce() {
            Scanner s = new Scanner(System.in);
            System.out.println("Вітаємо вас у нашому гуртожитку для того щоб получити доступ до даних персоналу введіть пароль ");
            int st = s.nextInt();
            if(st==2222){
                System.out.println("Привіт! Я " + position + " " + getFirstName() + " " + getLastName() +
                        ". Моя заробітна плата становить " + salary + " грн.");
            }
            else  {
                System.out.println("ПОМИЛКА!!!Невірний пароль");

    }
}
    }