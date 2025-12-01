import java.util.ArrayList;
import java.util.Scanner;

public class Kafe14 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("========== MENU RESTO KAFE ==========");
        System.out.println("1. Kopi Hitam        - Rp 15.000");
        System.out.println("2. Cappuccino        - Rp 20.000");
        System.out.println("3. Latte             - Rp 22.000");
        System.out.println("4. Teh Tarik         - Rp 12.000");
        System.out.println("5. Roti Bakar        - Rp 10.000");
        System.out.println("6. Mie Goreng        - Rp 18.000");
        System.out.println("--------------------------------------");
        System.out.println("Silakan pilih menu yang Anda inginkan : ");
    }

    public static double hitungTotalHarga14(int pilihanMenu, int banyakItem) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        double hargaTotal = hargaItem[pilihanMenu-1] * banyakItem;

        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rep = "";
        int i = 0;
        ArrayList<Integer> pilihanMenu = new ArrayList<>();
        ArrayList<Integer> banyakItem = new ArrayList<>();

        Menu("Andi", true, "DISKON30");

        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan (masukkan 0 untuk berhenti memesan): ");

            pilihanMenu.add(sc.nextInt());
            if (pilihanMenu.get(i) == 0) {
                pilihanMenu.remove(i);
                break;
            }
            i++;

            System.out.print("Masukkan jumlah item yang ingin dipesan : ");
            banyakItem.add(sc.nextInt());

        } while (true);

        double totalHarga = 0;
        
        sc.nextLine();
        System.out.print("\nMasukkan kode promo : ");
        String kodePromo = sc.nextLine();
        
        for (i = 0; i < pilihanMenu.size(); i++) {
            totalHarga += hitungTotalHarga14(pilihanMenu.get(i), banyakItem.get(i));
        }
        
        if (kodePromo.equals("DISKON30")) {
            System.out.printf("\nDiskon anda : Rp. %.2f", (totalHarga * 0.3));
            totalHarga = totalHarga - (totalHarga * 0.3);
        }
        else if (kodePromo.equals("DISKON50")) {
            System.out.printf("\nDiskon anda : Rp. %.2f", (totalHarga * 0.5));
            totalHarga = totalHarga - (totalHarga * 0.5);
        }
        else {
            System.out.print("\nKode invalid!");
        }

        System.out.printf("\n\nTotal harga untuk pesanan Anda: Rp. %.2f\n", totalHarga);
    }
}
