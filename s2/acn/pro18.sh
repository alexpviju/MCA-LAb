echo "enter a number"
read n
b=$n
c=$n
s=0
l=0
while [ $c != 0 ]
do
   c=$((c/10))
   l=$((l+1))
done
for((i=1;i<=$l;i++))
do
   num=$((n%10))
   s=$((s + num**l))
   n=$((n/10))
done
if [ $s -eq $b ]
then
   echo " the number is amstrong"
else
   echo " number not amstrong"
fi
