import java.util.Scanner;

public class Homework3{
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Enter First variable:");
        num1=Input.nextInt();
        System.out.print("Enter Second variable:");
        num2=Input.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("Original First="+num1);
        System.out.println("Original Second="+num2);
        System.out.println("New First="+num1);
        System.out.println("New Second="+num2);

    }
}