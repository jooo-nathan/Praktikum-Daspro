import java.util.Scanner;
public class SearchNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrNilai;
        int key, hasil=0;
        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int jumlah = sc.nextInt();
        arrNilai = new int[jumlah];
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            arrNilai[i] = sc.nextInt(); 
        }
        System.out.print("Masukkan nilai yang ingin dicari : ");
        key = sc.nextInt();
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                System.out.println("\nNilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil+1) + "\n");
                break;
            }
            else if ((i == (arrNilai.length-1)) && (key != arrNilai[i])) {
                System.out.println("\nNilai yang dicari tidak ditemukan\n");
            }
        }
    }
}
