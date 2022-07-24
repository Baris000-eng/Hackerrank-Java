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
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */


  //NOTE: You can also see the usage of ternary operator in Java which shortens the "if & else statement".
    public static int countingValleys(int steps, String path) {
    // Write your code here
   int deepness = 0;
   int numberOfValleys = 0;
   if(path.equals("") || steps<=0){ //imaginary and null cases
       return 0;
   }
    for(int i=0;i<steps;i++) { //go through all steps
        deepness = (path.charAt(i)=='U') ? deepness+1 : deepness-1; //if we reached a 'U' char, increase the deepness. Otherwise, decrease the deepness.
        numberOfValleys = (deepness == 0 && path.charAt(i)=='U') ? numberOfValleys+1 : numberOfValleys;
        //if the deepness is equal to 0 and the character at our path is equal to 'U', then increase the number of valleys
    }
          return numberOfValleys;
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
