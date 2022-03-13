import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {


  //An integer  is a divisor of an integer  if the remainder of .

//Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.

//Example

//Check whether ,  and  are divisors of . All 3 numbers divide evenly into  so return .


//Check whether , , and  are divisors of . All 3 numbers divide evenly into  so return .


//Check whether  and  are divisors of .  is, but  is not. Return .

//Function Description

//Complete the findDigits function in the editor below.

//findDigits has the following parameter(s):

//int n: the value to analyze
  
//Returns

//int: the number of digits in  that are divisors of 
  
//Input Format

//The first line is an integer, , the number of test //cases.
//The  subsequent lines each contain an integer, .

//Constraints



//Sample Input

//2
//12
//1012
  
//Sample Output

//2
//3
  
//Explanation

//The number  is broken into two digits,  and . When  is divided by either of those two digits, the remainder is  so they are both divisors.

//The number  is broken into four digits, , , , and .  is evenly divisible by its digits , , and , but it is not divisible by  as division by zero is undefined.

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */


//My solution to the function finding the number of evenly divider digits of a number called as n.
    public static int findDigits(int n) {
        ArrayList<Integer>digitArrList=new ArrayList<Integer>();
        while(n>0){
            int rem=n%10;
            digitArrList.add(rem);
            n=n/10;
        }
        
        
        int dividerDigitNum=0;
        for(int i=0;i<digitArrList.size();i++){
             try {
                 if(digitArrList.get(i)>0){
                     if(n%digitArrList.get(i)==0){
                         dividerDigitNum++;
                         }
                  } 
             } catch(ArithmeticException e1){
                  e1.printStackTrace();
             } catch(InputMismatchException e2){
                 e2.printStackTrace();
             } catch(IndexOutOfBoundsException e3){
                 e3.printStackTrace();
             }
           
        }
        
        return dividerDigitNum;
        
        
        
      
    // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.findDigits(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

