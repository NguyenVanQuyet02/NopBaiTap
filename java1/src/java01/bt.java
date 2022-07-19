package java01;
import java.util.Scanner;
public class bt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int d,m;
		System.out.println("Nhap ngay thang sinh: ");
		d = scanner.nextInt();
		m = scanner.nextInt();
		if(d > 0 && d <=31 && m > 0 && m <=12)
		{
			if(d >= 20 && m==1 && d <=31 || d <=18 && m ==2)
				System.out.println("Cung hoang dao cua bn la Bao Binh");
			else if(d >= 19 && d <=28 && m==2 || d <=20 && m ==3)
				System.out.println("Cung hoang dao cua bn la Song Ngu");
			else if(d >= 21 && m==3 && d <=31 || d <=20 && m ==4)
				System.out.println("Cung hoang dao cua bn la Bach Duong");
			else if(d >= 21 && m==4 && d <=30|| d <=20 && m ==5)
				System.out.println("Cung hoang dao cua bn la Kim Nguu");
			else if(d >= 21 && m==5 && d <=31|| d <=21 && m ==6)
				System.out.println("Cung hoang dao cua bn la Song Tu");
			else if(d >= 22 && m==6 && d <=30 || d <=22 && m ==7)
				System.out.println("Cung hoang dao cua bn la Cu Giai");
			else if(d >= 23 && m==7 && d <=31|| d <=22 && m ==8)
				System.out.println("Cung hoang dao cua bn la Su Tu");
			else if(d >= 23 && m==8 && d <=31|| d <=22 && m ==9)
				System.out.println("Cung hoang dao cua bn la Xu Nu");
			else if(d >= 23 && m==9 && d <=30|| d <=23 && m ==10)
				System.out.println("Cung hoang dao cua bn la Thien Binh");
			else if(d >= 24 && m==10 && d <=31|| d <=22 && m ==11)
				System.out.println("Cung hoang dao cua bn la Bo Cap");
			else if(d >= 23 && m==11 && d <=30|| d <=21 && m ==12)
				System.out.println("Cung hoang dao cua bn la Nhan Ma");
			else if(d >= 22 && m==12 && d <=31|| d <=19 && m ==1)
				System.out.println("Cung hoang dao cua bn la Ma Ket");
			else
				System.out.println("Ngay Thang ban nhap sai");
		}
		else
			System.out.println("Ngay Thang ban nhap sai");
	}
}
