/*WAP to develop a program to take decimal number as input and find its binary octal and hexa-decimal equivalent*/
import java.util.*;
class Overlapping3
{
public static void main(String [] args)
{
int b;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value");
b=s.nextInt();
System.out.println("binary="+Integer.toBinaryString(b));
System.out.println("octal="+Integer.toOctalString(b));
System.out.println("hexadecimal="+Integer.toHexString(b));
}
}

