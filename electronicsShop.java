import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the getMoneySpent function below.
     */

  //A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget. Given price lists for keyboards and USB drives and a budget, find the cost to buy them. If it is not possible to buy both items, return .
//Example 
 
 

//The person can buy a , or a . Choose the latter as the more expensive option and return .
//Function Description
//Complete the getMoneySpent function in the editor below.
//getMoneySpent has the following parameter(s):
//int keyboards[n]: the keyboard prices
//int drives[m]: the drive prices
//int b: the budget
//Returns
//int: the maximum that can be spent, or  if it is not possible to buy both items
//Input Format
//The first line contains three space-separated integers , , and , the budget, the number of keyboard models and the number of USB drive models. 
//The second line contains  space-separated integers , the prices of each keyboard model. 
//The third line contains  space-separated integers , the prices of the USB drives.
//Constraints


//The price of each item is in the inclusive range .
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
       ArrayList<Integer>sumArrayList=new ArrayList<Integer>();
       int lenK=keyboards.length;
       int lenD=drives.length;
        
       if(lenK == 0 && lenD == 0){ //if there is no element in the keyboards array and drives array
           return -1;
       }
        
        
        
        
       for(int i=0;i<lenK;i++){
           for(int j=0;j<lenD;j++){
               sumArrayList.add(keyboards[i]+drives[j]);
           }
       }
       
       ArrayList<Integer>aList=new ArrayList<Integer>();
       int max = sumArrayList.get(0);
       for(int k=0;k<sumArrayList.size();k++){
            if(sumArrayList.get(k)<=b){
                  aList.add(sumArrayList.get(k));
               }
        }
        
       
        
        
        
      if(aList.size()>0) {
            return Collections.max(aList);
      }
     
           
           
           
       
       
       
       
       
        /*
         * Write your code here.
         */
         
         return -1;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] bnm = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);

        bufferedWriter.write(String.valueOf(moneySpent));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
