num=int(input("Enter the number of rows :: "))
for i in range(1,num+1):
    numofstars=min(i,num-i+1)
    for j in range(numofstars):
        print("*",end=" ")
    print()