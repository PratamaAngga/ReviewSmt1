public class fungsi {
    static final int hargaAglonema = 75000;
    static final int hargaKeladi = 50000;
    static final int hargaAlocasia = 60000;
    static final int hargaMawar = 10000;

    static void showPendapatan(int[][] stock) {
        String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        System.out.println("Income if all of flowers is sold out: ");
        for(int i = 0; i < stock.length; i++){
            int pendapatan = (stock[i][0] * hargaAglonema) + (stock[i][1] * hargaKeladi) + (stock[i][2] * hargaAlocasia) + (stock[i][3] * hargaMawar);
            System.out.println(cabang[i]+": Rp "+pendapatan);
        }

    }

    static void kurangiStok(int[][] stock, int[] bungaMati) {
        String bunga[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for(int j = 0; j < stock[3].length; j++){
            int sisa = Math.max(stock[3][j] - bungaMati[j], 0);
            System.out.println(bunga[j]+": "+sisa);
        }
    }

    public static void main(String[] args) {
        int stock[][] = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int bungaMati[] = {1, 2, 0, 5};
        showPendapatan(stock);
        System.out.println("Remaining flowers at RoyalGarden 4:");
        kurangiStok(stock, bungaMati);
    }
}
