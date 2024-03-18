#!/bin/bash
echo "enter the string ."
read a
echo $a>b
rev_s="$(rev b)"
echo $rev_s
if [ $a = $rev_s ]
then
        echo "it is palindrome"
else 
        echo "it is not palindrome "
fi        
