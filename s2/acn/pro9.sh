

fact() {
   num=$1
   facto=1
   for ((i=1;i<=num;i++)); do
        facto=$((facto*i))
   done
   echo "factorial of $num is $facto "     
}
echo "enter the num ::"
read n
fact $n

