import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        
        String A=sc.next();
        String B=sc.next();
        
        int lenA=A.length();
        int lenB=B.length();
        
        System.out.println(lenA+lenB); //summation of lengths of strings
       
        if(A.compareTo(B)>0){ //compareTo function compares 2 strings lexicographically
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        
        String beginningA=A.substring(0, 1).toUpperCase();
        String endA=A.substring(1,A.length());
        String finalA=beginningA+endA; //concatinating 2 strings
        
        String beginningB=B.substring(0, 1).toUpperCase();//converting first charachter to its uppercase version
        String endB=B.substring(1,B.length());
        String finalB=beginningB+endB; //concatinating 2 strings
        
        
        
        System.out.print(finalA+" ");
        System.out.print(finalB);
       
       
        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}


