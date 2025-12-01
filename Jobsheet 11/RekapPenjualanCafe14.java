import java.util.Scanner;

public class RekapPenjualanCafe14 {
    public static int inputData(Scanner sc) {
        int data = sc.nextInt();

        return data;
    }

    public static void tampilData(int data[][], String menu[], int hari, int longest) {
        int k = 0;
        for (int i = 0; i < ((data.length+1)*2)+1; i++) {
            if ((i == 0) || (i % 2 == 0)) {
                System.out.print("\n--------");

                if (longest > 4 && longest < 13) {
                    System.out.print("--------");
                } else if (longest > 12 && longest < 21) {
                    System.out.print("----------------");
                } else if (longest > 20 && longest < 29) {
                    System.out.print("------------------------");
                }
                for (int j = 0; j < hari; j++) {
                    System.out.print("-----------------------");
                }
                System.out.println();
                
            }
            else {
                if (i == 1) {
                    for (int j = 0; j < hari+1; j++) {
                        if (j == 0) {
                            if (longest < 5) {
                                System.out.print("| Menu\t");
                            } else if (longest < 13) {
                                System.out.print("| Menu\t\t");
                            } else if (longest < 21) {
                                System.out.print("| Menu\t\t\t");
                            } else if (longest < 29) {
                                System.out.print("| Menu\t\t\t\t");
                            }
                            
                        }
                        else {
                            System.out.print("|\tHari ke  " + j + "\t");
                            if (j == 7) {
                                System.out.print("|");
                            }
                        }
                    }
                }
                else if ((i > 2) && (i % 2 == 1)) {
                    for (int j = 0; j < hari+1; j++) {
                        if (j == 0) {
                            if (menu[i-3-k].length() < 7) {
                                System.out.print("| " + menu[i-3-k] + "\t|");
                            } else if (menu[i-3-k].length() < 14) {
                                System.out.print("| " + menu[i-3-k] + "\t|");
                            } else if (menu[i-3-k].length() < 22) {
                                System.out.print("| " + menu[i-3-k] + "\t\t|");
                            } else if (menu[i-3-k].length() < 30) {
                                System.out.println("| " + menu[i-3-k] + "\t\t\t|");
                            } else if (menu[i-3-k].length() < 38) {
                                System.out.println("| " + menu[i-3-k] + "\t\t\t\t|");
                            }
                        }
                        else {
                            System.out.print("\t    " + data[i-3-k][j-1] + "    \t");
                            System.out.print("|");
                        }
                    }
                    k++;
                }
            }
        }
    }

    public static void tampilMenuOP(int[][] data, int hari, String menu[]) {
        int jumlahTertinggi = 0, menuTertinggi = 0, total = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < hari; j++) {
                total += data[i][j];
            }
            if (total > jumlahTertinggi) {
                jumlahTertinggi = total;
                menuTertinggi = i;
            }
            total = 0;
        }

        System.out.println("Menu dengan penjualan tertinggi adalah " + menu[menuTertinggi]
        + " dengan total penjualan sebanyak " + jumlahTertinggi + " buah");
    }

    public static void rataRata(int data[][], int hari, String menu[], int longest) {
        int total = 0;
        double rataRata;

        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < hari; j++) {
                total += data[i][j];
            }
            rataRata = (double) (total/hari);
            System.out.print("Menu ke " + (i+1) + " : " + menu[i]);

            if (longest < 5) {
                System.out.print("\tRata-rata : ");
            }
            else if (longest < 13) {
                System.out.print("\t\tRata-rata : ");
            }
            else if (longest < 21) {
                System.out.print("\t\t\tRata-rata : ");
            }
            else if (longest < 29) {
                System.out.print("\t\t\t\tRata-rata : ");
            }
            
            System.out.printf("%.2f\n", rataRata);
            total = 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Rekap Penjualan Cafe\n");

        System.out.print("Masukkan jumlah hari : ");
        int hari = sc.nextInt();
        System.out.print("Masukkan jumlah menu : ");
        int jumlahMenu = sc.nextInt();

        String menu[] = new String[jumlahMenu];
        int[][] data = new int[menu.length][hari];
        System.out.println();
        sc.nextLine();

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i+1) + " : ");
            menu[i] = sc.nextLine();
        }

        String terpanjang = "";
        for (String s : menu) {
            if (s.length() > terpanjang.length()) {
                terpanjang = s;
            }
        }
        int longest = terpanjang.length();

        System.out.println("Input data");

        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu ke-" + (i+1) + " : " + menu[i]);
            for (int j = 0; j < hari; j++) {
                System.out.print("   - Hari ke-" + (j+1) + " : ");
                data[i][j] = inputData(new Scanner(System.in));
            }
        }

        System.out.print("\nData Penjualan");
        tampilData(data, menu, hari, longest);

        System.out.println();
        System.out.println("\nMenu penjualan tertinggi");
        tampilMenuOP(data, hari, menu);

        System.out.println();
        System.out.println("\nRata-rata penjualan tiap menu");
        rataRata(data, hari, menu, longest);
        System.out.println();


        System.out.println("nyerah dah... :')");
    }
}