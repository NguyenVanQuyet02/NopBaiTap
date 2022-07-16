package java01;
import java.util.Scanner;
public class bt3 {
	public static int ktsnt(int a) {
		if(a < 2)
			return 0;
		for(int i = 2; i<= Math.sqrt(a); i++)
		{
			if(a % i == 0)
				return 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		int sum = 0,d=0;
		for(int i = 1 ; i<= n ; i++)
		{
			if(ktsnt(i)==1)
			{
				sum += i;
				d++;
			}
		}
		if(d==0)
		
			System.out.println("Khong co snt");
		else
			System.out.println("Tong cac snt = " + sum);
	}
}
