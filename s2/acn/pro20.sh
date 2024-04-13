read -p "Enter the number ::" a
read -p "enter digit to count ::" b
num=$a
occ=0
while [ $num != 0 ]
do 
   digit=$(($num%10))
   if [ $digit == $b ]
   then 
      occ=$(($occ+1))
   fi
   num=$(($num/10))
done
echo "Occurance :$occ"

