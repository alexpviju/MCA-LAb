word=input("enter the Word ::  ")
count={}
for i in word:
    if i in count:
        count[i]=count[i]+1
    else:
        count[i]=1
print ("count of letters in sting ::  \n",str(count))