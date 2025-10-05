import java.util.Scanner;

public class sistemPerpustakaan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selamat datang di perpustakaan kampus.");
        System.out.print("Apakah anda membawa kartu mahasiswa? (true/false) : ");

        boolean bawaKartuMahasiswa = sc.nextBoolean();

        if (bawaKartuMahasiswa) {
            System.out.println("Silakan masuk ke perpustakaan.");
        }
        else {
            System.out.print("Apakah anda sudah registrasi online? (true/false) : ");
            boolean sudahRegisOnline = sc.nextBoolean();
            if (sudahRegisOnline) {
                System.out.println("Silakan masuk ke perpustakaan.");
            }
            else {
                System.out.println("Maaf, anda ditolak untuk masuk.");
            }
        }
    }
}
