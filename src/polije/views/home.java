/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package polije.views;

import javax.swing.JPanel;

/**
 *
 * @author bacht
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
    }
    
    public JPanel getPanelHome(){
        return this.panelHome;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        panelIdentitasPasien = new javax.swing.JPanel();
        logoIdentitasPasien = new javax.swing.JLabel();
        panelLabelIdentitas = new javax.swing.JPanel();
        labelIdentitasPasien = new javax.swing.JLabel();
        panelICekKondisi = new javax.swing.JPanel();
        logoKebutuhanGizi = new javax.swing.JLabel();
        panelLabelCekKondisi = new javax.swing.JPanel();
        labelCekKondisi = new javax.swing.JLabel();
        panelKebutuhanGizi = new javax.swing.JPanel();
        logoIKebutuhanGizi = new javax.swing.JLabel();
        panelLabelKebutuhanGizi = new javax.swing.JPanel();
        labelKebutuhanGizi = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHome.setBackground(new java.awt.Color(4, 30, 65));
        panelHome.setPreferredSize(new java.awt.Dimension(401, 471));

        panelIdentitasPasien.setBackground(new java.awt.Color(66, 83, 109));

        logoIdentitasPasien.setText("logo");

        labelIdentitasPasien.setBackground(new java.awt.Color(242, 255, 255));
        labelIdentitasPasien.setText("identitas Pasien");

        javax.swing.GroupLayout panelLabelIdentitasLayout = new javax.swing.GroupLayout(panelLabelIdentitas);
        panelLabelIdentitas.setLayout(panelLabelIdentitasLayout);
        panelLabelIdentitasLayout.setHorizontalGroup(
            panelLabelIdentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLabelIdentitasLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(labelIdentitasPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        panelLabelIdentitasLayout.setVerticalGroup(
            panelLabelIdentitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLabelIdentitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelIdentitasPasien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelIdentitasPasienLayout = new javax.swing.GroupLayout(panelIdentitasPasien);
        panelIdentitasPasien.setLayout(panelIdentitasPasienLayout);
        panelIdentitasPasienLayout.setHorizontalGroup(
            panelIdentitasPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIdentitasPasienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelLabelIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelIdentitasPasienLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(logoIdentitasPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelIdentitasPasienLayout.setVerticalGroup(
            panelIdentitasPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIdentitasPasienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoIdentitasPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelLabelIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelICekKondisi.setBackground(new java.awt.Color(66, 83, 109));

        logoKebutuhanGizi.setText("logo");

        labelCekKondisi.setBackground(new java.awt.Color(242, 255, 255));
        labelCekKondisi.setText("Cek Kondisi");

        javax.swing.GroupLayout panelLabelCekKondisiLayout = new javax.swing.GroupLayout(panelLabelCekKondisi);
        panelLabelCekKondisi.setLayout(panelLabelCekKondisiLayout);
        panelLabelCekKondisiLayout.setHorizontalGroup(
            panelLabelCekKondisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLabelCekKondisiLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(labelCekKondisi)
                .addGap(54, 54, 54))
        );
        panelLabelCekKondisiLayout.setVerticalGroup(
            panelLabelCekKondisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLabelCekKondisiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCekKondisi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelICekKondisiLayout = new javax.swing.GroupLayout(panelICekKondisi);
        panelICekKondisi.setLayout(panelICekKondisiLayout);
        panelICekKondisiLayout.setHorizontalGroup(
            panelICekKondisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelICekKondisiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelLabelCekKondisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelICekKondisiLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(logoKebutuhanGizi, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelICekKondisiLayout.setVerticalGroup(
            panelICekKondisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelICekKondisiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoKebutuhanGizi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelLabelCekKondisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelKebutuhanGizi.setBackground(new java.awt.Color(66, 83, 109));

        logoIKebutuhanGizi.setText("logo");

        labelKebutuhanGizi.setBackground(new java.awt.Color(242, 255, 255));
        labelKebutuhanGizi.setText("Kebutuhan Gizi");

        javax.swing.GroupLayout panelLabelKebutuhanGiziLayout = new javax.swing.GroupLayout(panelLabelKebutuhanGizi);
        panelLabelKebutuhanGizi.setLayout(panelLabelKebutuhanGiziLayout);
        panelLabelKebutuhanGiziLayout.setHorizontalGroup(
            panelLabelKebutuhanGiziLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLabelKebutuhanGiziLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(labelKebutuhanGizi, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        panelLabelKebutuhanGiziLayout.setVerticalGroup(
            panelLabelKebutuhanGiziLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLabelKebutuhanGiziLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelKebutuhanGizi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelKebutuhanGiziLayout = new javax.swing.GroupLayout(panelKebutuhanGizi);
        panelKebutuhanGizi.setLayout(panelKebutuhanGiziLayout);
        panelKebutuhanGiziLayout.setHorizontalGroup(
            panelKebutuhanGiziLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKebutuhanGiziLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelLabelKebutuhanGizi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKebutuhanGiziLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoIKebutuhanGizi, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        panelKebutuhanGiziLayout.setVerticalGroup(
            panelKebutuhanGiziLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKebutuhanGiziLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoIKebutuhanGizi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(panelLabelKebutuhanGizi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(panelIdentitasPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(panelICekKondisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelKebutuhanGizi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelIdentitasPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelICekKondisi, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(panelKebutuhanGizi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCekKondisi;
    private javax.swing.JLabel labelIdentitasPasien;
    private javax.swing.JLabel labelKebutuhanGizi;
    private javax.swing.JLabel logoIKebutuhanGizi;
    private javax.swing.JLabel logoIdentitasPasien;
    private javax.swing.JLabel logoKebutuhanGizi;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelICekKondisi;
    private javax.swing.JPanel panelIdentitasPasien;
    private javax.swing.JPanel panelKebutuhanGizi;
    private javax.swing.JPanel panelLabelCekKondisi;
    private javax.swing.JPanel panelLabelIdentitas;
    private javax.swing.JPanel panelLabelKebutuhanGizi;
    // End of variables declaration//GEN-END:variables
}
