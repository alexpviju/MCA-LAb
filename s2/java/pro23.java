import java.util.Scanner;

class Stack{
	public void operation(){
		int top=-1,n,ch,e;
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the size of stack");
		n=in.nextInt();
		int size=n-1;
		int a[]=new int[n];
		do{
			System.out.println("\n1.push \n2.pop\n3.display\n4.Exit");
			System.out.println("Your choice pls");
			ch=in.nextInt();
			switch(ch){
				case 1:
					if(top==size){
						System.out.println("it is full");
					}
					else{
						System.out.println("enter the number");
						e=in.nextInt();
						top++;
						a[top]=e;
					}
					break;
				case 2:
					if(top==-1){
						System.out.println("EMPTY!!");
					}
					else{
						System.out.println("the "+a[top]+" Deleted");
						top--;
					}
					break;
				case 3:
					if(top==-1){
						System.out.println("EMPTY!!");
					}
					else{
					System.out.println("**THE STACK**");
					for(int i=0;i<=top;i++){
						System.out.print("\t"+a[i]);
						}
			  	  	}
			  	  	break;
				case 4:
					System.exit(0);
			  	default:
			  		System.out.println("**#INVALID CHOICE#**");
			}
		}
		while(ch!=4);
		
	}
}
 class pro23{
 	public static void main(String A[]){
 		Stack obj = new Stack();
 		obj.operation();
 	}
 }




















