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
     * Complete the 'commonChild' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static int commonChild(String s1, String s2) {
    // Write your code here
    String res1 = s1, res2 = s2;
    int max1 = 0, max2 = 0;
for(char c: res1.toCharArray()){
    int index = res2.indexOf(c);
    if(index!=-1){
        res2 = res2.substring(index+1, res2.length());
        System.out.println("c " + c + " res2 " + res2);
        max1++;
    } 
}
res1 = s1; res2 = s2;
    for(char c: res2.toCharArray()){
    int index = res1.indexOf(c);
    if(index!=-1){

        res1 = res1.substring(index+1, res1.length());
            System.out.println("c " + c + "res1 " + res2);

        max2++;
    } 
}
return max1>max2 ? max1 : max2;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        int result = Result.commonChild(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
