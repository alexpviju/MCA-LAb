#!/bin/bash
check_odd_even() {
 number=$1
 if [ $((number % 2)) -eq 0 ]; then
        echo "$number is an even ."
 else 
        echo "$number is not even ."
 fi
 }
read -p " Enter a number :: " n
check_odd_even $n

