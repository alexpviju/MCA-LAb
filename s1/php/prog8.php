<!DOCTYPE html>
<html lang="lang">
<head>
 <meta charset="UTF-8">
 <meta name="viewport" content="width=drevice-width,initial-scale=1.0">
 <title>Database Data</title>
 <style>
  table
  {
   width:50%;
   border-collapse:collapse;
   margin:20px 0;
  }
  
  table,th,td
  {
   border:1px solid black;
  }  
  
  th,td{
   padding:10px;
   text-align:left;
  }
  </style>
 </head>
 <body>
 
 <?php
 $servername="localhost";
 $username="root";
 $password="";
 $database="alex";
 
 $conn=new mysqli($servername,$username,$password,$database);
 
 if($conn->connect_error)
 {
  die("Connection failed: ".$conn->connect_error);
 }
 
 $sql="SELECT *FROM datasource";
 $result=$conn->query($sql);
 
 if($result->num_rows>0)
 {
  echo "<table><tr><th>ID</th><th>NAME</th><th>Email</th></tr>";
  while($row=$result->fetch_assoc())
  {
   echo"<tr><td>".$row["id"]."</td><td>".$row["name"]."</td><td>".$row["email"]."</td></tr>";
  } 
  echo"</table>";
 }else{
 echo"0 results found";
 }
 $conn->close();
 ?>
</body>
</html>

















 
 
 
 
 
 
 
 
 
 
 
