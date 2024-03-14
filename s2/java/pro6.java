import java.util.Scanner;
class pro6{
 public static void main(String ar[]){
  int i,j;
  String temp;
  Scanner in=new Scanner(System.in);
  String arr[]=new String[10];
  System.out.println("enter the size  :: ");
  int n=in.nextInt();
  System.out.println("enter the names ::");
  for(i=0;i<n;i++)
  {
   arr[i]=in.next();
  }
  for(i=0;i<n-1;i++){
  for(j=i+1;j<n;j++){
   if((arr[i].compareTo(arr[j])) >0)
   {
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
   }
  }
  }
  System.out.println("\n");
  System.out.println("sorted is ::");
  for(i=0;i<n;i++)
  {System.out.println(arr[i]+"\n");}
 }
}

