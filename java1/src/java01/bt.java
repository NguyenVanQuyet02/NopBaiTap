package java01;
import java.util.Scanner;
public class bt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m;
		System.out.println("Nhap thang sinh: ");
		m = scanner.nextInt();
		switch(m) {
		case 1:
			System.out.println("Cung hoang dao cua bn la Ma Ket");
			break;
		case 2:
			System.out.println("Cung hoang dao cua bn la Bao Binh");
			break;
		case 3:
			System.out.println("Cung hoang dao cua bn la Song Ngu");
			break;
		case 4:
			System.out.println("Cung hoang dao cua bn la Bach Duong");
			break;
		case 5:
			System.out.println("Cung hoang dao cua bn la Kim Nguu");
			break;
		case 6:
			System.out.println("Cung hoang dao cua bn la Song Tu");
			break;
		case 7:
			System.out.println("Cung hoang dao cua bn la Cu Giai");
			break;
		case 8:
			System.out.println("Cung hoang dao cua bn la Su Tu");
			break;
		case 9:
			System.out.println("Cung hoang dao cua bn la Xu Nu");
			break;
		case 10:
			System.out.println("Cung hoang dao cua bn la Thien Binh");
			break;
		case 11:
			System.out.println("Cung hoang dao cua bn la Bo Cap");
			break;
		case 12:
			System.out.println("Cung hoang dao cua bn la Nhan Ma");
			break;
		default:
			System.out.println("Thang ban nhap sai");
		}
	}
}
