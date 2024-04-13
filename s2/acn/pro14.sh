echo "enter the file name  :: " 
read filename
if [ -f $filename ]
then
   echo " file exist "
   if [ -r $filename ] && [ -w $filename ]
   then 
      echo " it is readable and writable "
   elif [ -r $filename ]
   then
      echo "it is readable "
   elif [ -w $filename ]
   then 
      echo "writable"
   else 
      echo "file is not readable or writable"
   fi
else 
   echo "file not exist" 
fi
