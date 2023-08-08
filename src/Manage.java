import File.StudentFile;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Manage {
    public List<Student> studentList;
    Scanner scanner = new Scanner(System.in);

    public Manage() {
        studentList = StudentFile.readFile("D:\\md2\\Studen\\src\\File\\File.StudentFile.csv");
    }
    public void showList() {
        for (Student user : studentList) {
            System.out.println(user);

        }
    }
    public Student FindId() {
        int id = Integer.parseInt(scanner.nextLine());
        for (Student user : studentList) {
            if (id == user.getId()) {
                return user;
            }
        }
        return null;
    }

    public void addStudent() {
        System.out.println("Mã Sinh Viên");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Tên Sinh Viên :");
        String name = scanner.nextLine();
        System.out.println("Tuổi Sinh viên :");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Giới Tính :");
        String gender = scanner.nextLine();
        System.out.println("Địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Điểm Trung Bình");
        double average = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, name, age, gender, address, average);
        studentList.add(student);
        StudentFile.write(studentList,"D:\\md2\\Studen\\src\\File\\File.StudentFile.csv");
    }

    public void updateStudent() {
        if (!studentList.isEmpty()) {
            Student user = FindId();
            if (user != null) {
                System.out.println("Tên Sinh Viên :");
                String name = scanner.nextLine();
                user.setName(name);
                System.out.println("Tuổi Sinh viên :");
                int age = Integer.parseInt(scanner.nextLine());
                user.setAge(age);
                System.out.println("Giới Tính :");
                String gender = scanner.nextLine();
                user.setGender(gender);
                System.out.println("Địa chỉ");
                String address = scanner.nextLine();
                user.setAddress(address);
                System.out.println("Điểm Trung Bình");
                double average = Double.parseDouble(scanner.nextLine());
                user.setAverage(average);
                System.out.println("Sửa Thành Công");
            }else {
                System.out.println("Mã Sinh viên Không Tồn Tại");
            }
        }



    }

    public void deleteStudent() {
            if (!studentList.isEmpty()) {
                Student user = FindId();
                if (user != null) {
                    studentList.remove(user);

                    System.out.println("Xoá Thành công ");
                } else {
                    System.out.println("Mã không tồn tại ");
                }
            }        StudentFile.write(studentList,"D:\\md2\\Studen\\src\\File\\File.StudentFile.csv");

    }


}
