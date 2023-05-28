package AL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(1, "Bug"),
                new Student(100, "Coding"),
                new Student(2, "CodingBug"));
        List<Student> studentsAI = new ArrayList<>(students);
        System.out.println(students);

        Collections.sort(studentsAI);
        System.out.println(studentsAI);

    }
}
