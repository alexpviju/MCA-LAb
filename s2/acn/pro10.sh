great() {
 num=$1
 num1=$2
 num2=$3
 if [ $num -gt $num1 ] && [ $num -gt $num2 ]; then
        echo " $num is greater than other."
 elif [ $num1 -gt $num ] && [ $num1 -gt $num2 ] ; then
        echo " $num1 is greater than other."
 else 
        echo " $num2 is greater than other."
 fi
}
read -p "enter the num1 :: " a
read -p "enter the num2 :: " b
read -p "enter the num3 :: " c
great $a $b $c
