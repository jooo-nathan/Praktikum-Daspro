public class PengunjungCafe14 {
    public static void daftarPengunjung(String ...namaPengunjung) {
        System.out.println("Daftar nama pengunjung : ");
        for (String temp : namaPengunjung) {
            System.out.println("- " + temp);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
        daftarPengunjung();
    }
}