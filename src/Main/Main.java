package Main;

import Manager.Object.Student;
import Manager.StudentManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số sinh viên muốn tạo: ");
        int size = scanner.nextInt();
        Student[] students = new Student[size];
        StudentManagement studentManager = new StudentManagement();

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả ");
            System.out.println("2. Thêm thông tin sinh viên theo Id ");
            System.out.println("3. Sửa thông tin sinh viên theo Id ");
            System.out.println("4. Xoá thông tin sinh viên theo Id ");
            System.out.println("5. Tìm sinh viên theo Id ");
            System.out.println("6. Sắp xếp theo điểm trung bình ");
            System.out.println("7. Tìm kiếm sinh viên bằng điểm trung bình ");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManager.displayStudent();
                    break;
                case 2:
                    studentManager.addStundentById();
                    break;
                case 3:
                    studentManager.editStundentById();
                    break;
                case 4:
                    studentManager.deleteStundentById();
                    break;
                case 5:
                    studentManager.searchStudentByID();
                    break;
                case 6:
                    studentManager.sortByAvgPoint();
                    break;
                case 7:
                    studentManager.searchAvgPointHighestStudent();
                    break;

            }
        }
        while (choice != 0);
    }
}