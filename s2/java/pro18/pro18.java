package Arithmetic;

interface operations{
 float addition();
 float substraction();
 float multiplication();
 float division();
}
public class pro18 implements operations{
 public float a,b;
 public pro18(float a,float b){
  this.a=a;
  this.b=b;
 } 
 public float addition(){
 	return a+b;
 	
 }
 public float substraction(){
 	return a-b;
 	
 }
 public float multiplication(){
 	return a*b; 	
 }
 public float division(){
 	return a/b;
 }
 }

