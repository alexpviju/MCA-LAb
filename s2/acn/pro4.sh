#!/bin/bash
echo "pls enter the year ::"
read a

if [[ $(($a%4)) -eq 0  && $(($a%100)) -ne 0 || $(($a%400)) -eq 0 ]]; then
  echo "it is a leap year"
else
  echo "it is not a leap year"
fi
