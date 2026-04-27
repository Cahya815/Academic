<html>
<body>
<?php
$tanda = [
    "mohammad" => ["fisika" => 35, "matematika" => 30, "chemistry" => 39],
    "qadir"    => ["fisika" => 30, "matematika" => 32, "chemistry" => 29],
    "zara"     => ["fisika" => 31, "matematika" => 22, "chemistry" => 39]
];
?>
<table border="1" cellpadding="8" cellspacing="0">
    <tr>
        <th>Nama</th>
        <th>Fisika</th>
        <th>Matematika</th>
        <th>Chemistry</th>
    </tr>
    <?php foreach ($tanda as $nama => $nilai): ?>
    <tr>
        <td><?= $nama ?></td>
        <td><?= $nilai['fisika'] ?></td>
        <td><?= $nilai['matematika'] ?></td>
        <td><?= $nilai['chemistry'] ?></td>
    </tr>
    <?php endforeach; ?>
</table>
</body>
</html>
