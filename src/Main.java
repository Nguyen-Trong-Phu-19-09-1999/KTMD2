import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Manage student = new Manage();
        SoftAverage softAverage = new SoftAverage();
        MenuAverage menuAverage = new MenuAverage();


        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("-----Menu ADMIN-----");
            System.out.println("1. Thêm");
            System.out.println("2. Sửa");
            System.out.println("3. Xoá");
            System.out.println("4. Hiển thị điểm TB Tăng Dần");
            System.out.println("5. Hiên Thị Danh Sách");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    student.addStudent();
                    break;
                case 2:
                    student.updateStudent();
                    break;
                case 3:
                    student.deleteStudent();
                    break;
                case 4:
                    menuAverage.menuAverage();
                    break;
                case 5:
                    student.showList();
                    break;

            }

        }while (choice != 0);
    }
}

