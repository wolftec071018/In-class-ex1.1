import java.util.Scanner;

public class Homework2
{ 
    public static void main(String [] args)
    {
        Scanner Input=new Scanner(System.in);
        float radius;
        System.out.print("Enter Radius:");
        radius=Input.nextFloat();
        double Area= 3.14*radius*radius;
        double Circumference= 2*3.14*radius;

        System.out.println("The Area of the Circle is: "+Area);
        System.out.println("The Circumference of the Circle is:"+Circumference);
    }
       
}