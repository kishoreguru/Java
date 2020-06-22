import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int v=scan.nextInt();
		int fact=1;
		while(v>0)
		{
			fact*=v;
			v--;
		}
		System.out.println("Factorial is :"+fact);
	}
}
