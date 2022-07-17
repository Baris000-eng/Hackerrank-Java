import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int [][] arr1 = { {1,2}, {2,3}};
        int [][] arr2 = { {4,5}, {7,8}};
        
        System.out.println(arr1[0][0]*arr2[0][0]+arr1[0][1]*arr2[1][0]);
        System.out.println(arr1[0][0]*arr2[0][1]+arr1[0][1]*arr2[1][1]);
        System.out.println(arr1[1][0]*arr2[0][0]+arr1[1][1]*arr2[1][0]);
        System.out.println(arr1[1][0]*arr2[0][1]+arr1[1][1]*arr2[1][1]);
    }
}