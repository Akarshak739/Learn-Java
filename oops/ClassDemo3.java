/*WAP to find area and perimeter of rectangle by creating two methods*/
import java.util.*;
class ClassDemo3
{
public static int area(int x,int y) 
{
return(x*y);
}
public static int perimeter(int x,int y)
{
return(2*x*y);
}
public static void main(String[] args)
{
int l,b,a,p;
Scanner s=new Scanner(System.in);
System.out.println("Enter two number");
l=s.nextInt();
b=s.nextInt();
a=area(l,b);
p=perimeter(l,b);
System.out.println("perimeter="+p);
System.out.println("area="+a);
}
}



