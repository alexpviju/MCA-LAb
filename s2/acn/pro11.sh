#!/bin/bash
add() {
 num1=$2
 sum1=$((num+num1))
 echo "$sum1"
}
sub() {
 num2=$1
 num3=$2
 sub1=$((num2-num3))
 echo "$sub1"
}
mult() {
 num4=$1
 num5=$2
 mul=$((num4*num5))
 echo "$mul"
}
div() {
 num6=$1
 num7=$2
 div1=$(echo "scale=2; $num6/$num7" | bc)
 echo "$div1" 
}
echo "enter the number 1 :"
read a
echo "enter the number 2 :"
read b

echo "$a + $b =" 
add $a $b
echo "$a - $b =" 
sub $a $b
echo "$a * $b =" 
mult $a $b
echo "$a / $b =" 
div $a $b 
