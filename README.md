# Tugas 2: Aplikasi Konversi Suhu

### Pembuat
- **Nama**: Muhammad Irwan Habibie
- **NPM**: 2210010461

---

## 1. Deskripsi Program
Aplikasi ini memungkinkan pengguna untuk:
- Memasukkan nilai suhu dalam suatu skala (Celsius, Fahrenheit, dll).
- Memilih jenis konversi suhu yang diinginkan.
- Menekan tombol **Konversi** untuk menampilkan hasil konversi ke skala suhu lain.

## 2. Komponen GUI
- **JFrame**: Window utama aplikasi.
- **JPanel**: Panel untuk menampung komponen.
- **JLabel**: Menampilkan label dan hasil konversi.
- **JTextField**: Input untuk memasukkan nilai suhu yang akan dikonversi.
- **JComboBox**: Dropdown untuk memilih skala suhu.
- **JButton**: Tombol untuk melakukan konversi suhu.
- **JRadioButton**: Tombol radio untuk memilih arah konversi suhu.

## 3. Logika Program
- Menggunakan rumus konversi suhu sesuai skala yang dipilih (misalnya Celsius ke Fahrenheit atau Celsius ke Kelvin).
- Validasi input untuk memastikan pengguna hanya memasukkan angka.

## 4. Events
Menggunakan **ActionListener** dan **KeyAdapter** untuk memudahkan interaksi pengguna:

### A. Tombol Konversi
Menampilkan hasil konversi suhu setelah memvalidasi input dan menjalankan rumus konversi yang sesuai.
```java
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            double inputSuhu = Double.parseDouble(txtInputSuhu.getText());
            String pilihanKonversi = (String) comboKonversi.getSelectedItem();
            double hasil = 0.0;

            if (jRadioButton1.isSelected()) {
                switch (pilihanKonversi) {
                    case "Celsius ke Fahrenheit":
                        hasil = celsiusToFahrenheit(inputSuhu);
                        break;
                    case "Celsius ke Kelvin":
                        hasil = celsiusToKelvin(inputSuhu);
                        break;
                    case "Celsius ke Reamur":
                        hasil = celsiusToReamur(inputSuhu);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                        break;
                }
            } else if (jRadioButton2.isSelected()) {
                switch (pilihanKonversi) {
                    case "Fahrenheit ke Celsius":
                        hasil = fahrenheitToCelsius(inputSuhu);
                        break;
                    case "Fahrenheit ke Kelvin":
                        hasil = fahrenheitToKelvin(inputSuhu);
                        break;
                    case "Fahrenheit ke Reamur":
                        hasil = fahrenheitToReamur(inputSuhu);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                        break;
                }
            } else if (jRadioButton3.isSelected()) {
                switch (pilihanKonversi) {
                    case "Kelvin ke Celsius":
                        hasil = kelvinToCelsius(inputSuhu);
                        break;
                    case "Kelvin ke Fahrenheit":
                        hasil = kelvinToFahrenheit(inputSuhu);
                        break;
                    case "Kelvin ke Reamur":
                        hasil = kelvinToReamur(inputSuhu);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                        break;
                }
            } else if (jRadioButton4.isSelected()) {
                switch (pilihanKonversi) {
                    case "Reamur ke Celsius":
                        hasil = reamurToCelsius(inputSuhu);
                        break;
                    case "Reamur ke Fahrenheit":
                        hasil = reamurToFahrenheit(inputSuhu);
                        break;
                    case "Reamur ke Kelvin":
                        hasil = reamurToKelvin(inputSuhu);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                        break;
                }
            }

            txtHasil.setText("" + hasil);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!");
        }

    }   
```
### B. Key Adapter untuk membatasi input hanya angka
```java
    private void txtInputSuhuKeyTyped(java.awt.event.KeyEvent evt) {                                      
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
        }
    }   
```
## 5. Variasi
Aplikasi ini memiliki variasi tambahan berikut:

### A. Konversi Suhu ke Skala Lain (Reamur, Kelvin, dsb)
Menambahkan konversi suhu ke skala lain seperti Reamur dan Kelvin dengan rumus yang sesuai.
```java
            if (jRadioButton1.isSelected()) {
                switch (pilihanKonversi) {
                    case "Celsius ke Fahrenheit":
                        hasil = celsiusToFahrenheit(inputSuhu);
                        break;
                    case "Celsius ke Kelvin":
                        hasil = celsiusToKelvin(inputSuhu);
                        break;
                    case "Celsius ke Reamur":
                        hasil = celsiusToReamur(inputSuhu);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                        break;
                }
            } else if (jRadioButton2.isSelected()) {
                switch (pilihanKonversi) {
                    case "Fahrenheit ke Celsius":
                        hasil = fahrenheitToCelsius(inputSuhu);
                        break;
                    case "Fahrenheit ke Kelvin":
                        hasil = fahrenheitToKelvin(inputSuhu);
                        break;
                    case "Fahrenheit ke Reamur":
                        hasil = fahrenheitToReamur(inputSuhu);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                        break;
                }
            } else if (jRadioButton3.isSelected()) {
                switch (pilihanKonversi) {
                    case "Kelvin ke Celsius":
                        hasil = kelvinToCelsius(inputSuhu);
                        break;
                    case "Kelvin ke Fahrenheit":
                        hasil = kelvinToFahrenheit(inputSuhu);
                        break;
                    case "Kelvin ke Reamur":
                        hasil = kelvinToReamur(inputSuhu);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                        break;
                }
            } else if (jRadioButton4.isSelected()) {
                switch (pilihanKonversi) {
                    case "Reamur ke Celsius":
                        hasil = reamurToCelsius(inputSuhu);
                        break;
                    case "Reamur ke Fahrenheit":
                        hasil = reamurToFahrenheit(inputSuhu);
                        break;
                    case "Reamur ke Kelvin":
                        hasil = reamurToKelvin(inputSuhu);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                        break;
                }
            }
```
### B. ItemListener pada JRadioButton
Menggunakan **ItemListener** untuk memilih arah konversi suhu.
```java
            if (jRadioButton1.isSelected()) {
                switch (pilihanKonversi) {
                    case "Celsius ke Fahrenheit":
                        hasil = celsiusToFahrenheit(inputSuhu);
                        break;
                    case "Celsius ke Kelvin":
                        hasil = celsiusToKelvin(inputSuhu);
                        break;
                    case "Celsius ke Reamur":
                        hasil = celsiusToReamur(inputSuhu);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                        break;
                }
            } else if (jRadioButton2.isSelected()) {
                switch (pilihanKonversi) {
                    case "Fahrenheit ke Celsius":
                        hasil = fahrenheitToCelsius(inputSuhu);
                        break;
                    case "Fahrenheit ke Kelvin":
                        hasil = fahrenheitToKelvin(inputSuhu);
                        break;
                    case "Fahrenheit ke Reamur":
                        hasil = fahrenheitToReamur(inputSuhu);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                        break;
                }
            } else if (jRadioButton3.isSelected()) {
                switch (pilihanKonversi) {
                    case "Kelvin ke Celsius":
                        hasil = kelvinToCelsius(inputSuhu);
                        break;
                    case "Kelvin ke Fahrenheit":
                        hasil = kelvinToFahrenheit(inputSuhu);
                        break;
                    case "Kelvin ke Reamur":
                        hasil = kelvinToReamur(inputSuhu);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                        break;
                }
            } else if (jRadioButton4.isSelected()) {
                switch (pilihanKonversi) {
                    case "Reamur ke Celsius":
                        hasil = reamurToCelsius(inputSuhu);
                        break;
                    case "Reamur ke Fahrenheit":
                        hasil = reamurToFahrenheit(inputSuhu);
                        break;
                    case "Reamur ke Kelvin":
                        hasil = reamurToKelvin(inputSuhu);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Pilihan konversi tidak valid!");
                        break;
                }
            }
```

### C. Konversi Otomatis
Implementasi konversi otomatis saat nilai input berubah, mempermudah pengguna melihat hasil konversi tanpa menekan tombol **Konversi**.
```java
        // Tambahkan DocumentListener untuk konversi otomatis
        txtInputSuhu.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                jButton1ActionPerformed(null);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                jButton1ActionPerformed(null);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                jButton1ActionPerformed(null);
            }
        });
```
## 6. Tampilan Aplikasi Saat di Run
![TampilanKonversiSuhu](https://github.com/user-attachments/assets/f9fa5266-0575-4642-a984-1713bf8fb830)


## 7. Indikator Penilaian

| No  | Komponen          | Persentase |
| :-: | ------------------ | :--------: |
|  1  | Komponen GUI      |     10%    |
|  2  | Logika Program    |     20%    |
|  3  | Events            |     15%    |
|  4  | Kesesuaian UI     |     15%    |
|  5  | Memenuhi Variasi  |     40%    |
|     | **TOTAL**         |  **100%**  |

--- 
