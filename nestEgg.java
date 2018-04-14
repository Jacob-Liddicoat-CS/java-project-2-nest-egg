import java.io.*;
import java.util.*;
public class nestEgg
{
 public static void main(String args[])
 {
  double salary;
  System.out.println("Hello. What is your salary? ");
  salary = keyboard.nextDouble();
  double save = 5;
  double growthRate = 15;
  double F1 = salary * save * 0.01;
  double F2 = F1 * (1+0.01 * growthRate) + salary * save * 0.01;
  double F3 = F2 * (1+0.01 * growthrate) + salary * save * 0.01;

  System.out.println("End of year 1:" + F1);
  System.out.println("End of year 2:" + F2);
  System.out.println("End of year 3:" + F3);
 }
}
