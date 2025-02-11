import java.util.Scanner;
public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nim;
        int n, i;

        System.out.print("Please input your NIM: ");
        nim = sc.nextLine();

        n = Integer.parseInt(nim.substring(nim.length()-2));
        if (n < 10) {
            n+=10;
        }
        for(i = 1; i <= n; i++){
            if (i != 6 && i !=10) {
                if (i%2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }
            }
        }
    }
}
