import Arithmetic.pro18;
import java.util.Scanner;

class apackages{
 public static void main(String A[]){
  Scanner in =new Scanner(System.in);
  System.out.println(" first num ::");
  float a = in.nextFloat();
  System.out.print("Enter the Second Number : ");
  float b = in.nextFloat();
  pro18 op=new pro18(a,b);
  System.out.println(a+"+"+b+"="+(op.addition()));
  System.out.println(a+"-"+b+"="+(op.substraction()));              
  System.out.println(a+"x"+b+"="+(op.multiplication()));
  System.out.println(a+"/"+b+"="+(op.division()));
 }
} 
 
