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
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
    String[]arr = {"zero", "one", 
                   "two", "three", 
                   "four", "five", 
                   "six", "seven", 
                   "eight", "nine", 
                   "ten", "eleven", 
                   "twelve", "thirteen", 
                   "fourteen", "fifteen", 
                   "sixteen", "seventeen", 
                   "eighteen", "nineteen", 
                   "twenty", "twenty one", 
                   "twenty two", "twenty three", 
                   "twenty four", "twenty five", 
                   "twenty six", "twenty seven", 
                   "twenty eight", "twenty nine" };
    
List<String>numList = Arrays.asList(arr); //Converting array to list
    
 String currentTime = "";
 if(h<=0) { //for imaginary cases
     return "";
 }
 
 if(m<=30){
    if(m==0) {
        currentTime = numList.get(h)+" o' clock";
    } else if(m==15){
        currentTime = "quarter past "+numList.get(h);
    } else if(m==30){
        currentTime = "half past "+numList.get(h);
    } else {
        if(m==1){
             currentTime=numList.get(m)+" minute past "+numList.get(h);
        } else {
             currentTime=numList.get(m)+" minutes past "+numList.get(h);
        }
    }
  } else{
    if(m==45) {
        currentTime = "quarter to "+numList.get(h+1)+"";
    } else if(30<m || m<45 || 45<m || m<59){
        currentTime = numList.get(60-m)+" minutes to "+numList.get(h+1);
    } else {
         currentTime = numList.get(60-m)+"minute to "+numList.get(h+1);
    }
 }
 return currentTime;
}
    }
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
