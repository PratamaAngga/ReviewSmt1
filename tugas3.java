import java.util.Scanner;
public class tugas3 {
    static Scanner sc = new Scanner(System.in);
    public static void menu(String namaMK[], int sks[], int semester[], String hariKuliah[]){
        System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    tampilkanJadwal(namaMK, sks, semester, hariKuliah);
                    break;
            
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hariCari = sc.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMK, sks, semester, hariKuliah, hariCari);
                    break;
            
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int semesterCari = sc.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMK, sks, semester, hariKuliah, semesterCari);
                    break;
            
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String mkCari = sc.nextLine();
                    cariMataKuliah(namaMK, sks, semester, hariKuliah, mkCari);
                    break;
            
                case 5:
                    System.out.println("Finish!");
                    System.exit(0);
                    break;
            
                default:
                    break;
            }
    }
    public static void tampilkanJadwal(String namaMK[], int sks[], int semester[], String hariKuliah[]) {
        System.out.println("\nJadwal Kuliah:");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
        }
    }
    public static void tampilkanJadwalBerdasarkanHari(String namaMK[], int sks[], int semester[], String hariKuliah[], String hariCari) {
        System.out.println("\nJadwal Kuliah untuk hari " + hariCari + ":");
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hariCari)) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hariCari);
        }
    }
    public static void tampilkanJadwalBerdasarkanSemester(String namaMK[], int sks[], int semester[], String hariKuliah[], int semesterCari) {
        System.out.println("\nJadwal Kuliah untuk Semester " + semesterCari + ":");
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (semester[i] == semesterCari) {
                System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada semester " + semesterCari);
        }
    }
    public static void cariMataKuliah(String namaMK[], int sks[], int semester[], String hariKuliah[], String mkCari) {
        System.out.println("\nHasil Pencarian Mata Kuliah \"" + mkCari + "\":");
        boolean ditemukan = false;
        for (int i = 0; i < namaMK.length; i++) {
            if (namaMK[i].equalsIgnoreCase(mkCari)) {
                System.out.println("Nama: " + namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah \"" + mkCari + "\" tidak ditemukan.");
        }
    }
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();
        String namaMK[] = new String[n];
        int sks[] = new int[n];
        int semester[] = new int[n];
        String hariKuliah[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }
        while (true) {
            menu(namaMK, sks, semester, hariKuliah);
        }
    }
}
