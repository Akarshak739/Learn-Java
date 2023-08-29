/*WAP to develop a class with name 'students',In Students class take three variables rollno,name and fee.Now create a constructor to Intialize variable and creates a method display() to print name roll no,name,fee.Now test class student.*/
import java.util.*;
class Student
{
String name;
double fee;
int rollno;

public void setStudent(String n,double f,int r)
{
name=n;
fee=f;
rollno=r;
}
public void display()
{

System.out.println("name="+name);
System.out.println("fee="+fee);
System.out.println("rollno="+rollno);
}
}
class Overlapping2
{
public static void main(String [] args)
{
Student s=new Student();
s.setStudent( "akarsh", 5000, 5);
s.display();

Student s1=new Student();
s1.setStudent( "ayush",6000,7);
s1.display();
}
}