import java.util.Scanner;

public class Kubus14 {
    public static int volumeKubus(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    
    public static int luasPermukaankubus(int sisi) {
        int luasPermukaan = (sisi * sisi) * 6;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Penghitung Volume dan Luas Permukaan Kubus");

        System.out.print("Masukkan sisi kubus : ");
        int sisi = sc.nextInt();

        System.out.println("Volume kubus adalah : " + volumeKubus(sisi));
        System.out.println("Luas permukaan kubus adalah : " + luasPermukaankubus(sisi));


    }
}
