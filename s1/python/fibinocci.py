def generate_fibinocci(n):
 fibinocci_series=[]
 a,b=0,1
 for _ in range(n):
  fibinocci_series.append(a)
  a,b=b,a+b
 return fibinocci_series
n=int(input("Enter the Numbers of terms for Fibinocci Series :"))
fibinocci_series=generate_fibinocci(n)
print("Fibinocci series of ",n,"terms",fibinocci_series) 
