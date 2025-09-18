package week1.day2;

public class Fibonacci {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		int n1=10;
		int n2=0;
		int n3=1;
		System.out.println(n1 +" " +n2+ " ");
		
		for(int i=2; i<n1;i++)
		{
			int n4=n2+n3;
			System.out.println(n4+"");
			n2=n3;
			n3=n4;
			
		}
		
	}

}
