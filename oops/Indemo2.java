//WAP to demostrate concept of Heirarchical Inheritance
import java.util.*;
class Shape
{
int side;
public void setValue(int s)
{
side=s;
}
}
class Square extends Shape
{
public int area()
{
return side*side;
}
}
class Cube extends Shape
{
public int volume()
{
return side*side*side;
}
}
class Indemo2
{
public static void main(String [] args)
{
int x,a,v;
Scanner s=new Scanner(System.in);
Square sq=new Square();
System.out.println("Enter side of square:");
x=s.nextInt();
sq.setValue(x);
a=sq.area();
System.out.println("area of square="+a);
Cube cu=new Cube();
System.out.println("Enter side of square:");
x=s.nextInt();
cu.setValue(x);
v=cu.volume();
System.out.println("volume of cube="+v);
}
}