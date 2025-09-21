import java.util.Scanner;

public class bai5_4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so nguyen : ");
            int n = scanner.nextInt();
            if (n < 2) {
                System.out.println(n + " không phải là số nguyên tố.");
            } else {
                boolean laSoNguyenTo = true;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        laSoNguyenTo = false;
                        break;
                    }
                }
                if (laSoNguyenTo) {
                    System.out.println(n + " la so nguyen to.");
                } else {
                    System.out.println(n + " khong phai la so nguyen to.");
                }
            }
        }
    }
}
