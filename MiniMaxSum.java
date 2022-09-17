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

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
   
      Collections.sort(arr);
      
      BigInteger b1 = BigInteger.valueOf(arr.get(0));
      BigInteger b2 = BigInteger.valueOf(arr.get(1));
      BigInteger b3 = BigInteger.valueOf(arr.get(2));
      BigInteger b4 = BigInteger.valueOf(arr.get(3));
      
      System.out.print(b1.add(b2).add(b3).add(b4)+ " ");
      
      BigInteger b5 = BigInteger.valueOf(arr.get(arr.size()-1));
      BigInteger b6 = BigInteger.valueOf(arr.get(arr.size()-2));
      BigInteger b7 = BigInteger.valueOf(arr.get(arr.size()-3));
      BigInteger b8 = BigInteger.valueOf(arr.get(arr.size()-4));
      
      System.out.print(b5.add(b6).add(b7).add(b8));
       
    }

}

/* Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers. */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

