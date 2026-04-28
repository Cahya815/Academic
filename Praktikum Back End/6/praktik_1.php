<?php 
   if($_GET["nama"] || $_GET["usia"]) 
   { 
      echo "Selamat datang". $_GET['nama']. "<br>"; 
      echo "Anda".$_GET['usia']."Tahun"; 
      exit(); 
   } 
?> 
<html> 
<body> 
   <form action = "<?php $_PHP_SELF?>" method = "GET"> 
   Nama: <input type = "text" name = "nama" > 
   Umur: <input type = "text" name = "usia" > 
   <input type = "submit" > 
   </form> 
</body> 
</html>