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
     * Complete the 'angryProfessor' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY a
     */
//A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, the professor decides to cancel class if fewer than some number of students are present when class starts. Arrival times go from on time () to arrived late ().
//Given the arrival time of each student and a threshhold number of attendees, determine if the class is cancelled.
//Example
 
 

//The first  students arrived on. The last  were late. The threshold is  students, so class will go on. Return YES.
//Note: Non-positive arrival times () indicate the student arrived early or on time; positive arrival times () indicate the student arrived  minutes late.
//Function Description
//Complete the angryProfessor function in the editor below. It must return YES if class is cancelled, or NO otherwise.
//angryProfessor has the following parameter(s):
//int k: the threshold number of students
//int a[n]: the arrival times of the  students
//Returns
//string: either YES or NO
//Input Format
//The first line of input contains , the number of test cases.
//Each test case consists of two lines.
//The first line has two space-separated integers,  and , the number of students (size of ) and the cancellation threshold. 
//The second line contains  space-separated integers () that describe the arrival times for each student.
//Constraints




//Sample Input
2
4 3
-1 -3 4 2
4 2
0 -1 2 1
//Sample Output
//YES
//NO
//Explanation
//For the first test case, . The professor wants at least  students in attendance, but only  have arrived on time ( and ) so the class is cancelled.
//For the second test case, . The professor wants at least  students in attendance, and there are  who arrived on time ( and ). The class is not cancelled.
    public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here
    int arrivalOnTimeCount = 0;
    int w = a.size();
    
    if(k<=0 || w==0){ //for invalid and imaginary cases :)
        return "YES"; //class is cancelled
    }
    for(int i=0; i<w; i++){
        if(a.get(i)<=0){ //if a student arrives on time or early
            arrivalOnTimeCount++;
        }
    }
    
     if(arrivalOnTimeCount>=k)    {  //if the number of students is bigger than threshold
            return "NO"; //class is not cancelled
      }
    
            return "YES"; //class is cancelled

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                String result = Result.angryProfessor(k, a);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
