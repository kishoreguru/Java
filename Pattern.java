public class Pattern
{
	public static void main(String[] args) {
		for(int FirstIndex=0;FirstIndex < 5;FirstIndex++)
		{
		    int v=1;
		    for(int SecondIndex=0;SecondIndex <= FirstIndex;SecondIndex++)
		    {
		        System.out.print(v+" ");
		        v++;
		    }
		    System.out.println();
		}
		
	}
}
