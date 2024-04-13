mul() {
 num=$1
 res=0
 for((i=1;i<=10;i++))
 do 
   res=$((res+num))
   echo "$i * $num = $res"   
 done
}

echo "enter the number :"
read a
mul $a
