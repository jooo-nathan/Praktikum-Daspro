import java.util.Scanner;
public class ArrayRataNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double totalL = 0, totalTL = 0;
        double rata2L, rata2TL;
        int lulus = 0, tlulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < jumlahMhs; i++) {
            if (nilaiMhs[i] > 70) {
                totalL += nilaiMhs[i];
                lulus++;
            }
            else {
                totalTL += nilaiMhs[i];
                tlulus++;
            }
        }

        System.out.println("\nMahasiswa yang lulus ada sebanyak " + lulus + " orang");
        
        System.out.printf("Rata-rata nilai lulus = %.1f\n", totalL/lulus);
        System.out.printf("Rata-rata nilai tidak lulus = %.1f", totalTL/tlulus);
        //rata2 = total/nilaiMhs.length;
        // System.out.println("Rata-rata nilai = " + rata2);
    }
}
