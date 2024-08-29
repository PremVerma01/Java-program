public class Sample 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		//int number1=Integer.parseInt(args[0]); when we are using this we have to give value at cmd 
		//int number2=Integer.parseInt(args[1]);
		int number1=20;
		int number2=10;
		int result1=number1+number2;
		int result2=number1-number2;
		int result3=number1*number2;
		int result4=number1/number2;
		System.out.println("the result is"+result1+" "+result2+" " +result3+" " +result4);
	}
}
