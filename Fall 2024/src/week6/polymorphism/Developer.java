package polymorphism;

public class Developer extends Employee {
  @Override
  void work() {
    System.out.println("Writing code.");
  }
  void program() {
    System.out.println("Programming.");
  }
}