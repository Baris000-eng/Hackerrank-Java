import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    try {
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();
      System.out.println(num1 / num2);
    } catch(ArithmeticException | InputMismatchException exception) {
      if (exception instanceof InputMismatchException) {
        System.out.println("java.util.InputMismatchException");
      } else if (exception instanceof ArithmeticException){
        System.out.println("java.lang.ArithmeticException: / by zero");
      }
    }
    scan.close();
  }
}


/*Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.

This problem will test your knowledge on try-catch block.

You will be given two integers  and  as input, you have to compute . If  and  are not  bit signed integers or if  is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.*/