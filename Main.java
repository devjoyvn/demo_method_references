import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("A", 10, "MALE", 4));
        students.add(new Student("B", 18, "FEMALE", 6));
        students.add(new Student("C", 12, "MALE", 3));
        students.add(new Student("D", 20, "FEMALE", 10));
        students.add(new Student("E", 21, "MALE", 7));
        students.add(new Student("F", 16, "FEMALE", 5));

        // Sort age asc
        Collections.sort(students, (o1, o2) -> Student.compareByAge(o1, o2));
        Collections.sort(students, Student::compareByAge);

        students.stream().map(s -> s.getSex()).forEach(e -> System.out.println(e));
        students.stream().map(Student::getSex).forEach(System.out::println);

    }
}
