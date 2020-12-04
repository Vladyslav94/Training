package test;

public class Man {
  private int age;
  private String name;

  public static void main(String[] args) {
    Man man = new Man();
    man.getAge();
  }

  public int getAge() {
    System.out.println("go");
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
