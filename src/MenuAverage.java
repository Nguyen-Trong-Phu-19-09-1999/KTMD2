import java.util.Scanner;

public class MenuAverage {
    public void menuAverage(){
    MenuAverage menuAverage = new MenuAverage();
    SoftAverage softAverage = new SoftAverage();
    Scanner scanner = new Scanner(System.in);
    int choice = 0;
    do {
        System.out.println("1. Sắp xếp theo điểm TB tăng dần");
        System.out.println("2. Sắp xếp theo điểm TB giảm dần");
        System.out.println("0. Thoát");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                softAverage.compare();
            case 2:
                softAverage.compare1();

        }
    }while (choice != 0);
    }
}
