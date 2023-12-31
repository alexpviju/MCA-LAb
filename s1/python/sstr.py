str1=input("enter a string1 :: ")
str2=input("enter a string2 :: ")
if len(str1)>=1 and len(str2)>=1:
    newstr1=str2[0]+str1[1:]
    newstr2=str1[0]+str2[1:]
    rsult=newstr1+"\n"+newstr2
print ("result is ::  ",rsult)