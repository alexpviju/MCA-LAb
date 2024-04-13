mul() {
   num=$1
   if [ $num -ge 1000000 ] && [ $num -le 9999999 ]; then
     a=$((num%10))
     b=$((num/10%10))
     c=$((num/100%10))
     d=$((num/1000%10))
     e=$((num/10000%10))
     f=$((num/100000%10))
     g=$((num/1000000%10))
     echo "alternatives are -  $g,$e,$c,$a"
   else
     echo "Please enter a 7 digit number !!"
   fi
}

echo "Enter a 7 digit number:"
read s1
mul $s1

