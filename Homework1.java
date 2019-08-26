import java.util.Scanner;

public class Homework1
{
	public static void main(String [] args)
	{
		Scanner Input=new Scanner(System.in);
		int num1;// makes the var
		float num2;
		System.out.print("Enter 1st number:");//takes 1st input
		num1=Input.nextInt();//stores input
		System.out.print("Enter 2nd number:");//2nd input
		num2=Input.nextFloat();//stores 2nd input
		//sets values 
		float sum=num1+num2;
		float dif=num1-num2;
		float pro=num1*num2;
		float quo=num1/num2;
		int rem=num1%(int)num2;
		//print values
		System.out.println("Sum="+ sum);
		System.out.println("Difference="+ dif);
		System.out.println("product="+ pro);
		System.out.println("Quotient="+ quo);
		System.out.println("Remainder="+ rem);

	}
}