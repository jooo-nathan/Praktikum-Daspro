import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan : ");
        int jumlah = sc.nextInt();
        System.out.println();

        String nama[] = new String[jumlah];
        int harga[] = new int[jumlah], total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("-----------------------------------------------");
            System.out.println("Pesanan ke-" + (i+1));
            sc.nextLine();
            System.out.print("Masukkan nama makanan/minuman : ");
            nama[i] = sc.nextLine();
            System.out.print("Masukkan harga makanan/minuman : ");
            harga[i] = sc.nextInt();
            System.out.println();

            total += harga[i];
        }

        System.out.println("==========================================================================");
        System.out.println("Baik, pesanan anda sudah kami terima! Izinkan kami mengulang pesanan anda.");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n-----------------------------------------------");
            System.out.println("Pesanan ke-" + (i+1));
            System.out.println("Nama makanan/minuman yang anda pesan : " + nama[i]);
            System.out.println("Harga makanan/minuman yang anda pesan : " + harga[i]);
        }

        System.out.println("\nTotal biaya untuk seluruh pesanan anda adalah sebesar " + total);
        System.out.println();
    }
}
