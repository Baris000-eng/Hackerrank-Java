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
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        List<Integer>minMaxRecords = new ArrayList<Integer>();
        //defining the list which will keep the max point and min point as records. 

      
        int minCount =0;
        int maxCount =0;
        int min=scores.get(0);
        int max=scores.get(0);
        int s = scores.size();
        
        if(s <= 0){ 
            //if there is no element in the list called scores (base case)
            return null;
        }
        
        for(int j=1;j<s;j++){
            
            if(scores.get(j)>max){
                max=scores.get(j);
                maxCount++; //count max point record
            }
            
            if(scores.get(j)<min){
                min = scores.get(j);
                minCount++; //count min point record
            }
            
            if(max == min){
                System.out.println("No min or no max element which are seperate from each other !!!");
            }
            
        }
        
        //add records
        minMaxRecords.add(0,maxCount);
        minMaxRecords.add(1,minCount);
        
        //return the array containing the maxCount and minCount as records
        return minMaxRecords;
       
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
