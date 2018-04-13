import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {
    static int getTotalX(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int min = a[0];
        int max = b[b.length - 1];
        int count = 0;
        for(int i=min; i<=max;i++) if(isFactor(i, a, b)) count ++;
        return count;
    }
    
    static boolean isFactor(int num, int[] a, int[] b){
        boolean aRes = true, bRes = true;
        for(int i = 0; i < a.length; i++) if(num%a[i] != 0) aRes = false;
        for(int i = 0; i < b.length; i++) if(b[i]%num != 0) bRes = false;
        return aRes && bRes;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}