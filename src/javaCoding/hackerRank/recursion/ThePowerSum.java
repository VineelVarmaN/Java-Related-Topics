package javaCoding.hackerRank.recursion;

import java.io.*;

public class ThePowerSum {
    public static int powerSum(int X, int N) {
        // Write your code here
        int result = 0;
        for (int i =1; i<=X; i++){
            result += i^N;
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int X = Integer.parseInt(bufferedReader.readLine().trim());

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        int result = powerSum(X, N);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
