import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MANAJEMEN KAFE 'Kopi Senja'\n");
        System.out.print("Jumlah cabang kafe : ");
        int jumKafe = sc.nextInt();
        int totalItem = 0, totalCust = 0;

        System.out.println("\n======= Input Penjualan Per Cabang =======");
        for (int i = 1; i <= jumKafe; i++) {
            System.out.printf("\n--------------- Cabang %d ---------------", i);
            System.out.print("\nJumlah pelanggan : ");
            int jumCust = sc.nextInt();
            int totalItemPerCab = 0;

            for (int j = 1; j <= jumCust; j++) {
                System.out.printf(" - Pelanggan %d memesan berapa item? ", j);
                int jumItem = sc.nextInt();
                totalItemPerCab += jumItem;
            }
            if (i != jumKafe) {
                System.out.print("\n-----------------------------------------------");
            }

            System.out.printf("\nAnalisis Cabang %d\n", i);
            System.out.printf(" -- Total Pelanggan\t: %d orang", jumCust);
            System.out.printf("\n -- Total Item Terjual\t: %d item\n", totalItemPerCab);

            totalItem = totalItem + totalItemPerCab;
            totalCust = totalCust + jumCust;

        }
        System.out.println("\n=================================================");
        System.out.println("Total seluruh cabang");
        System.out.printf("Total Pelanggan\t: %d orang\n", totalCust);
        System.out.printf("Item terjual\t: %d item\n\n", totalItem);
    }
}
