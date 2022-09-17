import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int digitSum = 0;
        int result = 0;
        for(int i = 1; i<=n; i++) {
            if(n%i==0 && digitSum(i)>=digitSum){ //if i divides n and digitSum of any divider is bigger than the integer called digitSum
                    digitSum = digitSum(i);//update digit sum
                    result = i; // update the result
            }
        }
        
        System.out.println(result);
        bufferedReader.close();
    }
    
    public static int digitSum(int k){ //function for finding the digit sum of a positive integer. 
        int sum = 0;
        while(k>0) {
            int remainder = k % 10;
            sum = sum + remainder;
            k = k / 10;
        }
        return sum;
    }
}
