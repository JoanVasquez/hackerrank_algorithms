import java.util.Arrays;
import java.util.Scanner;

public class BirthDayCandles {

    static int birthdayCakeCandles(int n, int[] ar) {
        int result = 0;
        
        Arrays.sort(ar);
        
        for(int i : ar){
            if(i == ar[ar.length-1])
                result += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}