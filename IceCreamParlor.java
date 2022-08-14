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
     * Complete the 'icecreamParlor' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */

  //Two friends like to pool their money and go to the ice cream parlor. They always choose two distinct flavors and they spend all of their money.
  //Given a list of prices for the flavors of ice cream, select the two that will cost all of the money they have.
  //Example.   
  //The two flavors that cost  and  meet the criteria. Using -based indexing, they are at indices  and .
  //Function Description
  //Complete the icecreamParlor function in the editor below.
  //icecreamParlor has the following parameter(s):
  //int m: the amount of money they have to spend
  //int cost[n]: the cost of each flavor of ice cream
  //  //Returns
  //int[2]: the indices of the prices of the two flavors they buy,   //sorted ascending
  //Input Format
  //The first line contains an integer, , the number of trips to the i  //ce cream parlor. The next  sets of lines each describe a visit.
  //Each trip is described as follows:
  //The integer , the amount of money they have pooled.
  //The integer , the number of flavors offered at the time.
  // space-separated integers denoting the cost of each flavor: .
  //Note: The index within the cost array represents the flavor of the   //ice cream purchased.
  //Constraints



  //, ∀ 
  //There will always be a unique solution.
  //Sample Input
  //STDIN       Function
  //-----       --------
  //  //2           t = 2
  //4           k = 4
  //  //5           cost[] size n = 5
  //1 4 5 3 2   cost = [1, 4, 5, 3, 2]
  //4  //           k = 4
  //4           cost[] size n = 4
  //2 2 4 3     cost=[2, 2,4, 3]
  //Sample Output
  //1 4
  //1 2
  //Explanation
  //Sunny and Johnny make the following two trips to the parlor:
  //The first time, they pool together  dollars. Of the five flavors   //available that day, flavors  and  have a total cost of .
  //The second time, they pool together  dollars. Of the four flavors   //available that day, flavors  and  have a total cost of .
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
    // Write your code here
    List<Integer>indexList = new ArrayList<Integer>();
    for(int i = 0; i < arr.size(); i++) {
        for(int j = i+1; j < arr.size(); j++) {
            if(arr.get(i)+arr.get(j)==m) {
                indexList.add(i+1);
                indexList.add(j+1);
            }
        }
    }
     
    return indexList;
    }
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int m = Integer.parseInt(bufferedReader.readLine().trim());

                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> result = Result.icecreamParlor(m, arr);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}