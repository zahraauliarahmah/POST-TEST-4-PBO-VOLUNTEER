# Manajemen Kegiatan Sosial (Volunteer) 3

![Red and Beige Minimalist Brand Proposal Presentation (1)](https://github.com/user-attachments/assets/9f860c5a-9716-4e6d-8372-8dea1f3f78b2)

Nama : Zahra Aulia Rahmah

NIM : 2409116020

Kelas : A

Post Test 3 Pemograman Berorientasi Objek

# Deskripsi Program 

Program ini adalah Sistem Manajemen Kegiatan Sosial (Volunteer) yang dibuat dengan bahasa Java.
Tujuan program ini untuk membantu mencatat dan mengatur kegiatan sosial atau kegiatan relawan.

Di dalam program, pengguna bisa:

1. Menambahkan kegiatan baru beserta tanggalnya

2. Melihat daftar kegiatan yang sudah ada

3. Mengubah data kegiatan jika ada perubahan

4. Menghapus kegiatan yang tidak diperlukan

5. Mencari kegiatan tertentu berdasarkan nama atau tanggal

6. Mengakhiri program dengan memilih menu keluar

Semua kegiatan disimpan menggunakan ArrayList, dan pilihan menu dikendalikan melalui input dari pengguna. Program akan terus berjalan sampai pengguna memilih keluar.

# Source Package

<img width="309" height="307" alt="image" src="https://github.com/user-attachments/assets/d5611332-72b7-46ed-8c6e-d4961d25f83a" />

Sebelumnya di package Model hanya ada kelas Kegiatan, KegiatanEdukasi, dan KegiatanSosial. Setelah pengembangan ditambahkan kelas InfoKegiatan untuk memisahkan detail informasi kegiatan agar struktur program lebih rapi. Kegiatan tetap menjadi induk dengan atribut dan perilaku umum, sedangkan KegiatanEdukasi dan KegiatanSosial sebagai turunan. Detail tambahan seperti deskripsi, lokasi, dan tanggal kini ditangani khusus oleh InfoKegiatan.


