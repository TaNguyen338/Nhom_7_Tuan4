import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        int n = sc.nextInt();

        boolean laNguyenTo = true;

        if (n < 2) {
            laNguyenTo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    laNguyenTo = false;
                    break;
                }
            }
        }

        if (laNguyenTo) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai so nguyen to");
        }
        sc.close();
    }
}
