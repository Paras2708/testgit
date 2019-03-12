
import java.util.Scanner;
class employee3
{
public static void main (String args[])
{
employeeinfo ob = new employeeinfo();
ob.get();
ob.totalsalary();
ob.display();

}
}

class employeeinfo
{
Scanner in = new Scanner (System.in);
Scanner in = new Scanner (System.in);
String name,code,department,city;
int code,name,city,department,salary,ma,hr,bn;

void get()
{
System.out.print (" Enter employee ID = ");
code = in.nextInt();
System.out.print (" Enter emplyee name = ");
name = ins.nextLine();
System.out.print (" Enter employee city = ");
city = ins.nextLine();
System.out.print (" Enter employee salary = ");
salary = in.nextInt();
System.out.print ("Enter employee department = ");
department = ins.nextLine();
}

void totalsalary()
{
System.out.print (" Enter medical allowance = ");
ma = in.nextInt();
System.out.print (" Enter house rent = ");
hr = in.nextInt();
System.out.print (" Enter bounus = ");
bn = in.nextInt();
}
}

void display()
{
System.out.println (" Employee ID = "+code);
System.out.println (" Employee name = "+name);
System.out.println (" Employee city = "+city);
System.out.println (" Employee basic salary = "+salary);
System.out.println (" Employee position/post = "+department);
System.out.println (" Total salary = "+(ma+hr+bn+salary));
}
