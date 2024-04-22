import java.util.Scanner;
class employee{
	int empid;
	String name;
	int salary;
	String addr;
	employee(int empid,String name,int salary,String addr){
	this.empid=empid;
	this.name=name;
	this.salary=salary;
	this.addr=addr;
	}
}
class Teacher extends employee{
 String deptname;
 String sub;
 Teacher(int empid,String name,int salary,String addr,String deptname,String sub){
 super(empid,name,salary,addr);
 this.deptname=deptname;
 this.sub=sub;
 }
 void dis(){
  System.out.println("Emp Id - "+empid);
  System.out.println("Name :: "+name);
  System.out.println("Salary : "+salary);
  System.out.println("address :: "+addr);
  System.out.println("Department :: "+deptname);
  System.out.println("Subject ::"+sub);
  
 }
}

class pro11{
public static void main(String AA[]){
  int i,n,t1,t3;
  String t2,t4,t5,t6;
  Scanner ip=new Scanner(System.in);
  Teacher teacher[]=new Teacher[20];
  System.out.println("enter the number of teachers :: ");
  n=ip.nextInt();
  for(i=0;i<n;i++)
  {
   System.out.println("enter the details of teacher "+(i+1));
   
   System.out.print("emp Id :: ");
   t1=ip.nextInt();
   System.out.print("Name :: ");
   t2=ip.next();
   System.out.print("Salary - ");
   t3=ip.nextInt();
   System.out.print("Address - ");
   t4=ip.next();
   System.out.print("Department Name - ");
   t5=ip.next();
   System.out.print("Subject - ");
   t6=ip.next();
   teacher[i]=new Teacher(t1,t2,t3,t4,t5,t6);
  }
  System.out.println("\n");
  for(i=0;i<n;i++){
   System.out.println("details :: "+(i+1));
   teacher[i].dis();
  }
 }
}
