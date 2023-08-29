//First meeting
interface School
{
void registration();
void feeSubmission();
void batchAllotment();
}
//Second meeting
abstract class Test1 implements School
{
public void registration()
{
System.out.println("Business logic of registration");
}
}
//Third meeting
abstract class Test2 extends Test1
{
public void feeSubmission()
{
System.out.println("Business logic of fee submission");
}
}
class Test3 extends Test2
{
public void batchAllotment()
{
System.out.println("Business logic of batch allotment");
}
}
//testing
class InterfaceDemo2
{
public static void main(String [] args)
{
Test t=new Test3();
t.registration();
t.feeSubmission();
t.batchAllotment();
}
}
//Finally complete payment 


