import java.util.Scanner;
class emp{
 int eno;
 String ename;
 int esalary;
 void disp(){
  System.out.println("DETAILS ::");
  System.out.println("employee num :: "+eno);
  System.out.println("employee name :: "+ename);
  System.out.println("employee salary :: "+esalary);
 }
}

class pro9{
public static void main(String arg[]){
  int i,f=0,n,s;
  Scanner in =new Scanner(System.in);
  emp empl[]=new emp[10];
  System.out.print("Enter the num of employee :: ");
  n=in.nextInt();
  for(i=0;i<n;i++)
  {
   empl[i]=new emp();
   System.out.println("Enter the details of employee "+(i+1));
   System.out.println("enter employee no. ::");
   empl[i].eno=in.nextInt();
   System.out.println("enter the name ::");
   empl[i].ename=in.next();
   System.out.println("salary ? ::");
   empl[i].esalary=in.nextInt();
  }
  System.out.println("enter the employee number to get ::");
  s=in.nextInt();
  for(i=0;i<n;i++)
  {
   if(empl[i].eno==s)
   {f=1;
   break;
  }
  }
  if(f==1)
  System.out.println("found");
  else
  System.out.println("not found");
 } 
}

