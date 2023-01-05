package entities;

public class employee implements Comparable<employee> {

  private String name;
  private Double salary;

  public employee(String name, Double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  @Override
  public int compareTo(employee other) {
    return -salary.compareTo(other.getSalary());
  }
}
