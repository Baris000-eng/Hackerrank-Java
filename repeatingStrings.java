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
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */


    //My solution to the function finding the number of a's //in the repeated version of the string s and in the version //containing n characters.
    public static long repeatedString(String s, long n) {
    long charNum = 0;
    int aNum = 0;
    int len = s.length();

      
       for(int i=0;i<len;i++){
          if(s.charAt(i)=='a'){
            aNum++;
          } 
       } 
       
       long modValue = n % len; 
       charNum = (n/len) * aNum;

       for(int i=0;i<modValue;i++){
           if(s.charAt(i)=='a'){
               charNum++;
           }
       }

    

    return charNum;
    
    
   
    
    
    
    
     
    }
    


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
