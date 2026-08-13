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
     * Complete the 'findSmallestMissingPositive' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY orderNumbers as parameter.
     */

    public static int findSmallestMissingPositive(List<Integer> orderNumbers) {
    // Write your code here
    //if(orderNumbers.size() == 0) return 1;
    int n = orderNumbers.size();
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = orderNumbers.get(i);
        }
        for(int i=0; i<n; i++){
            while(num[i]>0 && num[i]<=n && num[num[i]-1]!=num[i]){
                int temp = num[i];
                int correctindx = num[i]-1;
                num[i] = num[correctindx];
                num[correctindx] = temp;
            }
        }
        for(int i=0; i<n; i++){
            if(num[i]!=i+1) return i+1;
        }
        return n+1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int orderNumbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> orderNumbers = IntStream.range(0, orderNumbersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.findSmallestMissingPositive(orderNumbers);

        System.out.println(result);

        bufferedReader.close();
    }
}
