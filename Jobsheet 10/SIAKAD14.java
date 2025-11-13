import java.util.Scanner;
public class SIAKAD14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nProgram SIAKAD");
        System.out.print("\nMasukkan jumlah mahasiswa : ");
        int mahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah : ");
        int matkul = sc.nextInt();

        int[][] nilai = new int[mahasiswa][matkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\n=============================");
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            System.out.println("=============================");
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.printf("Nilai rata-rata: %.2f\n", totalPerSiswa/matkul);
        }

        System.out.println("\n=======================================");
        System.out.println("Rata-rata nilai setiap mata kuliah: ");

        for (int j = 0; j < matkul; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < mahasiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.printf("Mata Kuliah " + (j + 1) + ": %.2f\n", totalPerMatkul / mahasiswa);
        }
        System.out.println("=======================================");
    }
}