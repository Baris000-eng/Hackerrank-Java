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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int j = 0 , size = arr.size(),negativeNum = 0, positiveNum = 0, zeroNum = 0;
    for(j = 0 ; j < size; j++) {
        if(arr.get(j) < 0) {
            negativeNum++;
        } else if(arr.get(j) > 0) {
            positiveNum++;
        } else {
            zeroNum++;
        }
    }
    
    double positiveRatio = ((double)positiveNum) / size;
    double negativeRatio = ((double)negativeNum) / size;
    double zeroRatio = ((double)zeroNum) / size;
    
    System.out.println(positiveRatio);
    System.out.println(negativeRatio);
    System.out.println(zeroRatio);
    

    }

}

/*Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

