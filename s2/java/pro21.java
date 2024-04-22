
import java.util.Scanner;
class mul extends Thread{
 public void run(){
 	 int i;
 	 for(i=1;i<=10;i++)
 	 {
 	  System.out.println("5*"+i+"="+(5*i));
 	 }
 }
} 
class prim extends Thread{
	int num;
	public prim(int num){
		this.num=num;
	}
	public void run(){
		int x,y,f;
		System.out.println("prime numbers:\n");
		for(x=1;x<=num;x++){
		 if(x==1||x==0)
		  continue;
		  f=1;
		  for(y=2;y<=x/2;y++){
		  	if(x%y==0){
		  	 f=0;
		  	 break;
		  	}
		  }
		  if(f==1){
		  	System.out.println("prime number ::"+x+"");
		  }
		 }
		}
	}

class pro21{
 public static void main(String A[]){
 		int n;
 		Scanner in= new Scanner(System.in);
 		System.out.println("Enter a number :: ");
 		n=in.nextInt();
 		mul obj1=new mul();
 		obj1.start();
 		prim obj2=new prim(n);
 		obj2.start();
 }
} 
