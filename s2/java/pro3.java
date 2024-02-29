import java.util.Scanner;
class pro3{
 public static void main(String arg[]){
  int a,b,c,d,c1,c2;
  Scanner ip= new Scanner(System.in);
  System.out.println("enter the real part and the imaginary part of the first complex number");
  a=ip.nextInt();
  b=ip.nextInt();
   System.out.println("enter the real part and the imaginary part of the second complex number");
  c=ip.nextInt();
  d=ip.nextInt();
  c1=a+c;
  c2=b+d;
  System.out.println("coplex number 1" +a+"+"+b+"i");
  
  System.out.println("coplex number 1" +c+"+"+d+"i"); 
  System.out.println("coplex number after addition " +c1+"+"+c2+"i"); 
 }
}
