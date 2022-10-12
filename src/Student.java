import java.util.Scanner;

public class Student extends Main{
    int number, age;
    String name, lastName;
    double averageScore;

    public Student (int number, String name, String lastName, int age, double averageScore){
        this.number = number;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.averageScore = averageScore;

    }

    public void printInfo() {
        System.out.println(String.format("Номер зачётной книжки: %s\nИмя: %s\n" +
                "Фамилия: %s\nВозраст: %s\nСредний балл: %s", this.number, this.name, this.lastName,
                this.age, this.averageScore));
    }

    @Override
    public String toString() {
        return this.name + " "+ this.lastName;
    }

}
