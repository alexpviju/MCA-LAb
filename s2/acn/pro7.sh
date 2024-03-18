#!/bin/bash
sum_of_digits() {
        number=$1
        sum1=0
        while [ $number -gt 0 ]; do
                digit=$((number % 10))
                sum1=$((sum1 + digit))
                number=$((number / 10))
        done
        echo " sum of digit : $sum1 "
}
read -p "enter the number : " input_number
sum_of_digits $input_number
