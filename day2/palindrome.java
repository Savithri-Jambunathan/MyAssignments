package week1.day2;

public class palindrome 

{
	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		int input=121121121;
		int output=0;
		int rem;
		
		for (int i=input; i>0; i=i/10)
{			
			rem = i%10;
			output = rem+(output*10);
}


	if (input==output)
{
		System.out.println("Number is a palindrome");
}
	else
{
		System.out.println("Number is not a palindrome");
}

}
}
