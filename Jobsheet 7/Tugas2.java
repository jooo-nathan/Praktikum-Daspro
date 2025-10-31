import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis = 1, durasi, total = 0;

        while (jenis != 0) {
            System.out.println("\nJenis kendaraan :\n1. Mobil\n2. Motor\n0. Keluar");
            System.out.print("\nMasukkan jenis kendaraan (1/2/0): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) { // Mobil
                    total += durasi * 3000;
                } else if (jenis == 2) { // Motor
                    total += durasi * 2000;
                }
            }
            else {
                System.out.println("Total biaya parkir: Rp " + total);
                System.out.println("\nTerima kasih sudah menggunakan layanan kami.");
                break;
            }
        }
    }
}