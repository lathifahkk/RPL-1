# LAPORAN PROJECT RPL

## ELis

### Kolompok 5

Anggota :
1. Rian Reftian (G64180009)
2. Muhammad Hafiduddin (G64180017)
3. Lathifah Kurnia K (G64180023)


### Latar Belakang 
Pertumbuhan populasi manusia meningkat secara tajam pada abad sekarang ini. Tercatat pada sensus penduduk tahun 2015 sebesar 238.518.000 jiwa dan diproyeksikan akan meningkat pada tahun 2020 menjadi sebanyak 271.066.000 jiwa. Kebutuhan sumberdaya listrik khusunya di Pulau Jawa sebagian besar berasal dari pembangkit listrik bertenaga bahan bakar fosil. Pembangkit listrik ini menyebabkan polusi udara dan kerusakan lingkungan karena bahan bakarnya bisa berasal dari pertambangan batu bara. 

Hampir segala kegiatan kehidupan dan bidang memanfaatkan energi listrik. Hal ini membuat kebutuhan listrik semakin meningkat. Sehingga memerlukan bahan bakar yang semakin banyak untuk membangkitkan listrik, sementara bahan bakar pembangkit listrik semakin menipis dan juga menyebabkan polusi lingkungan. Banyak kerugian yang timbul dari perilaku pemborosan listrik. Hal kecil seperti tidak mematikan lampu dan peralatan elektronik saat sudah tidak digunakan turut menjadi salah satu perilaku pemborosan energi listrik.


### Tujuan

Tujuan dibuatnya aplikasi ini untuk mengurangi perilaku pemborosan listrik serta mengontrol penggunaan listrik, sehingga dapat menghemat penggunaan sumber daya listrik dimulai dari diri sendiri dan rumah tangga. 


### Ruang Lingkup

* Perangkat keras 
Perangkat keras yang digunakan adalah laptop dengan spesifikasi 
  * Processor Intel Inside i5 
  * Memori 4 GB 
  * Graphic card Intel HD graphic family 
  * Storage 500 GB. 

* Perangkat Lunak 
Perangkat lunak yang digunakan meluputi
  * Framework : Android Studio
  * Database : Firebase
  * Mockup : Figma
  * Manajement Development :
    * Trello
    * GitHub
    * TeamGantt
    
### Deskripsi Perangkat Lunak

ELis adalah suatu aplikasi yang bertujuan untuk dapat membantu penggunanya dalam mengelola penggunaan listrik pada rumahnya, sehingga penggunaan listrik lebih terkonrol dan dapat mengurangi perilaku pemborosan listrik.

Pada aplikasi ELIS ini terdapat beberapa fitur, yaitu
* Fitur Kelola Alat Listrik : fitur ini memungkinkan penggunanya untuk mematikan aliran listrik ke lampu dan juga stopkontak secara otomatis ataupun secara manual menggunakan aplikasi ini.
* Fitur Info Pemadaman : fitur ini memberikan informasi kepada pengguna tentang informasi daerah serta waktu yang terjadi pemadaman listrik.
* Fitur Jumlah Pemakaian : fitur ini memberikan informasi berupa jumlah pemakaian listrik dari perangkat listrik yang telah digunakan oleh pengguna.

### Analisis User

Aplikasi ini ditujukan untuk masyarakat yang membutuhkan suatu aplikasi yang dapat memberi kemudahan untuk membantu mengelola penggunaan listrik sehari-hari agar lebih terkontrol sehingga dapat mengurangi  pemborosan listrik.

### User Story
* Sebagai pengguna, sebuah aplikasi yang dapat membatu saya mengefisienkan penggunaan listrik sehingga saya tidak boros listrik.
* Sebagai pengguna , saya ingin dapat menghidupkan/mematikan lampu dari jarak jauh sehingga tidak perlu menekan saklar lampu untuk menghidupkan atau mematikan lampu.
* Sebagai pengguna, saya ingin dapat memutus atau menghubungkan aliran listrik pada peralatan listrik tanpa perlu mencabut kabel peralatan listrik dari stopkontak jika tidak menggunakan alat tersebut.
* Sebagai pengguna, saya ingin dapat mengetahui pemakaian listrik rumah saya tanpa perlu melihatnya di meteran listrik.
* Sebagai pengguna saya ingin mendapatkan informasi pemadaman listrik sehingga saya dapat tahu ketika listrik di rumah mati disebabkan konsleting atau sedang terjadi pemadaman listrik dari pihak PLN.
* Sebagai Petugas PLN, saya ingin memberi informasi pemadaman listrik kepada pelanggan sehingga ketika terjadi pemadaman listrik pelanggan dapat mengetahuinya.


### Use Case Diagram
![Use Case Diagram](https://user-images.githubusercontent.com/60084059/82161698-149e7980-98c9-11ea-88ad-e7cf3cb73e81.png)

### Use Case Description

| Use Case 1              |Setting Listrik|
|------------------------ |----------------------- |
| Actor                   |Masyarakat|
|Deskripsi                | User dari masyarakat menyeting kondisi untuk mematikan atau menghidupkan lampu.|
| Successful Compilation  |1. [Optional] User mensinkronisasikan peralatan IoT yang dimiliki dengan aplikasi  2. Menyetel notifikasi pada waktu tertentu  3. [Optional] memunculkan notifikasi listrik belum dimatikan dalam jarak tertentu|
|Alternatif | Muncul layar peringatan”Perangkat IoT tidak ditemukan”|
|Precondition | Kegiatan tidak bisa dilakukan jika user belum log-in|
|Postcondition | [Optional] user bisa mematikan listrik dari jarak jauh jika mempunyai IoT|


| Use Case 2              |Info pemadaman|
|------------------------ |----------------------- |
| Actor                   |Petugas PLN|
|Deskripsi                | Petugas menambahkan informasi pada aplikasi tentang pemadaman yang akan dilakukan di daerah tertentu.|
| Successful Compilation  | 1) User bisa melihat info pemadaman. 2)Informasi daerah ditampilkan pada aplikasi.|
|Alternatif | 1) Muncul notifikasi “ Gagal memasukan data”  2)Petugas PLN mengubah waktu dan hari dari data yang telah diinputkan.|
|Precondition | Kegiatan tidak bisa dilakukan jika petugas belum log-in menggunakan akun yang telah diverifikasi.|
|Postcondition |-|

| Use Case 3              |Kalkulasi Penggunaan Listrik|
|------------------------ |----------------------- |
| Actor                   |Petugas PLN & User|
|Deskripsi                | User bisa mengkalkulasi penggunaan listrik|
| Successful Compilation  | 1) User bisa melihat kalkulasi tagihan listrik yang telah digunakan. 2) [Optional] User bisa melihat notifikasi jika tagihan listrik sudah melewati batas tertentu.|
|Alternatif | Muncul notifikasi ”Maaf anda tidak memenuhi syarat hardware yang ditentukan”|
|Precondition | Petugas menginputkan data tentang tagihan listrik per Kwh|
|Postcondition |-|


### Activity Diagram

* Kelola Alat Listrik

![RPL -Setting](https://user-images.githubusercontent.com/60084059/82143232-93b19480-986c-11ea-949e-f2a500effb0e.png = 100x)

* Info Pemadaman
![LKP 4  RPL -INFO PEMADAMAN BY PENGGUNA](https://user-images.githubusercontent.com/60084059/82159857-912a5b80-98bb-11ea-96c5-6d7e619e57cd.png)

* Kalkulasi Penggunaan
![RPL -ELIS](https://user-images.githubusercontent.com/60084059/82159848-88d22080-98bb-11ea-937d-b416af68e8a3.png)

### Gantt Chart
![team gantt](https://user-images.githubusercontent.com/60084059/82161818-4a902d80-98ca-11ea-8df5-2c4ca011acf1.png)


### ERD
![LKP 4  RPL -ERD](https://user-images.githubusercontent.com/60084059/82159862-9a1b2d00-98bb-11ea-8ae9-43cb791b0828.png)


### Hasil Implementasi

![COVER](https://user-images.githubusercontent.com/60084059/82239167-90003980-9962-11ea-9361-c78e024c5965.png)

* Sign Up
![SIGN UP](https://user-images.githubusercontent.com/60084059/82239181-955d8400-9962-11ea-97dd-042e1d267f3a.png)

* Login
![LOGIN](https://user-images.githubusercontent.com/60084059/82239193-9989a180-9962-11ea-8209-c3bfa1afb127.png)

* Lupa Password
![Lupa Password](https://user-images.githubusercontent.com/60084059/82239226-aad2ae00-9962-11ea-8303-6071f4013349.png)

![Lupa Password (contd)](https://user-images.githubusercontent.com/60084059/82239251-b0c88f00-9962-11ea-81c7-329f95998c3e.png)

* Home
![DASHBOARD](https://user-images.githubusercontent.com/60084059/82239201-9d1d2880-9962-11ea-8ce7-2d2b33b0f196.png)

* Menu Kelola Perangkat
![KELOLA](https://user-images.githubusercontent.com/60084059/82239310-c6d64f80-9962-11ea-8b13-138549309627.png)

![KELOLA -_ KEL](https://user-images.githubusercontent.com/60084059/82239326-cd64c700-9962-11ea-99ea-89930428c7d5.png)

![Set Waktu - ON](https://user-images.githubusercontent.com/60084059/82239365-deadd380-9962-11ea-9d74-325c63829dfe.png)


* Informasi Kalkulasi Penggunaan Listrik
![INFO](https://user-images.githubusercontent.com/60084059/82239544-203e7e80-9963-11ea-999c-04964f2e7140.png)

![INFO (1)](https://user-images.githubusercontent.com/60084059/82239550-22084200-9963-11ea-9ee3-cec97903be0b.png)

* Akun
![AKUN](https://user-images.githubusercontent.com/60084059/82239417-eec5b300-9962-11ea-9714-f48847a9c569.png)

* Edit Profil

![Edit Profil](https://user-images.githubusercontent.com/60084059/82239447-f5542a80-9962-11ea-8773-d0a57271e81d.png)

![Edit Profil (1)](https://user-images.githubusercontent.com/60084059/82239531-1c126100-9963-11ea-8bce-acece263c8ec.png)







