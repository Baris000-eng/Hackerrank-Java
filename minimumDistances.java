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
     * Complete the 'minimumDistances' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
//The distance between two array values is the number of indices between them. Given , find the minimum distance between any pair of equal elements in the array. If no such value exists, return .
//Example 

//There are two matching pairs of values:  and . The indices of the 's are  and , so their distance is . The indices of the 's are and , so their distance is . The minimum distance is .
//Function Description
//Complete the minimumDistances function in the editor below.
//minimumDistances has the following parameter(s):
//int a[n]: an array of integers
//Returns
//int: the minimum distance found or  if there are no matching elements
//Input Format
//The first line contains an integer , the size of array . 
//The second line contains space-separated integers .
//Constraints
//Output Format
//Print a single integer denoting the minimum  in . If no such value exists, print .
//Sample Input
//STDIN           Function
//-----           --------
//6               arr[] size n = 6
//7 1 3 4 1 7     arr = [7, 1, 3, 4, 1, 7]
//Sample Output
//3
//Explanation 
//There are two pairs to consider:
 //and  are both , so .
 //and  are both , so .
//The answer is 
    public static int minimumDistances(List<Integer> a) {
    HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>(); //define hashmap keeping  the entries of the integer list called a as keys, and the indexes of these entries as values
    int minD = a.size();
    int s = a.size();
    for(int k = 0; k < s; k++){
        int elm = a.get(k); //get the elements of integer list called a
        if(hMap.containsKey(elm)){ //if there exists a second instance of the integer called elm in hMap
            int ind = hMap.get(elm);
            int diff = k - ind; //calculate index difference
            if(diff <= 0){ //if negative
                diff = -diff; //convert the sign of index difference 
            }
            if(diff <= minD){
                minD = diff;
            }
        } else {
            hMap.put(elm, k); 
            //add the elm as the key and the index of elm (called as k) 
            // as the corresponding value
        } 
    }
     
    if(minD == s){ 
    //there cannot be a distance of a.size() for the minD variable representing the minimum distance among the pair alternatives. So, return -1 in that case
        return -1;
    } 
    
    for(int i=0;i<s;i++){
        if(i==s-1 && !hMap.containsKey(a.get(i))){ //for handling the case where each element in the list is different from each other. Since there is no pair in this case, return -1.
            return -1;
        }
    }
        return minD; //return the minD variable representing minimum distance
    
}
}



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
