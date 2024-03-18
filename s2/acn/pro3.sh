#!/bin/bash
echo "pls enter the num ::"
read a
f=1
for((i=2;i<$a;++i))
do 
 if [ $((a%i)) -eq 0 ]; then
   f=0
   break
 fi
done
if [ $f=1 ]; then
  echo "it is a PRIME"
else
  echo "it is NOT prime"
fi

