import entities.employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("================================================");

    List<employee> list = new ArrayList<>();
    String path =
      "C:\\Users\\Guest\\Documents\\projetos\\curso java\\ARQUIVOS\\in.txt";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String employeeCsv = br.readLine();
      while (employeeCsv != null) {
        String[] fields = employeeCsv.split(",");
        list.add(new employee(fields[0], Double.parseDouble(fields[1])));
        employeeCsv = br.readLine();
      }
      Collections.sort(list);
      for (employee emp : list) {
        System.out.println(emp.getName() + "," + emp.getSalary());
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());

      System.out.println("=========================FIM=======================");
    }
  }
}
