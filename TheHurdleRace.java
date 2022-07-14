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
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int getMax(List<Integer> a){ //helper function for finding the maximum element of a list
         int max = a.get(0);
         int i = 0;
         int s = a.size();
         for(i=0;i<s;i++){
           if(a.get(i)>=max){
              max = a.get(i);
           }
         }
         return max;
    }
    public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here
    if(height.isEmpty()){ //if list consisting of hurdle heights is empty
        return -1;
    } 
    
    if(k<0){ //for imaginary cases
        return -1;
    }
    
     int m = getMax(height);
     
     if(m<0){
         return -1;
     }
     
     if(k==0 && m==0){
        return 0;
     }
   
    if(k>=m){
        return 0;
    } 
    
    int diff = m - k;
    
    return diff;
    
        
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> height = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.hurdleRace(k, height);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
