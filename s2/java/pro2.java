import java.util.Scanner;
class pro2{
 
 public static void main(String arg[]){
  int i,j;
  Scanner in=new Scanner(System.in); 
  System.out.println("Enter the row and coloum of the matrix");
  int r=in.nextInt();
  int c=in.nextInt();
  int first[][]=new int[10][10];
  int second[][]=new int[10][10];
  int sum[][]=new int[20][20];
  System.out.println("enter the values for the matrix 1::");
  for(i=0 ; i<r;i++){
   for(j=0 ; j<c ; j++){
    first[i][j]=in.nextInt();
   }
  }
  System.out.println("enter the second matrix");
  for(i=0;i<r;i++){
   for(j=0;j<c;j++){
    second[i][j]=in.nextInt();
   }  
  }
  System.out.println("the sum is :: ");
  for(i=0;i<r;i++){
   for(j=0;j<c;j++)
   {
    sum[i][j]=first[i][j]+second[i][j];
   }
  }
  for(i=0;i<r;i++){
   for(j=0;j<c;j++)
   {
    System.out.print(sum[i][j]+"\t");
    
   }
   System.out.print("\n");
 }
 
}}
