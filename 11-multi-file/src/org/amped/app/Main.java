package org.amped.app;

import java.util.ArrayList;
import org.amped.model.Student;
import org.amped.service.StudentService;

// Run this file to test StudentService.getTopStudent.
// Each case prints PASS or FAIL. You do not need to change anything here.
public class Main {
    private static int total = 0;
    private static int passed = 0;

    public static void main(String[] args) {
        StudentService svc = new StudentService();

        // Case 1: Bob has the highest score.
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("Alice", 90));
        list1.add(new Student("Bob", 95));
        check("Bob beats Alice", svc.getTopStudent(list1), "Bob");

        // Case 2: the highest score is the first student in the list.
        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("Cara", 99));
        list2.add(new Student("Dan", 70));
        list2.add(new Student("Eve", 80));
        check("Highest is first", svc.getTopStudent(list2), "Cara");

        // Case 3: only one student.
        ArrayList<Student> list3 = new ArrayList<>();
        list3.add(new Student("Finn", 50));
        check("One student", svc.getTopStudent(list3), "Finn");

        // Case 4: an empty list has no top student, so expect null.
        ArrayList<Student> list4 = new ArrayList<>();
        check("Empty list", svc.getTopStudent(list4), null);

        System.out.println(passed + "/" + total + " passed");
    }

    // Compares the student you got back with the name we expected.
    // expectedName is null when we expect no student at all.
    private static void check(String caseName, Student actual, String expectedName) {
        total++;

        // Turn the result into a name, or null if there is no student.
        String actualName = null;
        if (actual != null) {
            actualName = actual.getName();
        }

        boolean ok;
        if (expectedName == null) {
            ok = (actualName == null);
        } else {
            ok = expectedName.equals(actualName);
        }

        if (ok) {
            passed++;
            System.out.println("PASS  " + total + ". " + caseName);
        } else {
            System.out.println("FAIL  " + total + ". " + caseName
                    + "  (expected " + expectedName + ", got " + actualName + ")");
        }
    }
}
