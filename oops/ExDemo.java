//WAP to find divsion of two number by handlind all types of exception
import java.util.*;
class ExDemo
{
public static void main(String [] args)
{
int x,y,z;
Scanner s=new Scanner (System.in);
try
{
System.out.println("Enter value of two number");
x=s.nextInt();
y=s.nextInt();
z=x/y;
System.out.println("Result="+z);
}
catch(InputMismatchException ex)
{
System.out.println("Enter number only");
}
catch(ArithmeticException ex1)
{
System.out.println("Are you trying to divide by 0");
}
finally
{
System.out.println("this is finally result");
}
}
}
