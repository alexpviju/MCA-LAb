<?php
if($_SERVER["REQUEST_METHOD"]=="POST")
{
 $name=$_POST["name"];
 $email=$_POST["email"];
 $password=$_POST["password"];
 $confirmPassword=$_POST["confirm_password"];
 if($password!==$confirmPassword)
   {
    echo"Passwords do not match. please try again";
    
   }else{
   if(strlen($password)<6)
   {
    echo "password must be atleast 6 charecters long";
   }else
   {
   echo"Registration successful!.Welcome,".$name."!";
   }
   }
}
?>
