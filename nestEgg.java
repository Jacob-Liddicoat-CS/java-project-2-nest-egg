import java.io.*;
import java.util.*;
public class nestEgg
{
 public static void main(String args[])
 {
  int salary = 50,000;
  double save = 5%;
  double growthRate = 15%;
  double F1 = salary * save * 0.01;
  double G1 = F1;
  double F2 = G1 * (1+0.01 * growthRate) + salary * save * 0.01;
  double G2 = F2;
  double F3 = G2 * (1+0.01 * growthrate) + salary * save * 0.01;

