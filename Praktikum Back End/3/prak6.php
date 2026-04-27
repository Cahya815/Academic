<html> 
<body> 
<?php 
$array = array(11, 22, 33, 44, 55); 
foreach ($array as $value) 
{ 
   if ($value == 33) continue; 
   echo "Nilai adalah $value <br>"; 
} 
?> 
</body> 
</html>