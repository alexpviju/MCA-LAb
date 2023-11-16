#include <stdio.h>
 
 int u[10],a[10],b[10],n;
 
 void display(int x[])
 {
  int i;
  printf("{");
  for(i=0;i<n;i++)
   printf("%d \t",x[i]);
  printf("}");
 }
 
 void bitdis(int x[])
 {
  int i;
  printf("{");
  for(i=0;i<n;i++)
   { if(x[i]==1)
      printf("%d \t,",u[i]);
    }
     printf("}");
 }
 
 
 int pos(int x)
 {
  int i,f=1;
  for(i=0;i<n;i++)
  { if(u[i]==x)
    f=i;
 } 
 return f;
 }
 
 void setunion()
 {
  int i;
  printf("\n Unoion : {");
  for(i=0;i<n;i++)
   {
    if(a[i]|b[i]==1)
    printf("%d \t",u[i]);
   }
   printf("}");
 }
 void intersect()
 {
  int i;
  printf("\n Intersection : {");
  for(i=0;i<n;i++)
  {
   if(a[i]&b[i]==1)
    printf("%d \t",u[i]);
  }
  printf("}");
 }
 void setdif()
 {
  int i;
  printf("\n Difference :{");
  for(i=0;i<n;i++)
  {
   if(a[i]&(!b[i])==1)
    printf("%d \t",u[i]);
  }
  printf("}\n");
 }
 
 
 void main()
 {
  int i,p,x;
  printf("Enter size of universal set : ");
  
  scanf("%d",&n);
  printf(" Enter elements : ");
  for(i=0;i<n;i++)
  {
   scanf("%d",&u[i]);
   a[i]=b[i]=0;
   
  }
  printf("\n Enter the size of set 1 :");
  scanf("%d",&p);
  printf("\n Enter elements :");
  for(i=0;i<p;i++)
  {
   scanf("%d",&x);
   if(pos(x)!=-1)
    a[pos(x)]=1;
    
  }
  printf("\n enter size of set 2 : ");
  scanf("%d",&p);
  printf("\n Enter the elements ");
  for(i=0;i<p;i++)
  {
   scanf("%d",&x);
   if(pos(x)!=-1)
    b[pos(x)]=1;
  }
  printf("\n UNiversal set :");
  display(u);
  printf("\n Set 1 bit string :");
  display(a);
  printf("\nSet 2 bit string");
  display(b);
  printf("\nSet 1:");
  bitdis(a);
  printf("\nSet 2: ");
  bitdis(b);
  setunion();
  intersect();
  setdif();
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
