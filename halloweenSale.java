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
     * Complete the 'howManyGames' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER d
     *  3. INTEGER m
     *  4. INTEGER s
     */
//You wish to buy video games from the famous online video game store Mist.
//Usually, all games are sold at the same price,  dollars. However, they are planning to have the seasonal Halloween Sale next month in which you can buy games at a cheaper price. Specifically, the first game will cost  dollars, and every subsequent game will cost  dollars less than the previous one. This continues until the cost becomes less than or equal to  dollars, after which every game will cost dollars. How many games can you buy during the Halloween Sale?
//Example 
 
 
 
//.
//The following are the costs of the first , in order:

//Start at  units cost, reduce that by  units each iteration until reaching a minimum possible price, . Starting with  units of currency in your Mist wallet, you can buy 5 games: .
//Function Description
//Complete the howManyGames function in the editor below.
//howManyGames has the following parameters:
//int p: the price of the first game
//int d: the discount from the previous game price
//int m: the minimum cost of a game
//int s: the starting budget
//Input Format
//The first and only line of input contains four space-separated integers , ,  and .
//Constraints



//Sample Input 0
//20 3 6 80
//Sample Output 0
//6
//Explanation 0
//Assumptions other than starting funds, , match the example in the problem statement. With a budget of , you can buy  games at a cost of . A  game for an additional  units exceeds the budget.
//Sample Input 1
//20 3 6 85
//Sample Output 1
//7
//Explanation 1
//This is the same as the previous case, except this time the starting budget units of currency. This time, you can buy  games since they cost . An additional game at  units will //exceed the budget.
    public static int howManyGames(int p, int d, int m, int s) {
        int gameCount = 0;
        if(s<=0 || p<0 || m<0 || d<0){ //no budget case and imaginary cases
            return 0;
        }
        if(p>s){ //if the price of the first game is bigger than total starting budget 
            return 0;
        }
        while(s >= p){
            s = s - p;
            gameCount++;
            if(p - d >= m) { //if the discounted price is bigger than or equal to minimum. price
                p = p - d;
            } else { //otherwise, we assign the price of game to min price which is m.
                 p = m; 
            }
            
        }
       return gameCount;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int p = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        int m = Integer.parseInt(firstMultipleInput[2]);

        int s = Integer.parseInt(firstMultipleInput[3]);

        int answer = Result.howManyGames(p, d, m, s);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
