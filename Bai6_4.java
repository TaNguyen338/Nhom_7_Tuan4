import java.util.Scanner;

public class Bai6_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguyen thu nhat: ");
		int a = sc.nextInt();
		System.out.print("Nhap so nguyen thu hai: ");
		int b = sc.nextInt();

		int ucln = timUCLN(a, b);
		int bcnn = timBCNN(a, b);

		System.out.println("UCLN cua " + a + " va " + b + " la: " + ucln);
		System.out.println("BCNN cua " + a + " va " + b + " la: " + bcnn);
		sc.close();
	}

	public static int timUCLN(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return Math.abs(a);
	}

	public static int timBCNN(int a, int b) {
		return Math.abs(a * b) / timUCLN(a, b);
	}
}
