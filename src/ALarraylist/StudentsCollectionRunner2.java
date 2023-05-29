package ALarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}

public class StudentsCollectionRunner2 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(1, "Bug"),
                new Student(100, "Coding"),
                new Student(2, "CodingBug"));
        List<Student> studentsAI = new ArrayList<>(students);
        System.out.println(studentsAI);

        Collections.sort(studentsAI);
        System.out.println("Desc" + studentsAI);

//        Collections.sort(studentsAI, new AscendingStudentComparator());
//        System.out.println("AscendingStudentComparator" + studentsAI);

        studentsAI.sort(new AscendingStudentComparator());
        System.out.println("AscendingStudentComparator" + studentsAI);



    }
}
