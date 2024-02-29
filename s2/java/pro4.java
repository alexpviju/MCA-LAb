import java.util.Scanner;
class pro4{
 
 public static void main(String arg[]){
  int i,j,f=0;
  Scanner in=new Scanner(System.in); 
  System.out.println("Enter the row and coloum of the matrix");
  int r=in.nextInt();
  
  int first[][]=new int[10][10];
  int second[][]=new int[10][10];
  
  System.out.println("enter the values for the matrix ::");
  for(i=0 ; i<r;i++){
   for(j=0 ; j<r ; j++){
    first[i][j]=in.nextInt();
   }
  }
  for(i=0;i<r;i++){
   for(j=0;j<r;j++)
   {
    System.out.print(first[i][j]+"\t");
    
   }
   System.out.print("\n");
 }
  
  for(i=0;i<r;i++){
   for(j=0;j<r;j++){
    if(first[i][j] != first[j][i])
    { 
     f=1;
     break;
    }
   
   }  
  }
  if(f==1){System.out.println("it is not symetric");}
  else
  {System.out.println("it is  symetric");}
  
 
}}
