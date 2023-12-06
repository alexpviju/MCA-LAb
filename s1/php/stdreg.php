<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial_scale=1.0">
<title>Student Registration</title>
</head>
<body>
<h2>Student Registration</h2>
<form method="POST">
  Name:<input type="text" name="name" required><br><br>
  class:<input type="text" name="class" required><br><br>
  subject:<input type="text" name="subject" required><br><br>
  marks:<input type="number" name="marks_in_percentage" required><br><br>
  <input type="submit" value="Register">
</form>

<?php
if ($_POST) {
  $name = $_POST["name"];
  $class = $_POST["class"];
  $subject = $_POST["subject"];
  $marks = $_POST["marks_in_percentage"];

  $servername = "localhost";
  $username = "root";
  $password = "";
  $database = "alex";

  $conn = mysqli_connect($servername, $username, $password, $database);

  if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
  }

  $sql = "INSERT INTO `stdi` (`name`, `class`, `subject`, `marksinpercentage`) VALUES ('$name', '$class', '$subject', '$marks')";

  $rs = mysqli_query($conn, $sql);
  if ($rs) {
    echo "record Inserted";
  }
}
?>
</body>
</html>

                                                                     
