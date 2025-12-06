import java.util.Scanner;

public class CM2_JonathanAbdielHaryono {
    static Scanner sc = new Scanner(System.in);

    //static String[] komponenBiodataInt = {"Tahun Prestasi"};
    static String[] komponenBiodata = {
        "nama mahasiswa", "NIM", "nama prestasi",
        "peringkat prestasi", "tingkat Prestasi", "tahun Prestasi"
    };
    
    static String[] tingkat = {"Lokal", "Nasional", "Internasional"};

    static String[][] oldStringData = new String[1][komponenBiodata.length];
    static int[] oldIntData = new int[0];

    // TAMPILAN MENU
    public static int menu() {
        System.out.println("\nPilihan Menu :");
        System.out.println("1. Tambah Data Prestasi");
        System.out.println("2. Tampilkan Semua Prestasi");
        System.out.println("3. Cari Data Prestasi Berdasarkan Tahun");
        System.out.println("4. Hitung Jumlah Prestasi");
        System.out.println("5. Keluar");
        System.out.print("\nPilih menu : ");
        int pilihan = sc.nextInt();

        return pilihan;
    }

    // PILIHAN 1
    public static void tambahData(int nthUser) {
        sc.nextLine();
        String elemenString;
        int elemenInt;

        System.out.println("\n=== Biodata Mahasiswa ===");
        System.out.print("  - Masukkan nama anda\t: ");
        elemenString = sc.nextLine();
        oldStringData = inputString(oldStringData, elemenString, 0, nthUser);

        System.out.print("  - Masukkan NIM anda\t: ");
        elemenString = sc.nextLine();
        oldStringData = inputString(oldStringData, elemenString, 1, nthUser);

        System.out.println("\n=== Biodata Prestasi ===");
        System.out.print("  - Masukkan nama prestasi (misalnya 'Lomba Mewarnai')\t\t: ");
        elemenString = sc.nextLine();
        oldStringData = inputString(oldStringData, elemenString, 2, nthUser);

        System.out.print("  - Masukkan peringkat prestasi (misalnya 'Juara 3')\t\t: ");
        elemenString = sc.nextLine();
        oldStringData = inputString(oldStringData, elemenString, 3, nthUser);

        Boolean pres = false;
        do {
            System.out.print("  - Masukkan tingkat prestasi (Lokal/Nasional/Internasional)\t: ");
            elemenString = sc.nextLine();

            for (String s : tingkat) {
                if (s.equalsIgnoreCase(elemenString)) {
                    pres = true;
                    oldStringData = inputString(oldStringData, elemenString, 4, nthUser);
                    break;
                }
                else {
                    if (s.equals(tingkat[2])) {
                        System.out.println("\n    [!!!] Tingkat prestasi tidak valid. Masukkan ulang! [!!!]\n");
                    }
                    continue;
                }
            }
        } while (pres == false);
        
        do {
            System.out.print("  - Masukkan tahun prestasi (2015 - 2025)\t\t\t: ");
            elemenInt = sc.nextInt();

            elemenString = String.valueOf(elemenInt);
            
            if (elemenInt > 2025 || elemenInt < 2015) {
                System.out.println("\n    [!!!] Tahun prestasi tidak valid. Masukkan ulang! [!!!]\n");
            }
            else {
                oldIntData = inputInt(oldIntData, elemenInt, nthUser);
                oldStringData = inputString(oldStringData, elemenString, 5, nthUser);
                break;
            }

        } while (elemenInt > 2025 || elemenInt < 2015);
        
        System.out.println("\n=======================================");
        System.out.println("| Data prestasi berhasil ditambahkan! |");
        System.out.println("=======================================");
    }
        
    public static String[][] inputString(String[][] oldStringData, String elemen, int nthBiodata, int nthUser) {
        String[][] newStringData = new String[nthUser+1][komponenBiodata.length];

        // COPY DATA STRING LAMA KE DATA STRING BARU
        if (oldStringData != null) {
            for (int i = 0; i < oldStringData.length; i++) {
                for (int j = 0; j < komponenBiodata.length; j++) {
                    newStringData[i][j] = oldStringData[i][j];
                }
            }
        }

        // MENAMBAHKAN DATA BARU KE DATA STRING BARU
        newStringData[nthUser][nthBiodata] = elemen;

        return newStringData;
    }

    
    public static void tampilkanPrestasi(int nthUser) {
        if (nthUser == 0) {
            System.out.println("\n============================");
            System.out.println("| Belum ada data prestasi. |");
            System.out.println("============================");
            return;
        }
        else {
            int[] maksPanjangKolom = {4, 40, 17, 25, 22, 16, 14}; // tanpa spasi kanan kiri sebanyak 1

            System.out.println("================================================================================================================================================================");
            System.out.println("|  NO  |              NAMA MAHASISWA              |        NIM        |       NAMA PRESTASI       |   PERINGKAT PRESTASI   | TINGKAT PRESTASI | TAHUN PRESTASI |");
            System.out.println("================================================================================================================================================================");
            
            for (int i = 0; i < nthUser; i++) {
                for (int j = 0; j < komponenBiodata.length+1; j++) {
                    if (j == 0) {
                        System.out.print("| " + (i+1));
                        for (int k = 0; k < (maksPanjangKolom[j]+1 - String.valueOf(i+1).length()); k++) {
                            System.out.print(" ");
                        }
                    }
                    else {
                        for (int k = 0; k < maksPanjangKolom[j]; k++) {
                            if (k >= oldStringData[i][j-1].length()) {
                                if (k > maksPanjangKolom[j]) {
                                    break;
                                }
                                else {
                                    System.out.print(" ");
                                }
                            }
                            else {
                                System.out.print((oldStringData[i][j-1].toUpperCase()).charAt(k));
                            }      
                        }
                        System.out.print(" ");
                    }
                    System.out.print("| ");
                }
                System.out.println("\n================================================================================================================================================================");;
            }
        }
    }

    public static void hitungJumlah(int nthUser) {
        String retry = "";

        if (nthUser == 0) {
            System.out.println("\n===================================================");
            System.out.println("| Masukkan setidaknya 1 prestasi terlebih dahulu! |");
            System.out.println("===================================================\n");
        }
        else {
            System.out.println("\n=== HITUNG JUMLAH PRESTASI ===");

            do {
                System.out.println("\nKomponen Prestasi :");
                System.out.println("1. Nama Mahasiswa");
                System.out.println("2. NIM");
                System.out.println("3. Nama Prestasi");
                System.out.println("4. Peringkat Prestasi");
                System.out.println("5. Tingkat Prestasi");
                System.out.println("6. Tahun Prestasi");

                System.out.print("\nBerdasarkan komponen nomor berapa anda ingin melihat jumlah prestasi? : ");
                int ansKomponen = sc.nextInt();
                sc.nextLine();

                retry = stringSearch(nthUser, ansKomponen);
                
                if (retry.equalsIgnoreCase("tidak")) {
                    break;
                }
            } while (retry.equalsIgnoreCase("ya"));
        }
    }

    public static void intSearch(int nthUser, int ansKomponen) {
        String retry = "";

        if (nthUser == 0) {
            System.out.println("\n===================================================");
            System.out.println("| Masukkan setidaknya 1 prestasi terlebih dahulu! |");
            System.out.println("===================================================\n");
        }
        else {
            System.out.println("\n========== CARI PRESTASI MAHASISWA BERDASARKAN TAHUN ==========");
            do {
                System.out.print("\nMasukkan tahun prestasi yang ingin dicari (2015 - 2025) : ");
                int search = sc.nextInt();
                int dupCount = 0;

                if (search > 2025 || search < 2015) {
                    System.out.println("\n[!!!] Tahun prestasi tidak valid. [!!!]");
                    retry.equalsIgnoreCase("ya");
                }
                else {
                    int[] dupIndex = new int[nthUser];

                    for (int i = 0; i < nthUser; i++) {
                        if (oldIntData[i] == search) {
                            dupIndex[dupCount] = i;
                            dupCount++;
                        }
                    }

                    if (dupCount == 0) {
                        System.out.println("\n==========================================================");
                        System.out.println("| Data prestasi mahasiswa di tahun " + search + " tidak ditemukan. |");
                        System.out.println("==========================================================");
                    }
                    else {
                        System.out.println("================================================================================================================================================================");
                        System.out.println("|  NO  |              NAMA MAHASISWA              |        NIM        |       NAMA PRESTASI       |   PERINGKAT PRESTASI   | TINGKAT PRESTASI | TAHUN PRESTASI |");
                        System.out.println("================================================================================================================================================================");
                
                        int[] maksPanjangKolom = {4, 40, 17, 25, 22, 16, 14}; // tanpa spasi kanan kiri sebanyak 1

                        for (int i = 0; i < nthUser; i++) {
                            for (int j = 0; j < dupCount; j++) {
                                if (i == dupIndex[j]) {
                                    for (int k = 0; k < komponenBiodata.length+1; k++) {
                                        if (k == 0) {
                                            System.out.print("| " + (i+1));
                                            for (int l = 0; l < (maksPanjangKolom[k]+1 - String.valueOf(i+1).length()); l++) {
                                                System.out.print(" ");
                                            }
                                        }
                                        else {
                                            for (int l = 0; l < maksPanjangKolom[k]; l++) {
                                                if (l >= oldStringData[i][k-1].length()) {
                                                    if (l > maksPanjangKolom[k]) {
                                                        break;
                                                    }
                                                    else {
                                                        System.out.print(" ");
                                                    }
                                                }
                                                else {
                                                    System.out.print((oldStringData[i][k-1].toUpperCase()).charAt(l));
                                                }      
                                            }
                                            System.out.print(" ");
                                        }
                                        System.out.print("| ");
                                    }
                                    System.out.println("\n================================================================================================================================================================");
                                }
                                else {
                                    continue;
                                }
                            }
                            
                            
                        }
                        System.out.println("\nJumlah prestasi : " + dupCount);
                        
                    }
                    sc.nextLine();

                    
                }
                do {
                    System.out.print("\nApakah anda ingin mencari lagi? (ya/tidak) : ");
                    retry = sc.nextLine();

                    if (retry.equalsIgnoreCase("tidak")) {
                        break;
                    }
                    if (retry.equalsIgnoreCase("ya")) {
                        break;
                    }
                } while (true);
            } while (retry.equalsIgnoreCase("ya"));
        }
    }
    
    public static int[] inputInt(int[] oldIntData, int elemen, int nthUser) {
        int[] newIntData = new int[oldIntData.length+1];

        // COPY DATA INT LAMA KE DATA INT BARU
        for (int i = 0; i < oldIntData.length; i++) {
            newIntData[i] = oldIntData[i];
        }
        // MENAMBAHKAN DATA BARU KE DATA INT BARU
        newIntData[nthUser] = elemen;

        return newIntData;
    }

    public static int[] hitungTingkatPrestasi(int nthUser, int ansKomponen) {
        int[] hitungTingkat = new int[tingkat.length];

        for (int i = 0; i < nthUser; i++) {
            for (int j = 0; j < tingkat.length; j++) {
                if (oldStringData[i][ansKomponen-1].equalsIgnoreCase(tingkat[j])) {
                    hitungTingkat[j]++;
                }
            }
        }

        return hitungTingkat;
    }

    public static String stringSearch(int nthUser, int ansKomponen) {
        String retry = "";

        if (ansKomponen == 5) {
            System.out.println("\nTingkat prestasi :");

            for (int i = 0; i < tingkat.length; i++) {
                System.out.print("   " + (i+1) + ". " + tingkat[i]);

                if (i < 2) {
                    System.out.print("\t\t: ");
                }
                else {
                    System.out.print("\t: ");
                }
                System.out.println(hitungTingkatPrestasi(nthUser, ansKomponen)[i]);
            }
        }
        else {
            System.out.print("\nMasukkan " + komponenBiodata[ansKomponen-1] + " : ");
            String stringSearch = sc.nextLine();
            int dup = 0;
            Boolean done = false;

            for (int i = 0; i < nthUser; i++) {
                if (oldStringData[i][ansKomponen-1].equalsIgnoreCase(stringSearch)) {
                    dup++;
                    done = true;
                }
                else if (i == nthUser-1 && dup == 0) {
                    System.out.println("\nMaaf, " + komponenBiodata[ansKomponen-1] + " tidak ditemukan.");
                    done = false;
                }
            }
            if (done == true) {
                System.out.print("\n" + komponenBiodata[ansKomponen-1].toUpperCase());

                if (ansKomponen == 2) {
                    System.out.print("\t\t\t: ");
                }
                else if (ansKomponen == 4) {
                    System.out.print("\t: ");
                }
                else {
                    System.out.print("\t\t: ");
                }

                System.out.println(stringSearch.toUpperCase());
                System.out.println("JUMLAH PRESTASI\t\t: " + dup);
            }
        }

        do {
            System.out.print("\nApakah anda ingin melihat jumlah prestasi lagi? (ya/tidak) : ");
            retry = sc.nextLine();

            if (retry.equalsIgnoreCase("tidak")) {
                break;
            }
            if (retry.equalsIgnoreCase("ya")) {
                break;
            }
        } while (true);

        return retry;
    }

    // MAINNNNNNNNNNNNNNN
    public static void main(String[] args) {
        int pilihan = 0, nthUser = 0;

        System.out.println("=== PROGRAM PENCATATAN PRESTASI MAHASISWA ===");
        do {
            pilihan = menu();
            if (pilihan > 5 || pilihan < 1) {
                System.out.println("\n[!!!] Nomor tidak ada dalam pilihan menu. Silakan masukkan ulang! [!!!]");
                continue;
            }
            else {
                if (pilihan == 1) {
                    tambahData(nthUser);
                    nthUser++;
                    
                }
                else if (pilihan == 2) {
                    tampilkanPrestasi(nthUser);
                    
                }
                else if (pilihan == 3) {
                    intSearch(nthUser, pilihan);

                }
                else if (pilihan == 4) {
                    hitungJumlah(nthUser);
                }
            }
        } while (pilihan != 5);

        System.out.println("\n================================================");
        System.out.println("| Terima kasih sudah menggunakan layanan kami! |");
        System.out.println("================================================\n");
    }
}