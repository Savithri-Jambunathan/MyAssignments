package week1.day2;

public class LearnOperators {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
     int a=6;
     int b=3;
     //addition, subtraction, division,multiplication
     System.out.println(a+b);
     System.out.println(a-b);
     System.out.println(a*b);
     System.out.println(a/b);
     System.out.println(a%b);
     System.out.println("===================");
     
     //comparison operator <,>,<=,>=,!=,==
     int c=4;
     int d=10;
     System.out.println(c>d);
     System.out.println(c<d);
     System.out.println(c==d);
     System.out.println(c!=d);
     System.out.println("=====!!==!!==!!==!!===");
     
     int x=5;
     int y=10;
     System.out.println(x==y||x<y);
     System.out.println("==--==--==--==--==--==--");
    
     //increment and decrement operator
     //post and pre increment
    
     int p=10;
     System.out.println(p++);
     System.out.println(p);
	 System.out.println(++p);
     System.out.println(p--);
     System.out.println(--p);
     System.out.println(p);
	
     System.out.println("---------------");
     //logical operator And Or 
     //And && Or ||
     int e=10;
     int f=20;
     System.out.println(e>f && e<f);
     //System.out.println("FALSE");
     
     System.out.println(e==f || e<f);
    // System.out.println("TRUE");
     System.out.println("=================");
     
     
     
    
	}

}
