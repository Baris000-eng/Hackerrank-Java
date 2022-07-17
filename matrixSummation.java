import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
    //constructing 2 matrices
    int [][] matrix1={
                   {1,2,3},{2,3,4},{1,1,1}
               };    
    int [][] matrix2={
                   {4,5,6},{7,8,9},{4,5,7}
               };    


    int i = 0;
    int j = 0;
    
    for(i=0;i<3;i++){    
        for(j=0;j<3;j++){    
            System.out.println(matrix1[i][j]+matrix2[i][j]+" ");   //summing the corresponding elements of the matrices and printing each of the sum in a seperate line
        }    
    }    
}
} 