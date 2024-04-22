import java.util.Scanner;
class publisher {
 String pname;
 int pid;
 publisher(String pname,int pid){
 this.pname=pname;
 this.pid=pid;
 }
}
class book extends publisher{
 int bprice;
 String bauth;
 String bname;
 book(String pname,int pid,int bprice,String bauth,String bname){
 super(pname,pid);
 this.bprice=bprice;
 this.bauth=bauth;
 this.bname=bname;
 }
}

class liter extends book{
 liter(String pname,int pid,int bprice,String bauth,String bname){
  super(pname,pid,bprice,bauth,bname);
 }
 void dis(){
  System.out.println("Publisher name : "+pname);
  System.out.println("publisher ID : "+pid);
  System.out.println("Book Price : "+bprice);
  System.out.println("Auther : "+bauth);
  System.out.println("Book Name : "+bname);
 }
}
class fiction extends book{
 fiction(String pname,int pid,int bprice,String bauth,String bname){
  super(pname,pid,bprice,bauth,bname);
  }
  void dis(){
  System.out.println("Publisher name : "+pname);
  System.out.println("publisher ID : "+pid);
  System.out.println("Book Price : "+bprice);
  System.out.println("Auther : "+bauth);
  System.out.println("Book Name : "+bname);
 }
}
class pro13{
  static int c,b;
  static String a,e,d;
  static Scanner in=new Scanner(System.in);
  static void read(){
  System.out.println("Publisher name : ");
  a=in.next();
  System.out.println("publisher ID : ");
  b=in.nextInt();
  System.out.println("Book Price : ");
  c=in.nextInt();
  System.out.println("Auther : ");
  d=in.next();
  System.out.println("Book Name : ");
  e=in.next();
  }
  public static void main(String aa[]){
   int  i,ll,n;
   liter L[]=new liter[20];
   fiction F[]=new fiction[20];
   System.out.println("no. of literature");
   ll=in.nextInt();
   for(i=0;i<ll;i++){
    System.out.println("enter the details of lit. "+(i+1));
    read();
    L[i]=new liter(a,b,c,d,e);
    
   }
   System.out.println("no. of fiction :: ");
   n=in.nextInt();
   for(i=0;i<n;i++)
   {
    System.out.println("enter the details of fic "+(i+1));
    read();
    F[i]=new fiction(a,b,c,d,e);
   }
    System.out.println("  * Details *  ");
   for(i=0;i<ll;i++)
    {
      System.out.println(" BOOK "+(i+1));
      L[i].dis();
    }
   System.out.println("  * Details *  ");
   for(i=0;i<n;i++)
    {
      System.out.println(" BOOK "+(i+1));
      F[i].dis();
    }
   
   
  }
}




























