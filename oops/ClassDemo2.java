class Employee
{
int empid;//Instance variable
String empname;//Instance variable
double salary;//Instance variable
public void setEmployee(int eid,String ename,double sal)
{
empid=eid;
empname=ename;
salary=sal;
}
public void display()
{
System.out.println("Employee id="+empid);
System.out.println("Employee Name="+empname);
System.out.println("Employee Salary="+salary);
}
}
class ClassDemo2{
public static void main(String[]args)
{
Employee e1=new Employee();
e1.display();


}}