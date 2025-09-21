import java.util.Scanner;

public class Bai9_4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("nhap so luong phan tu: ");
            int n = scanner.nextInt();
            
            int[] mang = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("nhap phan tu thu " + (i + 1) + ": ");
                mang[i] = scanner.nextInt();
            }
            System.out.println("cac phan tu trong mang la:");
            for (int i = 0; i < n; i++) {
                System.out.println("phan tu thu " + (i + 1) + ": " + mang[i]);
            }
        }
    }
}