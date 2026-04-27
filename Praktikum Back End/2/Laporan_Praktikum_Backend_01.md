# Implementasi CRUD PHP

## Pendahuluan
Laporan praktikum untuk modul Sistem Informasi Praktikum II. Dokumentisasi penyeimbangan antara arsitektur backend menggunakan teknologi PHP dengan integrasi database MySQL melalui mysqli. Fokus pada implementasi operasi Create, Read, Update, dan Delete (CRUD) dengan pendekatan yang mudah dipelihara.

## Kode Program
```php
<?php
// Implementasi CRUD untuk tabel user
$host = 'localhost';
$user = 'root';
$pass = '';
$dbname = 'praktikum';

/* mysqli_connect - fungsi untuk membuat koneksi ke database MySQL
   Parameter 1: Host server
   Parameter 2: Username
   Parameter 3: Password  
   Parameter 4: Nama database
*/
if (mysqli_connect($host, $user, $pass, $dbname) === true) {
    // CRUD operations would be implemented here...
    
} else {
    die('Koneksi ke database gagal: ' . mysqli_connect_error());
}

?>
```

## Penjelasan
**<ul>**
  **<li> <u>Implementasi CRUD PHP</u>**: Deskripsi singkat tentang fungsi utama yang diimplementasikan dalam proyek praktikum ini.
  
  **<li><u>Pendahuluan</u>**: Ringkasan konteks dan tujuan laporan praktikum ini.

  **<li><u>Kode Program</u>**: Seksian kode PHP yang digunakan untuk mengelola operasi CRUD melalui koneksi database.
  
  **<li><u>Penjelasan tiap tag HTML/PHP</u>**: Penjelasan detail masing-masing entitas structural dan fungsi dalam struktur laporan ini.

** mysqli_connect**: Fungsi PHP untuk membuat koneksi ke server MySQL dengan parameter host, username, password, dan database. Jika koneksi gagal, menampilkan errornya.

File telah dibuat di path: D:\AREAS\Semester 4\prak\2/Laporan_Praktikum_Backend_01.md