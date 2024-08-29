public class Tax
{
	public static void main(String[] args) 
	{
		//System.out.println("Enter parameters for cube");
		int num1=Integer.parseInt(args[0]);
		//int num2=Integer.parseInt(args[1]);
		
	    
		double tax=(num1*4.9)/100;
		System.out.println("Tax is"  +tax);
	}
}