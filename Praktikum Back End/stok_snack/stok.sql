-- =============================================
-- DATABASE: Manajemen Stok Bahan Baku Snack
-- =============================================

CREATE DATABASE IF NOT EXISTS stok_snack;
USE stok_snack;

-- Tabel 1: kategori_bahan
CREATE TABLE IF NOT EXISTS kategori_bahan (
    id_kategori INT AUTO_INCREMENT PRIMARY KEY,
    nama_kategori VARCHAR(100) NOT NULL,
    keterangan TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Tabel 2: bahan_baku (berelasi ke kategori_bahan)
CREATE TABLE IF NOT EXISTS bahan_baku (
    id_bahan INT AUTO_INCREMENT PRIMARY KEY,
    id_kategori INT NOT NULL,
    nama_bahan VARCHAR(150) NOT NULL,
    satuan VARCHAR(20) NOT NULL,
    stok_saat_ini DECIMAL(10,2) DEFAULT 0,
    stok_minimum DECIMAL(10,2) DEFAULT 0,
    tanggal_update DATE,
    keterangan TEXT,
    FOREIGN KEY (id_kategori) REFERENCES kategori_bahan(id_kategori) ON DELETE CASCADE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Data contoh kategori
INSERT INTO kategori_bahan (nama_kategori, keterangan) VALUES
('Tepung & Pati', 'Bahan dasar adonan seperti tepung terigu, tepung tapioka'),
('Minyak & Lemak', 'Minyak goreng dan margarin untuk penggorengan'),
('Bumbu & Rempah', 'Garam, gula, penyedap, dan rempah-rempah'),
('Kemasan', 'Plastik, stiker, dan bahan kemasan lainnya');

-- Data contoh bahan baku
INSERT INTO bahan_baku (id_kategori, nama_bahan, satuan, stok_saat_ini, stok_minimum, tanggal_update, keterangan) VALUES
(1, 'Tepung Terigu', 'kg', 25.00, 10.00, CURDATE(), 'Merk Segitiga Biru'),
(1, 'Tepung Tapioka', 'kg', 15.50, 5.00, CURDATE(), 'Untuk kerupuk'),
(2, 'Minyak Goreng', 'liter', 20.00, 8.00, CURDATE(), 'Merk Bimoli'),
(2, 'Margarin', 'kg', 5.00, 2.00, CURDATE(), 'Merk Blueband'),
(3, 'Garam', 'kg', 3.00, 1.00, CURDATE(), NULL),
(3, 'Gula Pasir', 'kg', 8.00, 3.00, CURDATE(), NULL),
(3, 'Bumbu Tabur Balado', 'kg', 2.50, 1.00, CURDATE(), 'Siap pakai'),
(4, 'Plastik Kemasan', 'pcs', 500.00, 100.00, CURDATE(), 'Ukuran 15x20 cm'),
(4, 'Stiker Label', 'lembar', 300.00, 50.00, CURDATE(), 'Sudah dicetak');
