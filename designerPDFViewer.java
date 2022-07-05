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
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */
//When a contiguous block of text is selected in a PDF viewer, the selection is highlighted with a blue rectangle. In this PDF viewer, each word is highlighted independently. For example:
//PDF-highighting.png
//There is a list of  character heights aligned by index to their letters. For example, 'a' is at index  and 'z' is at index . There will also be a string. Using the letter heights given, determine the area of the rectangle highlight in assuming all letters are wide.
//Example 
 
//The heights are  and . The tallest letter is high and there are  letters. The hightlighted area will be  so the answer is .
//Function Description
//Complete the designerPdfViewer function in the editor below.
//designerPdfViewer has the following parameter(s):
//int h[26]: the heights of each letter
//string word: a string
//Returns
//int: the size of the highlighted area
//Input Format
//The first line contains space-separated integers describing the respective heights of each consecutive lowercase English letter, ascii[a-z]. 
//The second line contains a single word consisting of lowercase English alphabetic letters.
//Constraints
//, where  is an English lowercase letter.
// contains no more than  letters.
//Sample Input 0
//1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
//abc
//Sample Output 0
//9
//Explanation 0
//We are highlighting the word abc:
//Letter heights are ,  and . The tallest letter, b, is  high. The selection area for this word is .
//Note: Recall that the width of each character is .
//Sample Input 1
//1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7
//zaba
//Sample Output 1
//28
//Explanation 1
//The tallest letter in  is at . The selection area for this word is 
    public static int designerPdfViewer(List<Integer> h, String word) {
    // Write your code here
    
    int l = word.length();
    int maxNum = 0;
    for(int i=0; i< l; i++){ //go through the word
        int index = h.get((int) (word.charAt(i) - 'a')); //find index of the charachters in the word
        if(index>=maxNum){ //if index is greater than the variable called maxNum
            maxNum = index; //update the variable called maxNum to the variable called index
        }
        
    }
    
    int area = l * maxNum; //find the highlighted area 
    return area; //return the highlighted area

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String word = bufferedReader.readLine();

        int result = Result.designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
