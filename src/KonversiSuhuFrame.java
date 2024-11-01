import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
public class KonversiSuhuFrame extends javax.swing.JFrame {

    /**
     * Creates new form KonversiSuhuFrame
     */
    public KonversiSuhuFrame() {
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        bg.add(jRadioButton3);
        bg.add(jRadioButton4);
        jRadioButton1.setSelected(true); // Set default selection jika diinginkan
        
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
        
    }

    // Dari Celsius
    private double celsiusToFahrenheit(double celsius) {
        return celsius * 9/5 + 32;
    }

    private double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private double celsiusToReamur(double celsius) {
        return celsius * 4/5;
    }

    // Dari Fahrenheit
    private double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    private double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    private double fahrenheitToReamur(double fahrenheit) {
        return (fahrenheit - 32) * 4/9;
    }

    // Dari Kelvin
    private double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    private double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    private double kelvinToReamur(double kelvin) {
        return (kelvin - 273.15) * 4/5;
    }

    // Dari Reamur
    private double reamurToCelsius(double reamur) {
        return reamur * 5/4;
    }

    private double reamurToFahrenheit(double reamur) {
        return reamur * 9/4 + 32;
    }

    private double reamurToKelvin(double reamur) {
        return reamur * 5/4 + 273.15;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtInputSuhu = new javax.swing.JTextField();
        comboKonversi = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        txtHasil = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Aplikasi Konversi Suhu");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        txtInputSuhu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtInputSuhuFocusGained(evt);
            }
        });
        txtInputSuhu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInputSuhuKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel2.add(txtInputSuhu, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel2.add(comboKonversi, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Konversi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel2.add(jButton1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Masukkan Suhu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel2.add(jLabel2, gridBagConstraints);

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton1.setText("Celsius ke Skala Lain");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel2.add(jRadioButton1, gridBagConstraints);

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton2.setText("Fahrenheit ke Skala Lain");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel2.add(jRadioButton2, gridBagConstraints);

        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton3.setText("Reamur ke Skala Lain");
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel2.add(jRadioButton3, gridBagConstraints);

        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton4.setText("Kelvin ke Skala Lain");
        jRadioButton4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton4ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel2.add(jRadioButton4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel2.add(txtHasil, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Hasil");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        jPanel2.add(jLabel3, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtInputSuhuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputSuhuKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
        }
    }//GEN-LAST:event_txtInputSuhuKeyTyped

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboKonversi.removeAllItems();
            comboKonversi.addItem("Celsius ke Fahrenheit");
            comboKonversi.addItem("Celsius ke Kelvin");
            comboKonversi.addItem("Celsius ke Reamur");
        }
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboKonversi.removeAllItems();
            comboKonversi.addItem("Fahrenheit ke Celsius");
            comboKonversi.addItem("Fahrenheit ke Kelvin");
            comboKonversi.addItem("Fahrenheit ke Reamur");
        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton4ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboKonversi.removeAllItems();
            comboKonversi.addItem("Reamur ke Celsius");
            comboKonversi.addItem("Reamur ke Fahrenheit");
            comboKonversi.addItem("Reamur ke Kelvin");
        }
    }//GEN-LAST:event_jRadioButton4ItemStateChanged

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            comboKonversi.removeAllItems();
            comboKonversi.addItem("Kelvin ke Celsius");
            comboKonversi.addItem("Kelvin ke Fahrenheit");
            comboKonversi.addItem("Kelvin ke Reamur");
        }
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void txtInputSuhuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInputSuhuFocusGained
        txtInputSuhu.setText("");
    }//GEN-LAST:event_txtInputSuhuFocusGained

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboKonversi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField txtHasil;
    private javax.swing.JTextField txtInputSuhu;
    // End of variables declaration//GEN-END:variables
}
