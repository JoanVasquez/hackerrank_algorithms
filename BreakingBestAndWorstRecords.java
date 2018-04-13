import java.util.Scanner;
public class BreakingBestAndWorstRecords {
    static int[] breakingRecords(int[] score) {
        int highScore = score[0], lowScore = score[0];
        int highRecords = 0, lowRecords = 0;
        for(int i = 1; i < score.length; i++){
            if(score[i] > highScore){
                highScore = score[i];
                highRecords++;
            }
            if(score[i] < lowScore){
                lowScore = score[i];
                lowRecords++;
            }
        }
        
        return new int[] {highRecords, lowRecords};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}