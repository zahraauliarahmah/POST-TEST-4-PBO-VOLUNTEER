# Manajemen Kegiatan Sosial (Volunteer) 4

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

# Penjelasan 

1. Abstract Class 

<img width="438" height="155" alt="image" src="https://github.com/user-attachments/assets/aefa7756-5b20-48d5-88b1-01faadf9be45" />

<img width="513" height="94" alt="image" src="https://github.com/user-attachments/assets/07790929-9e49-42a0-a20f-71a52ebb28cd" />

Class Kegiatan dibuat sebagai abstract class sehingga tidak dapat diinstansiasi langsung dan hanya berfungsi sebagai class induk. Atribut nama, tanggal, lokasi, dan penyelenggara tetap bersifat private untuk menjaga enkapsulasi. Dua method getJenisKegiatan() dan getDeskripsiKhusus() dideklarasikan sebagai abstract method, sehingga wajib dioverride oleh subclass seperti KegiatanSosial dan KegiatanEdukasi sesuai jenis kegiatannya.

2. Interface

   <img width="356" height="146" alt="image" src="https://github.com/user-attachments/assets/f77c9959-f88b-429a-9e13-6fab6546495a" />

InfoKegiatan adalah sebuah interface yang berisi method abstrak tampilkanRingkas(). Interface ini menjadi kontrak yang harus diimplementasikan oleh class KegiatanSosial dan KegiatanEdukasi, sehingga masing-masing class wajib membuat versi sendiri dari method tersebut untuk menampilkan informasi singkat sesuai jenis kegiatannya.

3. Implementasi Interface

- Kegiatan Edukasi 

   <img width="1094" height="402" alt="image" src="https://github.com/user-attachments/assets/cbd5a1a9-9294-4333-aa54-d45d11c72d13" />

Implementasi interface pada class KegiatanEdukasi ditunjukkan dengan penggunaan keyword implements InfoKegiatan. Hal ini membuat KegiatanEdukasi wajib menyediakan isi dari method tampilkanRingkas() yang ada di interface. Pada contoh di atas, method tersebut dioverride untuk menampilkan informasi singkat berupa nama dan lokasi kegiatan edukasi dengan format khusus [EDUKASI].

- Kegiatan Sosial

<img width="1135" height="403" alt="image" src="https://github.com/user-attachments/assets/01f3f593-0ea9-4395-8d81-80a03803bef0" />

Class KegiatanSosial menggunakan keyword implements InfoKegiatan, sehingga wajib mengimplementasikan method tampilkanRingkas(). Pada kode di atas, method tersebut dioverride untuk menampilkan informasi singkat kegiatan sosial dengan format [SOSIAL] nama - lokasi. Selain itu, class ini juga mengoverride method getJenisKegiatan() dan getDeskripsiKhusus() dari class abstrak Kegiatan agar sesuai dengan karakteristik kegiatan sosial.

4. Polymorphism 

- Kegiatan 

<img width="1067" height="341" alt="image" src="https://github.com/user-attachments/assets/304c5f9a-748e-4247-a209-ddfb760522b0" />

Pada class Kegiatan, terdapat overloading pada method getInfoKegiatan(). Method ini memiliki dua versi dengan nama sama namun parameter berbeda: tanpa parameter menampilkan informasi singkat (nama dan lokasi), sedangkan dengan parameter boolean lengkap menampilkan detail kegiatan secara penuh.

- Kegiatan Edukasi

<img width="1077" height="295" alt="image" src="https://github.com/user-attachments/assets/061ca684-6475-4667-b5ed-ae645a219e35" />

Pada class KegiatanEdukasi, method getJenisKegiatan() dioverride untuk mengembalikan nilai "KEGIATAN EDUKASI", dan method getDeskripsiKhusus() dioverride untuk memberikan deskripsi khusus "Kegiatan edukasi untuk pembelajaran". Override ini membuat objek edukasi memiliki perilaku berbeda dengan objek sosial meskipun keduanya berasal dari superclass yang sama.

- Kegiatan Sosial

  <img width="1120" height="422" alt="image" src="https://github.com/user-attachments/assets/e62d688e-05c7-4525-b184-e5460aa12143" />

Pada class KegiatanSosial, method getJenisKegiatan() dioverride untuk mengembalikan nilai "KEGIATAN SOSIAL", dan method getDeskripsiKhusus() dioverride untuk memberikan deskripsi khusus "Kegiatan sosial untuk membantu masyarakat". Dengan override ini, informasi yang ditampilkan sesuai dengan karakteristik kegiatan sosial.

# Alur Program

Saat program dijalankan, pengguna akan melihat menu utama dengan beberapa pilihan: Tambah, Lihat, Update, Hapus, Cari, dan Keluar.

Menu yang ada pada sistem Manajemen Kegiatan Sosial 

1. Tambah Kegiatan

<img width="545" height="563" alt="image" src="https://github.com/user-attachments/assets/20459642-6300-489a-b6f2-05b317085148" />

Jika pengguna memilih menu 1, maka memilih kegiatan edukasi atau sosial, setelah memilih lalu masukkan tanggal, lokasi dan nama penyelenggara acara kegiatan soial. 

2. Lihat Kegiatan

  <img width="645" height="248" alt="image" src="https://github.com/user-attachments/assets/ceafcc59-a215-497e-bcf0-3f3e43d1d0cc" />

Pada menu 2, program menampilkan semua kegiatan yang sudah tersimpan menggunakan perulangan.

3. Update Kegiatan
   
<img width="608" height="703" alt="image" src="https://github.com/user-attachments/assets/54b0d9ae-857c-4af3-88ed-6895b101f254" />

Jika memilih menu 3 yaitu Update Kegiatan, program akan menampilkan daftar kegiatan, lalu meminta untuk memasukkan nomor kegiatan yang ingin diubah, kemudian mengganti data lama yaitu nama kegiatan, tanggal, lokasi dan penyelenggara dengan data baru. Setelah itu, kegiatan berhasil di update.

4. Hapus Kegiatan

<img width="576" height="627" alt="image" src="https://github.com/user-attachments/assets/2ea47359-179e-460d-a125-69f816c1fb04" />

Jika memilih Hapus Kegiatan pada menu 4, maka menampilkan daftar kegiatan, lalu meminta nomor kegiatan yang ingin dihapus, kemudian menghapusnya dari daftar kegiatan.

<img width="784" height="248" alt="image" src="https://github.com/user-attachments/assets/4d7e38fd-2147-4225-8fde-05b2d48e8d3e" />

Untuk cek maka pilih no 2, jika tidak ada maka kegiatan berhasil dihapus.

5. Cari Kegiatan 

<img width="545" height="632" alt="image" src="https://github.com/user-attachments/assets/28cdbe3a-8d9d-4c30-b5a4-c55df6aa757a" />

Pada menu 5 yaitu memilih Cari Kegiatan, meminta kata kunci, lalu menampilkan kegiatan yang cocok berdasarkan nama atau tanggal.

6. Keluar
   
<img width="569" height="247" alt="image" src="https://github.com/user-attachments/assets/d87592ff-2871-4eb2-ac77-8fab2714b6e0" />

Jika memilih menu Keluar,  maka program berhenti.
