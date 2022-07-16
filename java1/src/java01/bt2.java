package java01;
import java.util.Scanner;
public class bt2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a,b,c;
		System.out.println("Nhap lan luot 3 canh cua tam giac: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		if(a + b <= c || a + c <= b || b + c <= a )
		{
			System.out.println("3 canh vua nhap khong tao thanh tam giac");
		}
		else {
			if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) || Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2))
			{
				if(a == b || a == c || b == c)
				{
					System.out.println("Day la tam giac vuong can");
				}
				else {
					System.out.println("Day la tam giac vuong");
				}
			}
			else if(a == b || a == c || b == c)
			{
				if(a == b && a== c)
				{
					System.out.println("Day la tam giac deu");
				}
				else {
					System.out.println("Day la tam giac can");
				}
			}
		}
	}
}
