#include<stdio.h>
void main()
{
 int a[20],small=0,i,size,lar=0;
 printf(" enter the size of array a :: ");
 scanf("%d",&size); 
 if(size>20)
 printf("invalid size");
 else
 {
  printf("enter the array elements  :: ");
  for(i=0;i<size;i++)
  {
   scanf("%d",&a[i]);
  }
  for(i=0;i<size;i++)
   {
    if(a[i]>a[i-1])
    {
     lar=a[i];
    }
    if(a[i]<a[i-1])
    {
     small=a[i];
    }
 
 }printf("\n LARGEST is %d ",lar);
 printf("\n SMALLEST is %d",small);
}
}
