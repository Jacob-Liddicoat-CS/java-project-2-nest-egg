//Calculates your retirement fund each year
import java.io.*;
import java.util.*;
public class nestEgg
{
 public static void main(String args[])
 {
  int salary;
  Scanner input = new Scanner(System.in);//Generates Scanner that scans the numbers you input
  System.out.println("Hello. What is your salary? ");
  salary = input.nextInt();//Inputs your salary
  double save = 0.05;
  double growthRate = 0.15;
  double F1 = salary * save * 0.01;//Calculates your retirement fund for the first year
  double F2 = F1 * (1+0.01 * growthRate) + salary * save * 0.01;//Calculates your retirement fund for the second year
  double F3 = F2 * (1+0.01 * growthRate) + salary * save * 0.01;//Calculates your retirement fund for the third year

  System.out.println("End of year 1:" + F1);
  System.out.println("End of year 2:" + F2);
  System.out.println("End of year 3:" + F3);
 }
}
