import java.util.Scanner;

public class tugas2 {
    public static double hitungVolume(double sisi) {
        return Math.pow(sisi, 3);
    }
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }
    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
    public static void tampilkanMenu() {
        System.out.println("\n=== Kalkulator Kubus ===");
        System.out.println("1. Hitung Volume");
        System.out.println("2. Hitung Luas Permukaan");
        System.out.println("3. Hitung Keliling");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        double sisi;
        while (true) {
            tampilkanMenu();
            pilihan = sc.nextInt();
            if (pilihan == 4) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            }
            if (pilihan > 4 || pilihan < 0) {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                continue;
            }
            System.out.print("Masukkan panjang sisi kubus: ");
            sisi = sc.nextDouble();
            switch (pilihan) {
                case 1:
                    System.out.println("Volume Kubus: " + hitungVolume(sisi));
                    break;
            
                case 2:
                    System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                    break;
            
                case 3:
                    System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                    break;
            
                default:
                    break;
            }
        }
    }
}
