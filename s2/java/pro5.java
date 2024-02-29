class CPU{
 double price;
 CPU(double p){
  price=p;
 }
 void disp(){
 System.out.println("the price is \t"+price);
 }
 class processor{
 int noc;
 String man;
 processor(int n,String m){
 noc=n;
 man=m;
 }
 void disp(){
 System.out.println("number of cores in processor is\t"+noc);
 System.out.println("manufactured by "+man);
 }
 }
 class RAM{
  int memmory;
  String man;
  RAM(int mm,String ma){
   memmory=mm;
   man=ma;
  }
  void disp(){
  System.out.println("memmory ::"+memmory+"GB");
  System.out.println("manufacture ::"+man);
  }
 }
 
}
class pro5{
 public static void main(String arg[]){
 CPU p1=new CPU(20000);
 CPU.processor pr1= p1. new processor(4,"alex");
 CPU.RAM r1=p1.new RAM(32,"white wolf");
 System.out.println("dtails");
 p1.disp();
 pr1.disp();
 r1.disp();
 
 }






}
