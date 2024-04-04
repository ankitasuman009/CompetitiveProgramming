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
     * Complete the 'gemstones' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY arr as parameter.
     */

    public static int gemstones(List<String> arr) {
    // Write your code here
    List<String> li = new ArrayList();
    int gemstone = 0;
    for(int i=0;i<arr.size();i++)
    li.addAll(Arrays.asList(arr.get(i).split("")));
    System.out.println(li);
    li = new ArrayList<>(new LinkedHashSet<>(li));
        System.out.println(li);

    for(int i=0;i<li.size();i++){
        String s = li.get(i);
        int count = 0;
        for(int j=0;j<arr.size();j++){
            count += (arr.get(j)).indexOf(s) != -1 ? 1 : 0;
        gemstone += count == arr.size() ? 1 : 0;
        }
    }
    return gemstone;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int result = Result.gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
 
