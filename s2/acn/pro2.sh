#!/bin/bash

echo "pls enter the num a ::"
read a
echo "pls enter the num b ::"
read b
echo "pls enter the num c::"
read c
echo "pls enter the num d::"
read d
s=$(($a+$b+$c+$d))
p=$(($a*$b*$c*$d))
h=$((($a+$b+$c+$d)/2))
echo "Sum " $s
echo "Product " $p
echo "Average " $h
