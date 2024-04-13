mul() {
 w0=$1
 w1=$2
 w3=$3
 avr=$(((w0+w1+w3)/3))
 
 if [ $avr -le 50  ] && [ $avr -ge 40 ]; then 
   echo "grade is A"
 elif [ $avr -lt 40 ] && [ $avr -ge 30 ]; then 
   echo "grade is B"
 elif [ $avr -lt 30 ] && [ $avr -ge 20 ]; then
   echo "grade is C"
 elif [ $avr -lt 20 ] && [ $avr -ge 10 ]; then  
   echo "grade is D"
 else 
   echo "FAILED"
 fi
}
echo " marks in sub-1"
read a
echo " marks in sub-2"
read b
echo " marks in sub-3"
read c

mul $a $b $c
