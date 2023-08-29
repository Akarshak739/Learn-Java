//WAP to understand concept of interface.
interface it
{
void m1();//public abstract void m1();
void m2();//public abstract void m1();
} 
class TestInterface implements it
{
public void m1()
{
System.out.println("This message from m1() method");
}
public void m2()
{
System.out.println("This message from m2() method");
}
}
class InterfaceDemo1
{
public static void main(String [] args)
{
TestInterface ti=new TestInterface();
ti.m1();
ti.m2();
}
}