public class Test {
  public static void main(String[] args) {
    String name = "Alice";
    int age = 25;
    double score = 89.5;

    System.out.printf("Name: %s%n", name);
    System.out.printf("Age: %d years%n", age);
    System.out.printf("Score: %.1f%n", score); // Fixed variable and format specifier
    System.out.printf("Summary: %s is %d years old and scored %.2f points.%n", name, age, score);
  }
}
