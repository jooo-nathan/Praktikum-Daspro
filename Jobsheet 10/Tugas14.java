import java.util.Scanner;

public class Tugas14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resp = 10, question = 6;
        double totalScorePerResp = 0;
        double totalScorePerQuest[] = new double[question];
        int score[][] = new int[resp][question];

        System.out.println("Survey Kepuasan Pelanggan terhadap Layanan Perusahaan");

        for (int i = 0; i < score.length; i++) {
            System.out.println("\n==============================================");
            System.out.println("Responden ke-" + (i + 1));
            totalScorePerResp = 0;

            for (int j = 0; j < score[i].length; j++) {
                do {
                    System.out.print("Nilai untuk pertanyaan ke-" + (j + 1) + " : ");
                    score[i][j] = sc.nextInt();
                    
                    if (score[i][j] > 5 || score[i][j] < 1) {
                        System.out.println("Error : Rentang nilai adalah 1-5. Harap masukkan ulang.");
                    }
                    else {
                        totalScorePerResp += score[i][j];
                        totalScorePerQuest[j] += score[i][j];
                        break;
                    }
                } while (score[i][j] > 5 || score[i][j] < 1);
            }
            System.out.printf("Rata-rata nilai untuk responden ke-" + (i + 1) + " adalah %.2f\n", (totalScorePerResp / question));
        }
        System.out.println("\n====================================================");
        System.out.println("Berikut adalah rata-rata nilai untuk tiap pertanyaan");

        for (int i = 0; i < question; i++) {
            System.out.printf("Pertanyaan ke-" + (i + 1) + " : %.2f\n", (totalScorePerQuest[i]/resp));
        }
        System.out.println();
    }
}