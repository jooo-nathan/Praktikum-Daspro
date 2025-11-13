import java.util.Scanner;
public class BioskopWithScanner14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int menu = 1;

        do {
            System.out.println("\nDaftar menu:");
            System.out.println("Menu 1 : Input data penonton");
            System.out.println("Menu 2 : Tampilkan daftar penonton");
            System.out.println("Menu 3 : Exit\n");

            System.out.print("Masukkan pilihan menu : ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("\nMasukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    int baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    int kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris > 4 || kolom > 2) {
                        System.out.println("\nMaaf, kursi pada baris dan kolom tersebut tidak tersedia.");
                        System.out.println("Maksimal untuk baris adalah 4 dan maksimal untuk kolom adalah 2.");
                        System.out.println("Silakan masukkan ulang baris dan kolom dengan ketentuan tersebut.");
                    }
                    else {
                        if (penonton[baris-1][kolom-1] == null) {
                            penonton[baris-1][kolom-1] = nama;
                            System.out.print("Input penonton lainnya? (y/n): ");
                            String next = sc.nextLine();

                            if (next.equalsIgnoreCase("n")) {
                                break;
                            }
                        }
                        else {
                            System.out.println("\nMaaf, kursi yang anda pilih sudah terisi oleh penonton lainnya.");
                            System.out.println("Silakan masukkan ulang baris dan kolom kursi yang belum terisi.");
                        }
                    }
                }
            }
            else if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            penonton[i][j] = "***";
                        }
                    }
                    System.out.print("\nPenonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
                }
                System.out.println();
            }
            else if (menu == 3) {
                System.out.println("\nTerima kasih sudah menggunakan layanan kami!\n");
                break;
            }
            else {
                System.out.println("\nPilihan tidak ada dalam menu! Silakan masukkan ulang!");
            }
        } while (menu != 3);
    }
}