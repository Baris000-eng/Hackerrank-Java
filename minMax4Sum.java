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

  //My implementation to find minimum and maximum 4 element sums in an array containing 5 integers.
    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int minNum=arr.get(0);
    int maxNum=arr.get(0);
    int sum=0;
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)<=minNum){
            minNum=arr.get(i);
        }
    }
    
    for(int j=0;j<arr.size();j++){
        sum=sum+arr.get(j);
        if(arr.get(j)>=maxNum){
            maxNum=arr.get(j);
        }
    }
    
    int minSum= sum-maxNum;
    int maxSum= sum-minNum;
    System.out.println(minSum + " "+ maxSum);

    }

}

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
