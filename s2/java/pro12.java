import java.util.Scanner;
class person{
 String name;
 String gender;
 String addr;
 int age;
 person(String name,String gender,String addr,int age){
 this.name=name;
 this.gender=gender;
 this.addr=addr;
 this.age=age;
 }
}
class emp extends person{ 
 int empid;
 String com_name;
 String qual;
 int salary;
 emp(String name,String gender,String addr,int age,int empid,String com_name,String qual,int salary){
 super(name,gender,addr,age);
 this.empid=empid;
 this.com_name=com_name;
 this.qual=qual;
 this.salary=salary;
 
 }
 
}
class teacher extends emp{
String sub;
String dept;
int t_id;
teacher(String name,String gender,String addr,int age,int empid,String com_name,String qual,int salary,String sub,String dept,int t_id){
   super(name,gender,addr,age,empid,com_name,qual,salary);
   this.sub=sub;
   this.dept=dept;
   this.t_id=t_id;	
}
void dis(){
	System.out.println("name : "+name);
	System.out.println("Gender : "+gender);
	System.out.println("Address : "+addr);
	System.out.println("age  : "+age);
	System.out.println("employee id : "+empid);
	System.out.println("Company name : "+com_name);
	System.out.println("Qualification : "+qual);
	System.out.println("Salary : "+salary);
	System.out.println("Subject : "+sub);
	System.out.println("Department : "+dept);
	System.out.println("Teacher Id : "+t_id);
}

}
 
 class pro12{
  public static void main(String aa[]){
   int i,n,d4,d5,d8,d11;
   String d1,d2,d3,d6,d7,d9,d10;
   Scanner in = new Scanner(System.in);
   teacher T[]=new teacher[20];
   System.out.println("enter the number of teachers :: ");
   n=in.nextInt();
   for(i=0;i<n;i++){
    System.out.println("enter the details of teacher "+(i+1));
    System.out.print("Name : ");
    d1=in.next();
    System.out.print("Gender : ");
    d2=in.next();
    System.out.print("Adress : ");
    d3=in.next();
    System.out.print("age : ");
    d4=in.nextInt();
    System.out.print("Employee id : ");
    d5=in.nextInt();
    System.out.print("Company name : ");
    d6=in.next();
    System.out.print("Qualification : ");
    d7=in.next();
    System.out.print("Salary : ");
    d8=in.nextInt();
    System.out.print("Subject :");
    d9=in.next();
    System.out.print("Department : ");
    d10=in.next();
    System.out.print("Techer Id : ");
    d11=in.nextInt();
    T[i]=new teacher(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11);
   }
   System.out.print("\n");
   for(i=0;i<n;i++){
    System.out.println("the DETAILS :");
    T[i].dis();
   }
  }
 }























