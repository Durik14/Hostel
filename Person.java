import java.util.Scanner;
public abstract class Person {
    //Клас людина - основний клас
    private String firstName;//Ім'я
    private String lastName;//Призвіще
    private int age;//Вік

    //Конструктор класу Person
    public Person(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.age = age;
    }

    //Метод для визначення ім'я людини
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        if (name == "") {
            firstName = "Петро";
        } else {
            firstName = name;
        }
    }

    //Метод для визначення прізвища людини
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == "") {
            this.lastName = "Калишин";
        } else {
            this.lastName = lastName;
        }
    }

    //Метод для визначення віку людини
    public int getAge() {
        return age;
    }

    // Абстрактний метод, який буде перевизначений у підкласах
    public abstract void introduce();
}



