import java.util.Scanner;
public class bai2_4 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = scanner.nextInt();
        System.out.print("Nhap so thu ba: ");
        int c = scanner.nextInt();
        int smallest;
        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        } else {
            smallest = c;
        }
        System.out.println("So nho nhat la: " + smallest);
    }
}