package javaCoding.streams;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private Long id;
    public Student(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
public class ExtractStudentNames {
    public static void main(String[] args) {
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("Vineel"));
//        studentList.add(new Student("Varma"));
//        studentList.add(new Student("Nemmani"));

        List<Student> students = List.of(new Student("Vineel", 1L),
                new Student("Varma", 2L),
                new Student("Nemmani", 3L));

        List<String> studentNames = students.stream().map(Student::getName).toList();
        System.out.println(studentNames);

    }
}
