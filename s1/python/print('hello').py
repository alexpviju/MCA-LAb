def sumofsquare(x):
    s=0
    for i in range(x+1):
        s=s+(i**2)
    return s
x= int(input ("enter the number :: "))
print("the sum is ".format(x),sumofsquare(x))