import java.util.Scanner;

public class StairCase {
    static void staircase(int n) {
        for(int i=0; i<n; i++){
            for(int j=1; j<=n; j++)
                System.out.print(j<n-i?" ":"#");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}