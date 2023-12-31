str="ente keralam"
print("Given string :: ",str)
ch=str[0]
str=str.replace(ch,"&")
str=ch+str[1:]
print("Modified ::  ",str)