//This program demostrate concept of Inheritance.
class Rundog
{
public void bark()
{
System.out.println("sheru.......");
System.out.println("Bhow....bhow...");
}
}
class Bulldog extends Rundog
{
public void growl()
{
System.out.println("Tuffy.....");
System.out.println("Gurr...gurr");
}
}
class InDemo1
{
public static void main(String [] args)
{
Bulldog dog=new Bulldog();
dog.bark();
dog.growl();
}
}
