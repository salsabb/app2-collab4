# Project Kolaborasi Android

Ini adalah proyek sederhana untuk belajar kolaborasi menggunakan Git & Android Studio

## 👥 Tim
- Salsa Billa Brilliana: Inisialisasi & Merge PR
- Sri Dheva A.W.N: Fitur TextView
- Meriani Putri Suryaningtiyas: Fitur Button

## 📱 Fitur
- Menampilkan TextView
- Menampilkan Button yang dapat diklik

## 🔧 Teknologi
- Kotlin
- Android Studio
- Git + GitHub

## 📸 Penjelasan code penting
> activity_fitur_splash.xml
  File activity_fitur_splash.xml menggunakan ConstraintLayout sebagai root layout dan berisi sebuah LinearLayout
  vertikal yang menampung elemen-elemen utama seperti TextView untuk judul "Form Biodata Siswa", dua EditText untuk input nama dan kelas,
  sebuah Button untuk menampilkan hasil, serta TextView tambahan untuk menampilkan hasil input. Setiap elemen diberi styling dasar seperti ukuran teks,
  warna garis, dan tata letak agar tampil rapi.

> activity_main.xml
  Tampilan layout XML ini dirancang untuk menampilkan sebuah formulir biodata siswa dalam aplikasi Android. Komponen utamanya dibungkus dalam
  LinearLayout yang disusun secara vertikal dan diposisikan di tengah layar menggunakan ConstraintLayout sebagai parent-nya. Bagian paling atas terdapat
  TextView berisi judul "Form Biodata Siswa" yang ditampilkan dengan gaya teks tebal dan ukuran 20sp, serta disejajarkan di tengah. Berikutnya,
  terdapat dua EditText yang memungkinkan pengguna untuk mengisi nama dan kelas mereka, masing-masing memiliki hint sebagai petunjuk input, tinggi 48dp,
  dan warna garis bawah berwarna ungu (#6200EE). Setelah pengisian data, pengguna dapat menekan tombol Button bertuliskan "Tampilkan" untuk memproses input,
  yang posisinya disejajarkan di tengah layout dengan margin bawah. Hasil dari input tersebut akan ditampilkan pada TextView di bagian bawah yang awalnya kosong,
  dengan padding dan latar belakang abu-abu terang (#E0E0E0).

> mainactivity.kt
  Tampilan layout ini merupakan sebuah form biodata siswa yang terdiri dari beberapa fitur utama. Di bagian atas terdapat judul "Form Biodata Siswa" yang
  ditampilkan menggunakan TextView sebagai penanda halaman. Di bawahnya, pengguna dapat mengisi data melalui dua buah EditText, yaitu untuk memasukkan nama dan kelas siswa.
  Setelah data diisi, terdapat sebuah tombol bertuliskan "Tampilkan" yang berfungsi untuk memproses input ketika ditekan. Hasil dari input nama dan kelas tersebut kemudian
  akan ditampilkan di bawah tombol dalam TextView kosong yang disiapkan sebagai tempat output. 

> fitur_splash.kt
  Kode di atas merupakan implementasi kelas fitur_splash yang merupakan turunan dari AppCompatActivity, digunakan sebagai splash screen dalam aplikasi Android.
  Di dalam metode onCreate(), layout activity_fitur_splash ditampilkan menggunakan setContentView(), lalu elemen TextView dengan ID typewriterText dihubungkan ke variabel
  textView menggunakan findViewById(). Teks yang ingin ditampilkan secara mengetik satu per satu disiapkan dalam variabel textToType, sementara index digunakan untuk melacak
  posisi huruf yang sedang ditampilkan, dan typingDelay menentukan waktu jeda antar karakter dalam milidetik. Kemudian, Handler dijalankan dengan postDelayed() untuk menunda proses
  selama 3000 milidetik (3 detik). Setelah waktu ini berlalu, Intent digunakan untuk berpindah dari kelas fitur_splash ke MainActivity, dan finish() dipanggil untuk menutup splash
  agar tidak bisa kembali ke halaman tersebut ketika tombol back ditekan.

> androidmanifest.xml
  Kode di atas merupakan file AndroidManifest.xml yang berfungsi sebagai deklarasi utama konfigurasi aplikasi Android. Elemen <manifest> adalah root yang membungkus seluruh isi
  konfigurasi dan menggunakan namespace Android dan tools. Di dalam elemen <application>, terdapat beberapa atribut penting. Atribut android:allowBackup="true" mengizinkan
  sistem mencadangkan data aplikasi pengguna. Atribut android:dataExtractionRules dan android:fullBackupContent mengarah ke file XML yang menentukan aturan pencadangan dan ekstraksi data.
  Atribut android:icon dan android:roundIcon merujuk pada ikon aplikasi yang ditampilkan di launcher. android:label memberikan nama aplikasi yang ditampilkan ke pengguna. android:supportsRtl="true"
  mengaktifkan dukungan tata letak kanan ke kiri, dan android:theme menentukan tema aplikasi secara keseluruhan. Selanjutnya terdapat dua elemen <activity>.
  Aktivitas pertama adalah .fitur_splash, yaitu layar pembuka (splash screen) yang ditandai dengan intent-filter. Intent-filter ini memiliki aksi MAIN dan kategori LAUNCHER,
  yang berarti aktivitas ini akan menjadi titik awal ketika aplikasi dijalankan oleh pengguna dari ikon aplikasi. Aktivitas kedua adalah .MainActivity, yaitu tampilan utama aplikasi
  yang akan diakses setelah splash screen. Atribut android:exported="true" pada kedua aktivitas berarti bahwa aktivitas-aktivitas tersebut dapat dipanggil oleh komponen lain di luar
  aplikasi jika diizinkan oleh intent-filter.

## 📸 Screenshot
> ![splash_screen](https://github.com/user-attachments/assets/065abc2b-c692-48ba-a391-e3bb71a25558)
> ![form input](https://github.com/user-attachments/assets/02fe878a-581a-489e-acf6-72ee403a051b)


