import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.printf("n = %d -> jumlah kuadrat = ", i);
            int total = 0;

            for (int j = 1; j <= i; j++) {
                total += (j*j);

                if (j > 1 && j != i+1) {
                    System.out.print(" + ");
                }
                System.out.printf("%d", j*j);
            }
        
            if (i != 1) {
                System.out.printf(" = %d", total);
            }
            System.out.println();
        }
            
    }
}
