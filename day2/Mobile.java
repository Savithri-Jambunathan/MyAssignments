package week1.day2;
//           class
public class Mobile 
{
   //accessmodifier    	returntype	methodname
        	public       void 		makeCall()
	{
		System.out.println("Make a Call");
	}
 
	public void takePhoto()
	{
		System.out.println("Take Photo");
	}
	
	public static void main(String[]args)
	{
		Mobile mobileOptions=new Mobile();
		mobileOptions.makeCall();
		mobileOptions.takePhoto();
	}
}