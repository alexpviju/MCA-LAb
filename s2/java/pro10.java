import java.util.Scanner;
class pro10{
  static double area(double r){
   return (3.14*r*r);
  }
  static int area(int s){
   return s*s;
  }
  static int area(int l,int b){
   return l*b;
  }
  public static void main(String a[]){
  Scanner in=new Scanner(System.in);
  System.out.println("radius :: ");
  double r=in.nextDouble();
  System.out.println("suare side");
  int s=in.nextInt();
  System.out.println("length and breadth of rect ::");
  int l=in.nextInt();
  int b=in.nextInt();
  System.out.println("area of the circle :: "+area(r));
  System.out.println("area of the square :: "+area(s));
  
  System.out.println("area of the rectangle :: "+area(l,b));
  }
}
