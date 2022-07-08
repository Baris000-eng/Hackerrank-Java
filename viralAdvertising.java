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
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */
//HackerLand Enterprise is adopting a new viral advertising strategy. When they launch a new product, they advertise it to exactly  people on social media.
//On the first day, half of those  people (i.e., ) like the advertisement and each shares it with  of their friends. At the beginning of the second day,  people receive the advertisement.
//Each day,  of the recipients like the advertisement and will share it with  friends on the following day. Assuming nobody receives the advertisement twice, determine how many people have liked the ad by the end of a given day, beginning with launch day as day .
//Example 
.
//Day Shared Liked Cumulative
//1      5     2       2
//2      6     3       5
//3      9     4       9
//4     12     6      15
//5     18     9      24
//The progression is shown above. The cumulative number of likes on the  day is .
//Function Description
//Complete the viralAdvertising function in the editor below.
//viralAdvertising has the following parameter(s):
//int n: the day number to report
//Returns
//int: the cumulative likes at that day
//Input Format
//A single integer, , the day number.
//Constraints

//Sample Input
//3
//Sample Output
//9
//Explanation
//This example is depicted in the following diagram:
//strange ad.png
 //people liked the advertisement on the first day,  people //liked //the advertisement on the second day and  people liked the //advertisement on the third day, so the answer is 
    public static int viralAdvertising(int n) {
    // Write your code here
        int likes = 5;
        int sumVal = 0;
        for(int q = 0; q < n; q++){
            likes = (int) (likes * 1.0 / 2.0);
            sumVal = sumVal + likes;
            likes = 3 * likes;
        }
        return sumVal;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
