package GraphicS;
import java.util.Scanner;


interface shapes{
 float Rectangle();
 float Triangle();
 float Square();
 float Circle();
}

public class pro17 implements shapes{
 static Scanner inp=new Scanner(System.in);
 public float Rectangle(){
  System.out.println("length :: ");
  float l=inp.nextFloat();
  System.out.println("breadth ::");
  float b=inp.nextFloat();
  System.out.println("Area of rectangle ="+(l*b));
  return 0;
 }
 public float Triangle(){
  System.out.println("base :: ");
  float bs=inp.nextFloat();
  System.out.println("Height ::");
  float h=inp.nextFloat();
  System.out.println("area of tringle : "+((.5)*bs*h));
  return 0;
 }
 public float Square(){
  System.out.println("side :: ");
  float s=inp.nextFloat();
  System.out.println("Area of square :: "+(s*s));
  return 0;
 }
 public float Circle(){
  System.out.println("radius ::");
  float r=inp.nextFloat();
  System.out.println("area of circle ::"+(3.14*r*r));
  return 0;
 }
}
