# Aplikasi Konversi Suhu

**Pembuat**: Muhammad Irwan Habibie  
**NPM**: 2210010461  
**Tugas 2**

Aplikasi Konversi Suhu ini adalah program berbasis Java GUI yang dibuat menggunakan `javax.swing`. Aplikasi ini memungkinkan pengguna untuk mengonversi suhu antara beberapa skala suhu, termasuk Celsius, Fahrenheit, Kelvin, dan Reamur.

## Fitur Utama

- Konversi otomatis antar skala suhu (Celsius, Fahrenheit, Kelvin, Reamur).
- Pilihan mode konversi suhu:
  - Celsius ke skala lain.
  - Fahrenheit ke skala lain.
  - Kelvin ke skala lain.
  - Reamur ke skala lain.
- Input suhu yang validasi otomatis untuk hanya menerima angka dan desimal.
- Hasil konversi otomatis muncul setelah input dimasukkan.

## Struktur Program

1. **KonversiSuhuFrame**:
   - Merupakan kelas utama yang mengatur antarmuka pengguna (GUI).
   - Menggunakan komponen dari `javax.swing` untuk membuat layout dan elemen input.
   - Tombol-tombol radio untuk memilih skala suhu awal.
   - Kotak kombo untuk memilih skala suhu tujuan.

2. **Metode Konversi**:
   - Program ini memiliki metode konversi dari masing-masing skala suhu ke skala lainnya:
     - `celsiusToFahrenheit`, `celsiusToKelvin`, `celsiusToReamur`
     - `fahrenheitToCelsius`, `fahrenheitToKelvin`, `fahrenheitToReamur`
     - `kelvinToCelsius`, `kelvinToFahrenheit`, `kelvinToReamur`
     - `reamurToCelsius`, `reamurToFahrenheit`, `reamurToKelvin`

3. **Input Validation**:
   - Input suhu hanya dapat menerima angka atau tanda desimal, sehingga memastikan input yang valid.

## Cara Menjalankan Program

1. **Persyaratan**:
   - Java Development Kit (JDK) versi 8 atau lebih baru.

2. **Langkah Menjalankan**:
   - Clone atau unduh repository.
   - Buka proyek di IDE yang mendukung Java (misalnya, NetBeans atau IntelliJ).
   - Jalankan file utama `KonversiSuhuFrame`.
