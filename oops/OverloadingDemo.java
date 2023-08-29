//WAP to understand concept of method overloading
import java.util.*;
class Figure
{
public int area(int s)//Area of square
{
return(s*s);
}
public int area(int l,int b)//Area of rectangle
{
return(l*b);
}
public double area(float r)//Area of circle
{
return(3.14*r*r);
}
}
class OverloadingDemo
{ 
public static void main (String [] args)
{
int x,l,b,a1,a2;
float r
double a3
Figure fig=new Figure()
Scanner s=new Scanner(System.in)
System.out.println("Enter side of square:")
x=s.nextInt()
System.out.println("Enter length and breadth of rectangle")
l=s.nextInt()
b=s.nextInt()
System.out.println("enter radius of circle")
r=s.nextFloat()
a1=fig.area(x)
a2=fig.area(l,b)
a3=fig.area(r)
System.out.println("the area of square="+a1) 
System.out.println("the area of square="+a2) 
System.out.println("the area of square="+a3)
}
} 