def even(n):
    return all (int(digit)%2==0 for digit in str(n))
def sqroot(n):
    root=int(n**.5)
    return root**2==n
startnum=int(input("ender a four digit number for start num :: "))
endnum=int(input("ender a four digit number for end num  ::   "))
result=[num for num in range(startnum,endnum) if even(num) and sqroot(num)]
print("the list is :: ",result)