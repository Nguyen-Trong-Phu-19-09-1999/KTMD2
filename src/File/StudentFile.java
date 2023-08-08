package File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentFile implements Serializable{
    public List<StudentFile> readFile() {
        List<StudentFile> students = new ArrayList<>();
        try {
            File file = new File("D:\\md2\\Studen\\src\\File\\File.StudentFile.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!= null) {
                String[] strings = line.split(",");
                Student student = new Student(Integer.parseInt(strings[0]),
                        strings[1], Integer.parseInt(strings[2]), strings[3],
                        strings[4], Double.parseDouble(strings[5]));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } return students;
    }

    public void writeFile (List<Student> students) {
        try {
            File file = new File("D:\\md2\\Studen\\src\\File\\StudentFile.csv");
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student : students) {
                String line = student.getId() + "," + student.getName()
                        + "," + student.getAge() + "," + student.getGender()
                        + "," + student.getAddress() + "," + student.getAverage() +"\n";
                bufferedWriter.write(line);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
