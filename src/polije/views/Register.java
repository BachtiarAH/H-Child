/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package polije.views;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import polije.service.AkunServiceImpl;
import polije.service.AkunServiceInterface;
import polije.service.PenggunaServiceImpl;
import polije.service.PenggunaServiceInterface;

/**
 *
 * @author zam
 */
public class Register extends javax.swing.JFrame {

    private PenggunaServiceInterface service;
    private AkunServiceInterface serviceAkun;

    /**
     * Creates new form Register
     */
    public Register() {
        this.service = new PenggunaServiceImpl();
        this.serviceAkun = new AkunServiceImpl();
        this.setMaximumSize(new Dimension(1280, 720));
        this.setResizable(false);
        this.setBackground(new Color(4, 30, 65));
        initComponents();
    }

    public JPanel getPanelRegister() {
        return this.panelRegister;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegister = new javax.swing.JPanel();
        labelRegristasi = new javax.swing.JLabel();
        panelNamaLengkap = new javax.swing.JPanel();
        logoNamalengkap = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        namaLengkap_txt = new javax.swing.JTextField();
        panelNamaLengkap1 = new javax.swing.JPanel();
        logoNamalengkap1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ttl_txt = new javax.swing.JTextField();
        jDate_tanggalLahir = new com.toedter.calendar.JDateChooser();
        panelNamaLengkap3 = new javax.swing.JPanel();
        logoNamalengkap3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        alamat_txt = new javax.swing.JTextField();
        panelNamaLengkap4 = new javax.swing.JPanel();
        logoNamalengkap4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jenisKelamin_combo = new javax.swing.JComboBox<>();
        panelNamaLengkap5 = new javax.swing.JPanel();
        logoNamalengkap5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        username_txt = new javax.swing.JTextField();
        panelNamaLengkap6 = new javax.swing.JPanel();
        logoNamalengkap6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        password_txt = new javax.swing.JTextField();
        panelNamaLengkap7 = new javax.swing.JPanel();
        logoNamalengkap7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        konfirmasi_txt = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(4, 30, 65));

        panelRegister.setBackground(new java.awt.Color(4, 30, 65));
        panelRegister.setPreferredSize(new java.awt.Dimension(640, 720));

        labelRegristasi.setForeground(new java.awt.Color(255, 255, 255));
        labelRegristasi.setText("DAFTAR AKUN");

        panelNamaLengkap.setBackground(new java.awt.Color(255, 255, 255));

        logoNamalengkap.setText("Nama Lengkap");

        jLabel1.setText(":");

        namaLengkap_txt.setBorder(null);

        javax.swing.GroupLayout panelNamaLengkapLayout = new javax.swing.GroupLayout(panelNamaLengkap);
        panelNamaLengkap.setLayout(panelNamaLengkapLayout);
        panelNamaLengkapLayout.setHorizontalGroup(
            panelNamaLengkapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNamaLengkapLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logoNamalengkap)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(namaLengkap_txt)
                .addContainerGap())
        );
        panelNamaLengkapLayout.setVerticalGroup(
            panelNamaLengkapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNamaLengkapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNamaLengkapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoNamalengkap)
                    .addComponent(jLabel1)
                    .addComponent(namaLengkap_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        panelNamaLengkap1.setBackground(new java.awt.Color(255, 255, 255));

        logoNamalengkap1.setText("TTL");

        jLabel2.setText(":");

        ttl_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jDate_tanggalLahir.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout panelNamaLengkap1Layout = new javax.swing.GroupLayout(panelNamaLengkap1);
        panelNamaLengkap1.setLayout(panelNamaLengkap1Layout);
        panelNamaLengkap1Layout.setHorizontalGroup(
            panelNamaLengkap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNamaLengkap1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logoNamalengkap1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ttl_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDate_tanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panelNamaLengkap1Layout.setVerticalGroup(
            panelNamaLengkap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNamaLengkap1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNamaLengkap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNamaLengkap1Layout.createSequentialGroup()
                        .addGroup(panelNamaLengkap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logoNamalengkap1)
                            .addComponent(jLabel2))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNamaLengkap1Layout.createSequentialGroup()
                        .addComponent(jDate_tanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNamaLengkap1Layout.createSequentialGroup()
                        .addComponent(ttl_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        panelNamaLengkap3.setBackground(new java.awt.Color(255, 255, 255));

        logoNamalengkap3.setText("Alamat");

        jLabel4.setText(":");

        alamat_txt.setBorder(null);
        alamat_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamat_txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNamaLengkap3Layout = new javax.swing.GroupLayout(panelNamaLengkap3);
        panelNamaLengkap3.setLayout(panelNamaLengkap3Layout);
        panelNamaLengkap3Layout.setHorizontalGroup(
            panelNamaLengkap3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNamaLengkap3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logoNamalengkap3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alamat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelNamaLengkap3Layout.setVerticalGroup(
            panelNamaLengkap3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNamaLengkap3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNamaLengkap3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoNamalengkap3)
                    .addComponent(jLabel4)
                    .addComponent(alamat_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        panelNamaLengkap4.setBackground(new java.awt.Color(255, 255, 255));

        logoNamalengkap4.setText("Jenis Kelamin");

        jLabel5.setText(":");

        jenisKelamin_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih jenis kelamin", "Laki-laki", "Perempuan" }));
        jenisKelamin_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisKelamin_comboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNamaLengkap4Layout = new javax.swing.GroupLayout(panelNamaLengkap4);
        panelNamaLengkap4.setLayout(panelNamaLengkap4Layout);
        panelNamaLengkap4Layout.setHorizontalGroup(
            panelNamaLengkap4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNamaLengkap4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logoNamalengkap4)
                .addGap(24, 24, 24)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(jenisKelamin_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panelNamaLengkap4Layout.setVerticalGroup(
            panelNamaLengkap4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNamaLengkap4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNamaLengkap4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoNamalengkap4)
                    .addComponent(jLabel5)
                    .addComponent(jenisKelamin_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        panelNamaLengkap5.setBackground(new java.awt.Color(255, 255, 255));

        logoNamalengkap5.setText("Username");

        jLabel6.setText(":");

        username_txt.setBorder(null);

        javax.swing.GroupLayout panelNamaLengkap5Layout = new javax.swing.GroupLayout(panelNamaLengkap5);
        panelNamaLengkap5.setLayout(panelNamaLengkap5Layout);
        panelNamaLengkap5Layout.setHorizontalGroup(
            panelNamaLengkap5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNamaLengkap5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logoNamalengkap5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelNamaLengkap5Layout.setVerticalGroup(
            panelNamaLengkap5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNamaLengkap5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNamaLengkap5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoNamalengkap5)
                    .addComponent(jLabel6)
                    .addComponent(username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        panelNamaLengkap6.setBackground(new java.awt.Color(255, 255, 255));

        logoNamalengkap6.setText("Password");

        jLabel7.setText(":");

        password_txt.setBorder(null);

        javax.swing.GroupLayout panelNamaLengkap6Layout = new javax.swing.GroupLayout(panelNamaLengkap6);
        panelNamaLengkap6.setLayout(panelNamaLengkap6Layout);
        panelNamaLengkap6Layout.setHorizontalGroup(
            panelNamaLengkap6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNamaLengkap6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logoNamalengkap6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelNamaLengkap6Layout.setVerticalGroup(
            panelNamaLengkap6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNamaLengkap6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNamaLengkap6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoNamalengkap6)
                    .addComponent(jLabel7)
                    .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        panelNamaLengkap7.setBackground(new java.awt.Color(255, 255, 255));

        logoNamalengkap7.setText("Konfirmasi");

        jLabel8.setText(":");

        konfirmasi_txt.setBorder(null);

        javax.swing.GroupLayout panelNamaLengkap7Layout = new javax.swing.GroupLayout(panelNamaLengkap7);
        panelNamaLengkap7.setLayout(panelNamaLengkap7Layout);
        panelNamaLengkap7Layout.setHorizontalGroup(
            panelNamaLengkap7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNamaLengkap7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logoNamalengkap7)
                .addGap(41, 41, 41)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(konfirmasi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelNamaLengkap7Layout.setVerticalGroup(
            panelNamaLengkap7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNamaLengkap7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelNamaLengkap7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoNamalengkap7)
                    .addComponent(jLabel8)
                    .addComponent(konfirmasi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        btnRegister.setText("Simpan");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRegisterLayout = new javax.swing.GroupLayout(panelRegister);
        panelRegister.setLayout(panelRegisterLayout);
        panelRegisterLayout.setHorizontalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegisterLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(labelRegristasi))
                    .addGroup(panelRegisterLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnRegister)
                            .addComponent(panelNamaLengkap6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelNamaLengkap5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelNamaLengkap4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelNamaLengkap3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelNamaLengkap1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelNamaLengkap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelNamaLengkap7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        panelRegisterLayout.setVerticalGroup(
            panelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegisterLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelRegristasi)
                .addGap(32, 32, 32)
                .addComponent(panelNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelNamaLengkap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelNamaLengkap3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelNamaLengkap4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelNamaLengkap5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelNamaLengkap6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelNamaLengkap7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnRegister)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 720));

        jLabel9.setIcon(new javax.swing.ImageIcon("/home/zam/Desktop/joki/h-chid/H-Child/src/polije/assets/rsz_1logo_sunting_1.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel9)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(232, 232, 232))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void alamat_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamat_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamat_txtActionPerformed

    private void jenisKelamin_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisKelamin_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisKelamin_comboActionPerformed

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        // TODO add your handling code here: 
        String nama = namaLengkap_txt.getText();
        String tempatLahir = ttl_txt.getText();
        Date dt = jDate_tanggalLahir.getDate();
        int jkInt = jenisKelamin_combo.getSelectedIndex();
        String alamat = alamat_txt.getText();
        String username = username_txt.getText();
        String password = password_txt.getText();
        String konfirmasiPassword = konfirmasi_txt.getText();
        if (nama != "" && tempatLahir != "" && jDate_tanggalLahir.getDate() != null && jkInt == 0  && alamat == "" && password == "" && username == "" && konfirmasiPassword == "") {
            JOptionPane.showMessageDialog(null, "Gagal Daftar Akun , harap isi semua field", "Terjadi Kesalahan", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                java.sql.Date confert = new java.sql.Date(dt.getDate());
                String jkValue = "";
                if (jkInt == 1) {
                    jkValue = "Laki-laki";
                } else if (jkInt == 2) {
                    jkValue = "Peremupan";
                }else{
                    JOptionPane.showMessageDialog(null, "Harap , Pilih Jenis Kelamin Terlebih Dahulu", "Failed", JOptionPane.INFORMATION_MESSAGE);
                }
                if (!konfirmasiPassword.equals(password)) {
                    JOptionPane.showMessageDialog(null, "Gagar Daftar akun , konfirmasi password dan password tidak sama", "Failed", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    boolean findByUsernameResult = this.service.findByUsername(username);
                    if (findByUsernameResult) {
                        JOptionPane.showMessageDialog(null, "Gagal daftar akun , username sudah digunakan gunakan yang lain", "Failed", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        boolean isSuces = this.service.register(nama, tempatLahir, confert, jkValue, alamat);
                        if (isSuces) {
                            int id = this.service.getLastInsertId();
                            System.out.println("true");
                            boolean suscesRegristasiAkun = this.serviceAkun.register(username, password, id);
                            if (suscesRegristasiAkun) {
                                JOptionPane.showMessageDialog(null, "Berhasil Daftar Akun", "Success", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Gagal Mendaftarkan akun", "Terjadi Kesalahan", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Gagal Mendaftarkan akun", "Terjadi Kesalahan", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Harap masukan umur dengan angka", "Terjadi Kesalahan", JOptionPane.INFORMATION_MESSAGE);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Harap isi semua data", "Terjadi Kesalahan", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnRegisterMouseClicked

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat_txt;
    private javax.swing.JButton btnRegister;
    private com.toedter.calendar.JDateChooser jDate_tanggalLahir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jenisKelamin_combo;
    private javax.swing.JTextField konfirmasi_txt;
    private javax.swing.JLabel labelRegristasi;
    private javax.swing.JLabel logoNamalengkap;
    private javax.swing.JLabel logoNamalengkap1;
    private javax.swing.JLabel logoNamalengkap3;
    private javax.swing.JLabel logoNamalengkap4;
    private javax.swing.JLabel logoNamalengkap5;
    private javax.swing.JLabel logoNamalengkap6;
    private javax.swing.JLabel logoNamalengkap7;
    private javax.swing.JTextField namaLengkap_txt;
    private javax.swing.JPanel panelNamaLengkap;
    private javax.swing.JPanel panelNamaLengkap1;
    private javax.swing.JPanel panelNamaLengkap3;
    private javax.swing.JPanel panelNamaLengkap4;
    private javax.swing.JPanel panelNamaLengkap5;
    private javax.swing.JPanel panelNamaLengkap6;
    private javax.swing.JPanel panelNamaLengkap7;
    private javax.swing.JPanel panelRegister;
    private javax.swing.JTextField password_txt;
    private javax.swing.JTextField ttl_txt;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}
