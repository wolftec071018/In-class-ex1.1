import java.util.Scanner;

public class Homework4
{
    public static void main(String[] args){
        Scanner Input=new Scanner(System.in);
        float temp;
        System.out.print("Enter the fahrenheit you wish to convert to Celsius:");
        temp=Input.nextFloat();
        float cel=(temp-32)*5/9;
        System.out.println("That is "+cel+"Celsius");
    }

}