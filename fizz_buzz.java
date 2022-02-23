import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

//My solution is in the function called fizzBuzz.

  //DESCRIPTION:
  //for every number up to n including n, if a number is both multiple of 3 and 5, then print FizzBuzz. If a number is only a multiple of 3 but not 5, then print Fizz. If a number is only a multiple of 5 but not 3, then print Buzz. Otherwise, print the number itself. 
    public static void fizzBuzz(int n) {
    // Write your code here
    for(int i= 1; i<=n;i++){
        if(i%3==0 && i%5==0){
            System.out.println("FizzBuzz");
        } else if(i%3==0 && i%5!=0){
            System.out.println("Fizz");
        } else if(i%5==0 && i%3!=0){
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }

    }

}

public class Solution {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}