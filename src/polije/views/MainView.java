/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package polije.views;

import polije.util.viewUtil;

/**
 *
 * @author bacht
 */
public class MainView extends javax.swing.JFrame {
//    MainView mainView = new MainView(); 
//    Login loginFrame = new Login();
    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        panelConten = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        panelDasar = new javax.swing.JPanel();
        FormLoginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userNamePanel = new javax.swing.JPanel();
        iconUsername = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        fieldUsername = new javax.swing.JTextField();
        PasswordPanel = new javax.swing.JPanel();
        iconPassword = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JTextField();
        ButtonCreateAkun = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        register = new javax.swing.JPanel();
        kebutuhanGizi = new javax.swing.JPanel();
        cekKondisi = new javax.swing.JPanel();
        identitasPasien = new javax.swing.JPanel();
        kebutuhanGizi06 = new javax.swing.JPanel();
        kebutuhanGizi911 = new javax.swing.JPanel();
        kebutuhanGizi1224 = new javax.swing.JPanel();
        kebetuhanGizi25 = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(640, 734));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton3.setText("register");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(343, Short.MAX_VALUE))
        );

        panelConten.setBackground(new java.awt.Color(4, 30, 65));
        panelConten.setPreferredSize(new java.awt.Dimension(640, 734));
        panelConten.setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 102, 0));

        panelDasar.setBackground(new java.awt.Color(4, 30, 65));

        FormLoginPanel.setBackground(new java.awt.Color(4, 125, 50));
        FormLoginPanel.setPreferredSize(new java.awt.Dimension(640, 734));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome");

        userNamePanel.setBackground(new java.awt.Color(255, 255, 255));

        iconUsername.setBackground(new java.awt.Color(255, 255, 255));
        iconUsername.setText("logo");

        labelUsername.setText("username");

        fieldUsername.setPreferredSize(new java.awt.Dimension(90, 20));

        javax.swing.GroupLayout userNamePanelLayout = new javax.swing.GroupLayout(userNamePanel);
        userNamePanel.setLayout(userNamePanelLayout);
        userNamePanelLayout.setHorizontalGroup(
            userNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userNamePanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(iconUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        userNamePanelLayout.setVerticalGroup(
            userNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userNamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(fieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelUsername)
                .addComponent(iconUsername))
        );

        PasswordPanel.setBackground(new java.awt.Color(255, 255, 255));

        iconPassword.setText("logo");

        labelPassword.setText("password");

        fieldPassword.setPreferredSize(new java.awt.Dimension(90, 20));

        javax.swing.GroupLayout PasswordPanelLayout = new javax.swing.GroupLayout(PasswordPanel);
        PasswordPanel.setLayout(PasswordPanelLayout);
        PasswordPanelLayout.setHorizontalGroup(
            PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasswordPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(iconPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PasswordPanelLayout.setVerticalGroup(
            PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(labelPassword)
                .addComponent(iconPassword))
        );

        ButtonCreateAkun.setBackground(new java.awt.Color(0, 255, 255));
        ButtonCreateAkun.setText("Create Akun");

        jButton5.setText("Login");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormLoginPanelLayout = new javax.swing.GroupLayout(FormLoginPanel);
        FormLoginPanel.setLayout(FormLoginPanelLayout);
        FormLoginPanelLayout.setHorizontalGroup(
            FormLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLoginPanelLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(FormLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FormLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLoginPanelLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(120, 120, 120)))
                    .addGroup(FormLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(FormLoginPanelLayout.createSequentialGroup()
                            .addComponent(jButton5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonCreateAkun))
                        .addComponent(PasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        FormLoginPanelLayout.setVerticalGroup(
            FormLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLoginPanelLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(userNamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(PasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(FormLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCreateAkun)
                    .addComponent(jButton5))
                .addContainerGap(352, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDasarLayout = new javax.swing.GroupLayout(panelDasar);
        panelDasar.setLayout(panelDasarLayout);
        panelDasarLayout.setHorizontalGroup(
            panelDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDasarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(FormLoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelDasarLayout.setVerticalGroup(
            panelDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormLoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDasar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDasar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        System.
        out.print(this.getHeight()+' '+ this.getWidth());

        panelConten.add(login, "card2");
        Login loginFrame = new Login(this);
        login = loginFrame.getpanel();

        register.setBackground(new java.awt.Color(102, 255, 0));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        panelConten.add(register, "card3");

        kebutuhanGizi.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout kebutuhanGiziLayout = new javax.swing.GroupLayout(kebutuhanGizi);
        kebutuhanGizi.setLayout(kebutuhanGiziLayout);
        kebutuhanGiziLayout.setHorizontalGroup(
            kebutuhanGiziLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        kebutuhanGiziLayout.setVerticalGroup(
            kebutuhanGiziLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        panelConten.add(kebutuhanGizi, "card5");

        javax.swing.GroupLayout cekKondisiLayout = new javax.swing.GroupLayout(cekKondisi);
        cekKondisi.setLayout(cekKondisiLayout);
        cekKondisiLayout.setHorizontalGroup(
            cekKondisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        cekKondisiLayout.setVerticalGroup(
            cekKondisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        panelConten.add(cekKondisi, "card6");

        javax.swing.GroupLayout identitasPasienLayout = new javax.swing.GroupLayout(identitasPasien);
        identitasPasien.setLayout(identitasPasienLayout);
        identitasPasienLayout.setHorizontalGroup(
            identitasPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        identitasPasienLayout.setVerticalGroup(
            identitasPasienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        panelConten.add(identitasPasien, "card7");

        javax.swing.GroupLayout kebutuhanGizi06Layout = new javax.swing.GroupLayout(kebutuhanGizi06);
        kebutuhanGizi06.setLayout(kebutuhanGizi06Layout);
        kebutuhanGizi06Layout.setHorizontalGroup(
            kebutuhanGizi06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        kebutuhanGizi06Layout.setVerticalGroup(
            kebutuhanGizi06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        panelConten.add(kebutuhanGizi06, "card8");

        javax.swing.GroupLayout kebutuhanGizi911Layout = new javax.swing.GroupLayout(kebutuhanGizi911);
        kebutuhanGizi911.setLayout(kebutuhanGizi911Layout);
        kebutuhanGizi911Layout.setHorizontalGroup(
            kebutuhanGizi911Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        kebutuhanGizi911Layout.setVerticalGroup(
            kebutuhanGizi911Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        panelConten.add(kebutuhanGizi911, "card9");

        javax.swing.GroupLayout kebutuhanGizi1224Layout = new javax.swing.GroupLayout(kebutuhanGizi1224);
        kebutuhanGizi1224.setLayout(kebutuhanGizi1224Layout);
        kebutuhanGizi1224Layout.setHorizontalGroup(
            kebutuhanGizi1224Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        kebutuhanGizi1224Layout.setVerticalGroup(
            kebutuhanGizi1224Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        panelConten.add(kebutuhanGizi1224, "card10");

        javax.swing.GroupLayout kebetuhanGizi25Layout = new javax.swing.GroupLayout(kebetuhanGizi25);
        kebetuhanGizi25.setLayout(kebetuhanGizi25Layout);
        kebetuhanGizi25Layout.setHorizontalGroup(
            kebetuhanGizi25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        kebetuhanGizi25Layout.setVerticalGroup(
            kebetuhanGizi25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );

        panelConten.add(kebetuhanGizi25, "card11");

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

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        );

        panelConten.add(home, "card11");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelConten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        viewUtil.setSideBar(panelConten, login);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        viewUtil.setSideBar(panelConten, register);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        home home = new home();
        viewUtil.setSideBar(panelConten, home.getPanelHome());
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        Register register = new Register();
        viewUtil.setSideBar(panelConten, register.getPanelRegister());
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        System.out.println("tinggi: "+ this.getHeight());
        System.out.println("lebar: "+this.getWidth());
            viewUtil.setSideBar(panelConten, register);
        
//        viewUtil.changePanel(panelConten, home);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainView mainView = new MainView();
               
                viewUtil.setSideBar(mainView.panelConten, mainView.login);
                mainView.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCreateAkun;
    private javax.swing.JPanel FormLoginPanel;
    private javax.swing.JPanel PasswordPanel;
    private javax.swing.JPanel cekKondisi;
    private javax.swing.JTextField fieldPassword;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JPanel home;
    private javax.swing.JLabel iconPassword;
    private javax.swing.JLabel iconUsername;
    private javax.swing.JPanel identitasPasien;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel kebetuhanGizi25;
    private javax.swing.JPanel kebutuhanGizi;
    private javax.swing.JPanel kebutuhanGizi06;
    private javax.swing.JPanel kebutuhanGizi1224;
    private javax.swing.JPanel kebutuhanGizi911;
    private javax.swing.JLabel labelCekKondisi;
    private javax.swing.JLabel labelIdentitasPasien;
    private javax.swing.JLabel labelKebutuhanGizi;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPanel login;
    private javax.swing.JLabel logoIKebutuhanGizi;
    private javax.swing.JLabel logoIdentitasPasien;
    private javax.swing.JLabel logoKebutuhanGizi;
    private javax.swing.JPanel panelConten;
    private javax.swing.JPanel panelDasar;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelICekKondisi;
    private javax.swing.JPanel panelIdentitasPasien;
    private javax.swing.JPanel panelKebutuhanGizi;
    private javax.swing.JPanel panelLabelCekKondisi;
    private javax.swing.JPanel panelLabelIdentitas;
    private javax.swing.JPanel panelLabelKebutuhanGizi;
    private javax.swing.JPanel register;
    private javax.swing.JPanel userNamePanel;
    // End of variables declaration//GEN-END:variables
}
