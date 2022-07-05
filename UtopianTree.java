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
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */
//The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.
//A Utopian Tree sapling with a height of 1 meter is planted at the onset of spring. How tall will the tree be after  growth cycles?
//For example, if the number of growth cycles is , the calculations are as follows:
//Period  Height
////1          2
//2          3
//3          6
//4          7
//5          14
//Function Description
//Complete the utopianTree function in the editor below.
//utopianTree has the following parameter(s):
//int n: the number of growth cycles to simulate
//Returns
//int: the height of the tree after the given number of cycles
//Input Format
//The first line contains an integer, , the number of test cases. 
// subsequent lines each contain an integer, , the number of cycles for that test case.
//Constraints
 

//Sample Input
//3
//0
//1
//4
//Sample Output
//1
//2
//7
//Explanation
//There are 3 test cases.
//In the first case (), the initial height () of the tree remains //unchanged.
//In the second case (), the tree doubles in height and is  //meters tall after the spring cycle.
//In the third case (), the tree doubles its height in spring (, //), then grows a meter in summer (, ), then doubles after the //next spring (, ), and grows another meter after summer (, ). //Thus, at the end of 4 cycles, its height is  meters.
    public static int utopianTree(int n) {
    // Write your code here
    int height = 1;
    for(int j = 1 ; j <= n ; j++){
        if(j%2==0)  {
            height++;
        } else {
            height*=2;
        }
    }
    
    
    
    return height;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.utopianTree(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}