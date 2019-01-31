/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gEtudiant;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.JOptionPane;

/**
 *
 * @author AbdeAMNR
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    static String userAuthority;
    private boolean test = false;
    jdbcManager cnx = new jdbcManager();

    /*-----------------Constricteur-----------------*/
    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelInscription.setVisible(false);
        this.setSize(819, 400);
        this.txtUser.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnConnect = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        cbxUserType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnInscription = new javax.swing.JButton();
        panelInscription = new javax.swing.JPanel();
        txtUserInsc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAppliquer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtGrantedKey = new javax.swing.JTextField();
        txtPassInsc = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Système de gestion des étudiants - se connecter");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("©2017 Designed and Developed by Abderrahim AMANAR");

        txtUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Nom utilisateur:");

        btnExit.setBackground(new java.awt.Color(252, 74, 26));
        btnExit.setText("EXIT");
        btnExit.setBorderPainted(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnConnect.setBackground(new java.awt.Color(252, 74, 26));
        btnConnect.setText("connecter");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(252, 74, 26));
        btnCancel.setText("Annuler");
        btnCancel.setPreferredSize(new java.awt.Dimension(89, 25));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Mot de passe:");

        cbxUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrateur", "Etudiant" }));
        cbxUserType.setPreferredSize(new java.awt.Dimension(82, 25));

        jLabel5.setText("Vous êtes :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConnect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(208, 208, 208))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(186, 186, 186)))
                        .addComponent(jLabel5)
                        .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                        .addComponent(txtPass)
                        .addComponent(cbxUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GestionEtudiant2017/myFiles/logo 2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );

        btnInscription.setText("Inscription");
        btnInscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscriptionActionPerformed(evt);
            }
        });

        panelInscription.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtUserInsc.setPreferredSize(new java.awt.Dimension(150, 25));

        jLabel6.setText("Nom utilisateur:");

        jLabel7.setText("Mot de passe:");

        btnAppliquer.setText("Appliquer");
        btnAppliquer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppliquerActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("- minimum 8 caractères\n- des chiffres, des lettres majuscules et minuscules\n- pas de combinaisons en séquences \n- pas de lettres voisines sur le clavier \n  comme « azertyui» ou « 12345678 »\n\nUn exemple :\nLa grand-mère mange les pissenlits par la racine\nCe qui donne : Lgmmlpplr\nOn ajoute chiffres et symboles : Lgmm776lpplr\n");
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel8.setText("Choisir un bon mot de passe sécurisé"); // NOI18N

        jLabel9.setText("GrantedKey (For Administrator)");

        txtGrantedKey.setPreferredSize(new java.awt.Dimension(150, 25));

        javax.swing.GroupLayout panelInscriptionLayout = new javax.swing.GroupLayout(panelInscription);
        panelInscription.setLayout(panelInscriptionLayout);
        panelInscriptionLayout.setHorizontalGroup(
            panelInscriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInscriptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInscriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInscriptionLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelInscriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addGroup(panelInscriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAppliquer, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInscriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtGrantedKey, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserInsc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtPassInsc))
                        .addGap(72, 72, 72))
                    .addGroup(panelInscriptionLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelInscriptionLayout.setVerticalGroup(
            panelInscriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInscriptionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelInscriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelInscriptionLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserInsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassInsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGrantedKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAppliquer))
                    .addGroup(panelInscriptionLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInscription)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelInscription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInscription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnInscription))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*-----------------EXIT button-----------------*/
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed
    /*-----------------connecter button-----------------*/
    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        String UserCnx = this.txtUser.getText();
        String PassCnx = this.txtPass.getText();
        userAuthority = this.cbxUserType.getSelectedItem().toString();

        String user = null;
        String pass = null;
        String userType = null;

        if (!isNullOrWhiteSpace(UserCnx) && !isNullOrWhiteSpace(PassCnx)) {
            if (UserCnx.contains("'")) {
                UserCnx = UserCnx.replaceAll("'", "\\'");
            }
            try {
                String rq = "SELECT * FROM logininfo where username= ?";
                System.out.println(rq);
                PreparedStatement stmt = cnx.obtenirconnexion().prepareStatement(rq);
                stmt.setString(1, UserCnx);
                ResultSet rs = stmt.executeQuery();
                if (rs.first()) {
                    user = rs.getString("username");
                    pass = rs.getString("pass");
                    userType = rs.getString("usertype");
                    if (user.equals(UserCnx)
                            && pass.equals(PassCnx)
                            && userType.equals(this.cbxUserType.getSelectedItem().toString())) {
                        this.setVisible(false);
                        EtudiantInfos eInfos = new EtudiantInfos();
                        eInfos.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Mot de passe incorrect ou niveau d'autorité sélectionné non accordé", "Problème de connexion", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "no user", "Etat de L'operation", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Champ vide", "Avertissement", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConnectActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.txtUser.setText("");
        this.txtPass.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnInscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscriptionActionPerformed
        if (test == false) {
            test = true;
            panelInscription.setVisible(true);
            this.setSize(819, 670);
        } else if (test == true) {
            this.test = false;
            panelInscription.setVisible(false);
            this.setSize(819, 400);
        }
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnInscriptionActionPerformed

    public static boolean isNullOrWhiteSpace(String str) {
        String chaine = str.trim();
        if (chaine.isEmpty() || chaine == null) {
            return true;
        }
        return false;
    }

    public static boolean quote(String txt) {
        if (txt.contains("'")) {
            txt = txt.replaceAll("'", "//'");
        }
        return true;
    }

    public static boolean isNullOrOnlySpace(String[] str) {
        for (int i = 0; i < str.length; i++) {
            String s = str[i].trim();
            if (s.isEmpty() || s == null) {
                return true;
            }
        }
        return false;
    }


    private void btnAppliquerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppliquerActionPerformed

        String UserInsc = this.txtUserInsc.getText();
        String PassInsc = this.txtPassInsc.getText();
        String GrantedKey = this.txtGrantedKey.getText();;

        if (!isNullOrWhiteSpace(UserInsc) && !isNullOrWhiteSpace(PassInsc)) {
            if (UserInsc.contains("'")) {
                UserInsc = UserInsc.replaceAll("\'", "''");
            }
            /*===========Inscription Etudiant===========*/
            if (isNullOrWhiteSpace(GrantedKey)) {
                String rqt = "INSERT INTO loginInfo(username,pass,usertype,GrantedKey)"
                        + " VALUES('" + UserInsc + "','" + PassInsc + "','Etudiant','')";
                System.out.println(">abde: checkin' query \n" + rqt);
                cnx.update(rqt);
                JOptionPane.showMessageDialog(null, "Inscription est bien effectuer ", "Nivaux de l’autorité: Etudiant ", JOptionPane.INFORMATION_MESSAGE);
            } else {
                /*===========Inscription Administrator===========*/
                if (GrantedKey.equals("Granted")) {
                    cnx.update("INSERT INTO loginInfo(username,pass,usertype,GrantedKey)"
                            + " VALUES('" + UserInsc + "','" + PassInsc + "','Administrateur','Granted')");
                    JOptionPane.showMessageDialog(null, "Inscription est bien effectuer ", "Nivaux de l’autorité: Administrateur ", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Cette clé n'est pas accordée", "Nivaux de l’autorité: Administrateur ", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Champ vide où il n'y a que des espaces", "Invalide", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAppliquerActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginFrame lf = new LoginFrame();
                lf.setVisible(true);
                //    lf.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppliquer;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInscription;
    private javax.swing.JComboBox<String> cbxUserType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panelInscription;
    private javax.swing.JTextField txtGrantedKey;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPassInsc;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtUserInsc;
    // End of variables declaration//GEN-END:variables
}