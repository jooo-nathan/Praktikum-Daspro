import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000, jumlahTiket, totalTiket = 0;
        float hargaPerOrang, totalPendapatan = 0;
        String namaPembeli;

        System.out.print("\n------------- PROGRAM PENGHITUNG PENJUALAN TIKET BIOSKOP -------------\n");

        do {
            System.out.println("\n=======================================================================");
            System.out.print("Masukkan nama pembeli (ketik 'keluar' untuk berhenti): ");
            namaPembeli = sc.nextLine();

            if (namaPembeli.equalsIgnoreCase("keluar")) {
                System.out.println("\n================================================");
                System.out.println("| Terima kasih telah menggunakan layanan kami. |");
                System.out.println("================================================\n");
                break;
            }

            System.out.print("\nMasukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan jumlah yang benar!");
                sc.nextLine(); // Membersihkan newline dari buffer
                continue;
            }

            totalTiket += jumlahTiket;
            
            if (jumlahTiket > 10) {
                hargaPerOrang = (float)((jumlahTiket * hargaTiket) * 0.85); // Diskon 15%
                
            }
            else if (jumlahTiket > 4) {
                hargaPerOrang = (float)((jumlahTiket * hargaTiket) * 0.9); // Diskon 10%
            }
            else {
                hargaPerOrang = (float)(jumlahTiket * hargaTiket); // Harga normal
            }

            totalPendapatan += hargaPerOrang;

            System.out.printf("Total harga yang harus dibayar oleh " + namaPembeli + " adalah: Rp %.2f\n", hargaPerOrang);
            sc.nextLine(); // Membersihkan newline dari buffer

        } while(true);

        System.out.println("============================================");
        System.out.println("TOTAL TIKET TERJUAL\t: " + totalTiket);
        System.out.printf("TOTAL PENDAPATAN\t: %.2f", totalPendapatan);
        System.out.println("\n============================================\n");
    }
}