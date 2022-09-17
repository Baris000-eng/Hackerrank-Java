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
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

/* Given an array of integers, where all elements but one occur twice, find the unique element. */

    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    int aloneInteger = 0;
    boolean[]isEqual = new boolean[a.size()];
    Arrays.fill(isEqual,false);
    for(int i = 0 ; i < a.size(); i++) {
        int count = 1;
        if(isEqual[i] == true) {
            continue;
        }
        for(int j = i + 1 ; j < a.size(); j++) {
            if(a.get(j)==a.get(i)){
                count++;
                isEqual[j] = true;
            }
        }
        System.out.println(count);
        if(count == 1) {
            aloneInteger = a.get(i);
        }
    }

            return aloneInteger;
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

        int result = Result.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


