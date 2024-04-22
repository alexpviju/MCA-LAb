import java.util.Scanner;
interface Calc{
    public float area();
    public float perimeter();
}
class Rectangle implements Calc{
    float length,breadth;
    Rectangle(float length,float breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    public float area(){
        return length*breadth;
    }
    
    public float perimeter(){
        return 2*(length+breadth);
    }
}
class Circle implements Calc{
    float radius;
    Circle(float radius){
        this.radius = radius;
    }
    
    public float area(){
        return (float)(3.14*radius*radius);
    }
    
    public float perimeter(){
        return (float)(2*3.14*radius);
    }
}
class pro15{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        while(true){
            System.out.println("\n1.Rectangle\n2.Circle\n3.Exit");
            System.out.print("Enter Your Choice : ");
            int ch = scn.nextInt();
            switch(ch){
                case 1: System.out.print("Enter the length : ");
                        float l = scn.nextFloat();
                        System.out.print("Enter the breadth : ");
                        float b = scn.nextFloat();
                        Rectangle rect = new Rectangle(l,b);
                        System.out.println("Area : "+rect.area());
                        System.out.println("Perimeter : "+rect.perimeter());
                        break;
                case 2: System.out.print("Enter the Radius : ");
                        float r = scn.nextFloat();
                        Circle circ = new Circle(r);
                        System.out.println("Area : "+circ.area());
                        System.out.println("Perimeter : "+circ.perimeter());
                        break;
                case 3: System.exit(0);
                        break;
                default:System.out.println("Enter a valid Choice");
                        break;
                
            }
        }
    }
}
