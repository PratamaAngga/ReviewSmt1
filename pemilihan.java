import java.util.Scanner;
public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, choose;
        double tugas, kuis, uts, uas, total;

        while (true) {
            System.out.print("Input your name: ");
            nama = sc.nextLine();
            System.out.print("Input your assignment's grade: ");
            tugas = sc.nextDouble();
            System.out.print("Input your quiz's grade: ");
            kuis = sc.nextDouble();
            System.out.print("Input your mid exam's grade: ");
            uts = sc.nextDouble();
            System.out.print("Input your final exam's grade: ");
            uas = sc.nextDouble();
            sc.nextLine();
            if (tugas > 100 || tugas < 0 || kuis > 100 || kuis < 0 || uts > 100 || uts < 0 || uas > 100 || uas < 0) {
                System.out.println("Your input is invalid! Please Input Again!!");
                continue;
            }
            total = (kuis * 0.2) + (tugas * 0.2) + (uts * 0.3) + (uas * 0.3);

            if (total > 80 && total <= 100) {
                System.out.println("Final grade you get is "+total);
                System.out.println("You get A");
                System.out.println("You're Pass");
            } else if (total > 73 && total <= 80) {
                System.out.println("Final grade you get is "+total);
                System.out.println("You get B+");
                System.out.println("You're Pass");
            } else if (total > 65 && total <= 73) {
                System.out.println("Final grade you get is "+total);
                System.out.println("You get B");
                System.out.println("You're Pass");
            } else if (total > 60 && total <= 65) {
                System.out.println("Final grade you get is "+total);
                System.out.println("You get C+");
                System.out.println("You're Pass");
            } else if (total > 50 && total <= 60) {
                System.out.println("Final grade you get is "+total);
                System.out.println("You get C");
                System.out.println("You're Pass");
            } else if (total > 39 && total <= 50) {
                System.out.println("Final grade you get is "+total);
                System.out.println("You get D");
                System.out.println("You're Fail");
            } else if (total <= 39) {
                System.out.println("Final grade you get is "+total);
                System.out.println("You get E");
                System.out.println("You're Fail");
            } else {
                System.out.println("you're grade is invalid");
            }
            System.out.println();
            System.out.print("Do you wanna input grades again(Yes/No)?");
            choose = sc.nextLine();
            if (choose.equalsIgnoreCase("Yes")) {
                break;
            } else if (choose.equalsIgnoreCase("No")) {
                continue;
            } else {
                System.out.println("Your choice is invalid");
            }
        }

    }
}