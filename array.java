import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String huruf[] = {"A", "B+", "B", "C+", "C", "D", "E"};
        double setara[] = {4, 3.5, 3, 2.5, 2, 1, 0};
        String matkul[] = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        double nilaiAngka[] = new double[matkul.length];
        double nilaiSetara[] = new double[matkul.length];
        String nilaiHuruf[] = new String[matkul.length];
        double total = 0;
        for(int i = 0; i < matkul.length; i++){
            System.out.print("Input your "+matkul[i]+"'s grade: ");
            nilaiAngka[i] = sc.nextDouble();
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
            } else if (nilaiAngka[i] <= 39) {
                nilaiHuruf[i] = "E";
            } else {
                System.out.println("you're grade is invalid");
                break;
            }
            for(int j = 0; j < huruf.length; j++){
                if (nilaiHuruf[i].equals(huruf[j])) {
                    nilaiSetara[i] = setara[j];
                    break;
                }
            }
            total+=nilaiSetara[i];
        }
        double ipSemester = total/matkul.length;
        System.out.println("=============================================");
        System.out.println("Grades Convert Results");
        System.out.println("=============================================");
        System.out.printf("%-40s %-15s %-15s %-12s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for(int k=0;k<matkul.length;k++){
            System.out.printf("%-40s %-15s %-15s %-12s%n", matkul[k], nilaiAngka[k], nilaiHuruf[k], nilaiSetara[k]);
        }
        System.out.println("=============================================");
        System.out.println("IP: "+ipSemester);
    }
}
