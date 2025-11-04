import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        float temp = n;
        int jDigit = 2;
        if (temp < 10) {
            jDigit = 1;
        }
        else {
            while (temp >= 10) {
                temp /= 10;
                jDigit++;
            }
        }
        // System.out.println(jDigit);

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.printf(" %d", n);
                }
            }
            else {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n) {
                        System.out.printf(" %d", n);
                    }
                    else {
                        for (int k = 1; k <= jDigit; k++) {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}