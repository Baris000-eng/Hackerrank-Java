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
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

  //A modified Kaprekar number is a positive whole number with a special property. If you square it, then split the number into two integers and sum those integers, you have the same value you started with.
//Consider a positive whole number  with  digits. We square  to arrive at a number that is either  digits long or  digits long. Split the string representation of the square into two parts,  and . The right hand part,  must be  digits long. The left is the remaining substring. Convert those two substrings back to integers, add them and see if you get .
//Example
 

//First calculate that . Split that into two strings and convert them back to integers  and . Test , so this is not a modified Kaprekar number. If , still , and . This gives us , the original .
//Note: r may have leading zeros.
//Here's an explanation from Wikipedia about the ORIGINAL //Kaprekar Number (spot the difference!):
//In mathematics, a Kaprekar number for a given base is a non-negative integer, the representation of whose square in that base can be split into two parts that add up to the original number again. For instance, 45 is a Kaprekar number, because 45² = 2025 and 20+25 = 45.
//Given two positive integers  and  where  is lower than , write a program to print the modified Kaprekar numbers in the range between  and , inclusive. If no modified Kaprekar numbers exist in the given range, print INVALID RANGE.
//Function Description
//Complete the kaprekarNumbers function in the editor below.
//kaprekarNumbers has the following parameter(s):
//int p: the lower limit
//int q: the upper limit
//Prints
//It should print the list of modified Kaprekar numbers, space-//separated on one line and in ascending order. If no modified Kaprekar numbers exist in the given range, print INVALID RANGE. No return value is required.
//Input Format
//The first line contains the lower integer limit . 
//The second line contains the upper integer limit .
//Note: Your range should be inclusive of the limits.
//Constraints

//Sample Input
//STDIN   Function
//-----   --------
//1       p = 1
//100     q = 100
//Sample Output
//1 9 45 55 99
//Explanation
//, , , , and  are the modified Kaprekar Numbers in the given range.
    public static boolean is_num_kaprekar (int f){
            long sq = (long) f*f;
            boolean is_kaprekar_num = false;
            String s = String.valueOf(sq);
            if(s.equals("")){
                is_kaprekar_num = false;
            }
            int len = s.length();
            if(sq<0){
                is_kaprekar_num = false;
            }
  
            if(len<2){
              if(f==0 || f==1){
                    is_kaprekar_num = true;
               } 
            } else {
                String s1 = s.substring(0,len/2);
                String s2 = s.substring(len/2, len);
                int i1 = Integer.parseInt(s1);
                int i2 = Integer.parseInt(s2);
                int sum = i1 + i2;
                if(sum == f){
                    is_kaprekar_num = true;
                } 
            }
            
            
             
             return is_kaprekar_num;
    }
    public static void kaprekarNumbers(int p, int q) {
    // Write your code here
        int kaprekarNum = 0;
        for(int c=p; c<=q; c++){
           if(is_num_kaprekar(c)) {
               System.out.printf("%d ",c);
               kaprekarNum++;
           } 
        }
        
        if(kaprekarNum==0){
            System.out.print("INVALID RANGE");
        }
        
        
        if(p<0 || q<0){
            System.out.print("INVALID LIMITS !!!");
        }
        
        if(p>q){
            int var = p;
            p = q;
            q = var;
        }
        
        
        
    }
}
        

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        Result.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
}
