import java.util.Scanner;

public class Bai3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tiepTuc;
        do {
            double a, b, kq;
            int choice;

            System.out.print("Nhap so thu nhat: ");
            a = sc.nextDouble();
            System.out.print("Nhap so thu hai: ");
            b = sc.nextDouble();

            System.out.println("===== MENU =====");
            System.out.println("1. Cong");
            System.out.println("2. Tru");
            System.out.println("3. Nhan");
            System.out.println("4. Chia");
            System.out.print("Chon phep tinh (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    kq = a + b;
                    System.out.println("ket qua = " + kq);
                    break;
                case 2:
                    kq = a - b;
                    System.out.println("ket qua = " + kq);
                    break;
                case 3:
                    kq = a * b;
                    System.out.println("ket qua  = " + kq);
                    break;
                case 4:
                    if (b != 0) {
                        kq = a / b;
                        System.out.println("ket qua  = " + kq);
                    } else {
                        System.out.println("khong the chia cho 0!");
                    }
                    break;
                default:
                    System.out.println("lua chon loi !");
            }

            System.out.print("Nhap 'y' de tiep tuc lua chon, phim khac de thoat: ");
            sc.nextLine(); 
            tiepTuc = sc.nextLine();
        } while (tiepTuc.equalsIgnoreCase("y"));
        sc.close();
    }
}
