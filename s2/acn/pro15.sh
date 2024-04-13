#menu driven

copy() {
   read -p "from file :" from
   read -p "To file :" to
   cp $from $to
}
edit() {
   read -p "file to edit :" edit
   nano $edit 
}
rename() {
   read -p "filename " oldname
   read -p "new name " newname
   mv $oldname $newname
}
delete(){
   read -p " file to delete  " delete
   rm $delete
}

echo "1.copy 
2.edit
3.rename 
4.Delete
5.Exit "

while true; do
   read -p "choice " choice 
   case $choice in
   "1")
      copy
      ;;
    "2")
      edit
      ;;
    "3")
      rename
      ;;
    "4")
      delete
      ;;
     "5") 
      echo "done"
      break
      ;;
   esac
done
     
   
   
