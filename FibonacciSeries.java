public class FibonacciSeries
{
	public static void main(String[] args) {
		int FirstNo=0,SecondNo=1,ThirdNo=1;
		System.out.println(FirstNo);
		System.out.println(SecondNo);
		while(ThirdNo<89)
		{
			ThirdNo=FirstNo+SecondNo;
			FirstNo=SecondNo;
			SecondNo=ThirdNo;
			System.out.println(ThirdNo);
		}
		
	}
}
