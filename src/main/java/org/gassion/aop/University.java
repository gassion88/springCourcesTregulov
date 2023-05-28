package org.gassion.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student student1 = new Student("Student 1", 1, 8.0);
        Student student2 = new Student("Student 2", 2, 9.0);
        Student student3 = new Student("Student 3", 3, 10.0);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents :");
        System.out.println(students);
        return students;
    }
}
