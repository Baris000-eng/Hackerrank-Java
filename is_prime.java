import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

    //my solution for checking whether a number is prime
    boolean is_prime = false;
    for (int i = 2; i <= Integer.valueOf(n) / 2; ++i) {
      if (Integer.valueOf(n) % i == 0) {
        is_prime = true;
        break;
      }
    }

    if (!is_prime) {
      System.out.println("prime");
    } 
    else {
      System.out.println("not prime");
    }


        bufferedReader.close();
    }
}
