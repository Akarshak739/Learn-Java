import java.io.*;
class ExDemo1
{
public static void main(String [] args)throws IOException
{
int empid;
String empname;
double  salary;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter employee id:");
empid=Integer.parseInt(br.readLine());
System.out.print("Enter employee Name:");
empname=br.readLine();
System.out.print("Enter employee salary:");
salary=Double.parseDouble(br.readLine());
System.out.println("Employee's details");
System.out.println("Employee ID="+empid);
System.out.println("Employee name="+empname);
System.out.println("Employee salary="+salary);
}
}

 

 
 