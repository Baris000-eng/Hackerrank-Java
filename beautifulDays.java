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
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */


  //Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse. For instance, given the number , its reverse is . Their difference is . The number  reversed is , and their difference is .

//She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.

//Given a range of numbered days,  and a number , determine the number of days in the range that are beautiful. Beautiful numbers are defined as numbers where  is evenly divisible by . If a day's value is a beautiful number, it is a beautiful day. Return the number of beautiful days in the range.

//Function Description

//Complete the beautifulDays function in the editor below.

//beautifulDays has the following parameter(s):

//int i: the starting day number
//int j: the ending day number
//int k: the divisor
//Returns

//int: the number of beautiful days in the range
//Input Format

//A single line of three space-separated integers describing the respective values of , , and .

//Constraints

//Sample Input

//20 23 6
//Sample Output

//2
//Explanation

//Lily may go to the movies on days , , , and . We perform the following calculations to determine which days are beautiful:

//Day  is beautiful because the following evaluates to a whole number: 
//Day  is not beautiful because the following doesn't evaluate to a whole number: 
//Day  is beautiful because the following evaluates to a whole number: 
//Day  is not beautiful because the following doesn't evaluate to a whole number: 
//Only two days,  and , in this interval are beautiful. Thus, we print  as our answer.

    public static int reverseNumber(int number){
        int reversedNumber=0;
        while(number>0){
            int remainder=number%10;
            reversedNumber=10*reversedNumber+remainder;
            number=((int)(number/10));
        }
        return reversedNumber;
    }
    
    
    public int absoluteValue(int number){
        if(number<0){
            number=-number;
        }
        return number;
    }
    public static int beautifulDays(int i, int j, int k) {
    // Write your code here
    int beautifulDayNumber=0;
    for(int a=i;a<=j;a++){
        int diff=a-reverseNumber(a);
        if(diff<0){
            diff=-diff;
        }
        
        if(diff%k==0){
            beautifulDayNumber+=1;
        }
    }
    
    
            return beautifulDayNumber;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
