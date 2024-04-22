import java.util.Scanner;
	class std{
	 int r_no;
	 String name;
	 String cours;
	 float marks;
	 std(int r_no,String name,String cours,float marks){
	 	this.r_no=r_no;
	 	this.name=name;
	 	this.cours=cours;
	 	this.marks=marks;
	 }
	}
	
	class sports extends std{
	 float s_marks;
	 sports(int r_no,String name,String cours,float marks,float s_marks){
	  super(r_no,name,cours,marks);
	  this.s_marks=s_marks;
	 }
	}
	
	class result extends sports{
	 result(int r_no,String name,String cours,float marks,float s_marks){
	  super(r_no,name,cours,marks,s_marks);
	 }
	 void dis(){
	  System.out.println("Name -:"+name);
	  System.out.println("Roll No -:"+r_no);
	  System.out.println("Marks -:"+marks);
	  System.out.println("Course-:"+cours);
	  System.out.println("Sports Scores-:"+s_marks);
	  
	 }
	}
	
class pro14{
 public static void main(String AA[]){
  int b;
  float c,e;
  String a,d;
  Scanner ip=new Scanner(System.in);
  System.out.println("* ENTER THE DETAILS *");
  System.out.println("name --");
  a=ip.next();
  System.out.println("Roll no --");
  b=ip.nextInt();
  System.out.println("marks in academic --");
  c=ip.nextFloat();
  System.out.println("course --");
  d=ip.next();
  System.out.println("Sportes score --");
  e=ip.nextFloat();
  result data=new result(b,a,d,c,e);
  System.out.println("The data is --");
  data.dis();
 }
} 





















