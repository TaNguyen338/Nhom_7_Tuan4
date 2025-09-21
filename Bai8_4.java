import java.util.Scanner;

public class Bai8_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu cua mang: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Nhap cac phan tu cua mang:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int maxCount = 0;
		int mostValue = arr[0];
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[j] == arr[i]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				mostValue = arr[i];
			}
		}

		System.out.println("Phan tu xuat hien nhieu nhat la: " + mostValue + ", xuat hien " + maxCount + " lan.");
		sc.close();
	}
}
