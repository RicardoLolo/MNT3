package Manager;

import Manager.Object.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement implements Manager {
    private static final String DIVIDE_SECTION = "----------------";
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private static final int index = 0;

    public StudentManagement() {
    }

    public void displayStudent() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
        System.out.println("---------------");
    }

    public void addStundentById() {

    }

    public void editStundentById() {
    }

    public void deleteStundentById() {
    }

    public void searchStudentByID() {
    }

    public void searchAvgPointHighestStudent() {
    }

    @Override
    public sortByAvgPoint()() {
        Student[] newStudentList = new Student[][student..size()];
        for (int i = 0; i < students.size(); i++) {

    }
}

