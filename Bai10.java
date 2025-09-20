import java.util.ArrayList;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Nhap so luong phan tu ban dau
        System.out.print("Nhap so luong phan tu ban dau: ");
        int n = sc.nextInt();

        // Nhap cac phan tu ban dau
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Danh sach ban dau: " + list);

        // Them phan tu
        System.out.print("Nhap vi tri can them: ");
        int posAdd = sc.nextInt();
        System.out.print("Nhap gia tri can them: ");
        int valueAdd = sc.nextInt();

        if (posAdd >= 0 && posAdd <= list.size()) {
            list.add(posAdd, valueAdd);
            System.out.println("Danh sach sau khi them: " + list);
        } else {
            System.out.println("Vi tri khong hop le!");
        }

        // Xoa phan tu
        System.out.print("Nhap vi tri can xoa: ");
        int posDel = sc.nextInt();

        if (posDel >= 0 && posDel < list.size()) {
            list.remove(posDel);
            System.out.println("Danh sach sau khi xoa: " + list);
        } else {
            System.out.println("Vi tri khong hop le!");
        }

        sc.close();
    }
}
