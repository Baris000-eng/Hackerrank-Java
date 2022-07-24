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
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
        if(p==0 || p==1){ //for page 0 or page 1 case (no flips)
            return 0;
        } else if(n==p+1 && n%2==0) { //ex: p=7 and n=8
            return 1;
        } else if((p/2) <= (n-p)/2) { 
//if the number of flips from the 0th or 1st page to the target page number is smaller than or equal to the number of flips from the last page of the book to the target page number.
            return p/2;
        } else if((n-p)/2 <= p/2)  {
            //if the number of flips from the last page of the book to the target page number is smaller than or equal to the number of flips from the 0th or 1st page to the target page number 
            return (n-p)/2;
        } 
            return -1; //otherwise, return -1.
        }
    }
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
