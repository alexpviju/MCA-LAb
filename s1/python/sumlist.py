numbers=input("Enter numbers seperated by comma :: ")
numberlist=list(map(int,numbers.split(",")))
numsum=sum(numberlist)
print("The sum is :: ",numsum)