list1=input("Enter the first list  :: ")
list2=input("enter the second list :: ")

list1=[int(x) for x in list1.split(" ")]
list2=[int(x) for x in list2.split(" ")]

if len(list1)==len(list2):
        print("the two list are of the same length ")
else:
        print("the two list are not at the same length")        
sum1=sum(list1)
sum2=sum(list2)
if sum1==sum2:
        print("the two lists sum to the same value")
else:
        print("the two list do not sum to the same value")
set1=set(list1)
set2=set(list2)
intersection=set1&set2
if intersection:
        print("the two list have atleast one value in common")
else:
        print("the two list have no values in common")
        
