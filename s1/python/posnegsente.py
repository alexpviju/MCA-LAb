sentence=input("enter the statement :: ")
pos=0
neg=0
strn=sentence.split()
pos_list=['happy','good','excellent','nice','well-done']
neg_list=['bad','wrong','kill','improper']

for string in strn:
        if string in pos_list:
                pos+=1
        elif string in neg_list:
                neg+=1
if pos>neg:
         print("the sentence is positive :",pos)
else:
         print("the sentence is negative :",neg)
