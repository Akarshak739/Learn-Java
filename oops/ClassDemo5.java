//WAP to demostrate concept of constructor
import java.util.*;
class Rectangle
{
int length;
int breadth;
Rectangle(int l,int b)//Constructor
{
length=l;
breadth=b;
}
public int area()
{
return length*breadth;
}
}	
class  ClassDemo5
{
public static void main(String [] args)
{
int x,y,z;
Scanner s=new Scanner(System.in);
System.out.print("Enter length:");
x=s.nextInt();
System.out.print("Enter breadth:");
y=s.nextInt();
Rectangle r=new Rectangle(x,y);
z=r.area();
System.out.println("Area of rectangle="+z);
}
}