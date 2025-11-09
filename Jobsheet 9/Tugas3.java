import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String key;
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Soda", "Water",
        "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice", "French Fries"};

        System.out.println("Selamat datang di Kafe!\n");

        System.out.print("Anda ingin mencari menu apa ? : ");
        key = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])) {
                System.out.println("\nMenu pilihan anda, " + menu[i] + ", ditemukan!\n");
                break;
            }
            else if ((!key.equalsIgnoreCase(menu[i])) && (i == (menu.length-1))) {
                System.out.println("\nMohon maaf. Menu pilihan anda tidak ditemukan.\n");
                break;
            }
        }
    }
}
