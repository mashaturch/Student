import java.util.Scanner;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Group group = new Group(new ArrayList<Student>(), "20245");
        group.addStudent(new Student(123456, "Мария", "Турчинович", 20, 4.8));
        group.addStudent(new Student(123450, "Татьяна", "Зубарева", 19, 4.6));
        group.addStudent(new Student(123451, "Иван", "Иванов", 20, 4.0));
        group.addStudent(new Student(123452, "Руслан", "Васильев", 19, 4.3));
        group.addStudent(new Student(123480, "Михаил", "Васнецов", 19, 4.7));


        group.printInfo();
        System.out.println("-----------------------");
        group.getByNumber(123480).printInfo();
        System.out.println("-----------------------");
        System.out.println(group.getAll());
        System.out.println("-----------------------");
        System.out.println(group.getCountByAge());
        System.out.println("-----------------------");
        System.out.println(group.getByMinScore(4.8));
        System.out.println("-----------------------");
        group.deleteStudent(group.getByNumber(123450));
        group.printInfo();

        int i = 0;
        while (i != 8) {
            System.out.print ("Вы хотите...\n1. Добавить студента\n2. Получить студента по номеру зачётной книжки\n" +
                    "3. Удалить студента из группы\n4. Получить всех студентов группы\n5. Получить мапу\n6. Получить список " +
                    "студентов с учётом среднего балла\n7. Распечатать информацию о студентках\n8. Выйти\nВыберите цифру!\n");
            Scanner iIn = new Scanner(System.in);
            i = iIn.nextInt();
            if (i == 1) {
                System.out.print("Введите номер зачётной книжки: ");
                Scanner numScan = new Scanner(System.in);
                int num = numScan.nextInt();
                System.out.print("Введите имя студента: ");
                Scanner nameScan = new Scanner(System.in);
                String name = nameScan.nextLine();
                System.out.print("Введите фамилию студента: ");
                Scanner lastNameScan = new Scanner(System.in);
                String lastName = lastNameScan.nextLine();
                System.out.print("Введите возраст студента: ");
                Scanner ageScan = new Scanner(System.in);
                int age = ageScan.nextInt();
                System.out.print("Введите средний балл студента: ");
                Scanner averageScoreScan = new Scanner(System.in);
                String averageScoreString = averageScoreScan.nextLine();
                double averageScore = Double.parseDouble(averageScoreString);
                group.addStudent(new Student(num, name, lastName, age, averageScore));
            } else if (i == 2) {
                System.out.print("Введите номер зачётной книжки: ");
                Scanner numScanIn = new Scanner(System.in);
                int numIn = numScanIn.nextInt();
                group.getByNumber(numIn).printInfo();
            } else if (i == 3) {
                System.out.print("Введите номер зачётной книжки студента, которого хотите удалить: ");
                Scanner numDelIn = new Scanner(System.in);
                int numDel = numDelIn.nextInt();
                group.deleteStudent(group.getByNumber(numDel));
            } else if (i == 4) {
                group.printInfo();
            } else if (i == 5) {
                System.out.println(group.getCountByAge());
            } else if (i == 6) {
                System.out.print("Введите средний балл: ");
                Scanner numIn = new Scanner(System.in);
                String numString = numIn.nextLine();
                double num = Double.parseDouble(numString);
                System.out.println(group.getByMinScore(num));
            } else if (i == 7) {
                group.printInfo();
            } else if (i != 8) {
                System.out.println("Вы неправильно ввели цифру, повторите ещё раз!");
            }

            if (i != 8) {
                System.out.println("-----------------");
            }

        }
    }
}
