import java.util.Scanner;

public class NilaiKelompok14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1, kelTertinggi = 0;
        float totalNilai = 0, tertinggi = 0;

        while (i <= 6) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("   Nilai dari Kelompok Penilai " + j + ": ");
                int nilai = sc.nextInt();
                totalNilai += nilai;
            }
            float rataNilai = (float) (totalNilai / 5);
            System.out.print("Kelompok " + i);
            System.out.printf(": nilai rata-rata = %.1f\n", rataNilai);
            
            if (rataNilai > tertinggi) {
                tertinggi = rataNilai;
                kelTertinggi = i;
            }
            i++;
        }
        System.out.print("\nKelompok dengan nilai tertinggi adalah");
        System.out.print("Kelompok " + kelTertinggi + "dengan nilai ");
        System.out.printf("%.1f", tertinggi);
    }
}
