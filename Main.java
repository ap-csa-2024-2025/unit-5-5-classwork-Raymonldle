import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Point2D p1 = new Point2D();
    Point2D p2 = new Point2D();

    p1.x = 0;
    p1.y = 1;

    p2.x = 1;
    p2.y = 0;

    

    Dog dawg = new Dog("Chihuahua", 10.23, "Black");
    dawg.setBreed("bBAKKAAA");
    System.out.println(dawg.getBreed());


    // Create objects and test your classes in here
  }
}
