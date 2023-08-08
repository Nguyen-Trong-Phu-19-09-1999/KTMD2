import java.util.Comparator;
public class SoftAverage  implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() == o2.getId()) {
            return 0;
        } else {
            return -1;
        }
    }
    public int compare1(Student o1, Student o2) {
        if (o1.getId() < o2.getId()) {
            return 1;
        } else if (o1.getId() == o2.getId()) {
            return 0;
        } else {
            return -1;
        }
    }


    public SoftAverage() {
    }

    public void compare() {
    }

    public void compare1() {
    }
}