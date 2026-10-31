package org.amped.app;

import java.util.ArrayList;
import org.amped.model.Student;
import org.amped.service.StudentService;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Alice", 90));
        list.add(new Student("Bob", 95));
        StudentService svc = new StudentService();
        Student top = svc.getTopStudent(list);
        System.out.println(top.getName());   // Bob
    }
}
