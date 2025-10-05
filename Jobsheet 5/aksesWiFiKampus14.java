import java.util.Scanner;
public class aksesWiFiKampus14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat datang di WiFi milik kampus");
        System.out.print("Apakah anda dosen? (true/false) : ");
        boolean isLecture = sc.nextBoolean();

        if (isLecture) {
            System.out.println("Akses WiFi diberikan (dosen).");
        }
        else {
            System.out.print("Apakah anda mahasiswa kampus ini? (true/false) : ");
            boolean isStudent = sc.nextBoolean();

            if (isStudent) {
                System.out.print("Masukkan jumlah SKS anda : ");
                int SKS = sc.nextInt();

                if (SKS >= 12) {
                    System.out.println("Akses WiFi diberikan (mahasiswa aktif).");
                }
                else {
                    System.out.println("Akses ditolak. SKS kurang dari 12.");
                }
            }
            else {
                System.out.println("Akses ditolak");
            }
        }

    }
}
