import java.util.Scanner;

public class NilaiMahasiswa14 {
    public static int isianArray() {
        Scanner sc = new Scanner(System.in);

        int nilai = sc.nextInt();
        return nilai;
    }

    public static void tampilArray(int nilai) {
        System.out.println(nilai);
    }

    public static int hitTot(int nilai[]) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Input Nilai Mahasiswa");
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = sc.nextInt();
        System.out.println();

        int nilai[] = new int[n];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = isianArray();
        }

        System.out.println();
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + " adalah ");
            tampilArray(nilai[i]);
        }

        System.out.println("\nTotal nilai seluruh mahasiswa adalah " + hitTot(nilai));
        System.out.println();
    }
}
