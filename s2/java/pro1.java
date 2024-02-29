class rec{
 String pcode;
 String pname;
 double price;
 
 rec(String c,String n,double r){
  pcode=c;
  pname=n;
  price=r;
 }

  
 }
class pro1{
public static void main(String a[]){
  rec p1=new rec ("111","camera",12000);
  rec p2=new rec ("113","powder",120);
  rec p3=new rec ("114","flag",10);
   if(p1.price<p2.price&&p1.price<p3.price)System.out.println(p1.pname+" has the lowest price");
   else if(p2.price<p1.price&&p2.price<p3.price)System.out.println(p2.pname+ " has the lowest price");
   else System.out.println(p3.pname+" has the lowest price");    
 }
}
