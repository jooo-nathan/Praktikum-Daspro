import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        System.out.println();
        int tertinggi = 0, terendah = 100, total = 0, nilai[] = new int[jumlahMhs];

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i]= sc.nextInt();
            total += nilai[i];

            if (terendah > nilai[i]) {
                terendah = nilai[i];
            }
            if (tertinggi < nilai[i]) {
                tertinggi = nilai[i];
            }
        }

        System.out.println("\nSemua nilai sudah masuk! Izinkan saya mengulanginya.\n");

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + " adalah " + nilai[i]);
        }

        System.out.printf("\nRata-rata nilai seluruh mahasiswa adalah %.2f\n", (float) (total/jumlahMhs));

        System.out.println("\nNilai tertinggi adalah\t: " + tertinggi);
        System.out.println("Nilai terendah adalah\t: " + terendah);
        System.out.println();
    }
}