import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Іван", 1));
        students.add(new Student("Степан", 2));
        students.add(new Student("Лілія", 3));
        students.add(new Student("Влад", 2));
        students.add(new Student("Оксана", 1));
        students.add(new Student("Світлана", 3));
        students.add(new Student("Василь", 2));
        students.add(new Student("Віталій", 1));
        students.add(new Student("Олег", 2));
        students.add(new Student("Марія", 3));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер курсу: ");
        int course = scanner.nextInt();

        System.out.println("Студенти на курсі " + course + ":");
        Student.printStudents(students, course);

    }
}