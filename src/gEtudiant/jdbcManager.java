/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gEtudiant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AbdeAMNR
 */
public class jdbcManager {

    private static Connection conn;

    public jdbcManager() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Erreur Driver  ", "Etat de L'opération", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(jdbcManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        //===================================================================
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentManagementSys", "root", "");
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Erreur Connection Base de donnée", "Etat de L'opération", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(jdbcManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   public Connection obtenirconnexion() {
        return conn;
    }

    public boolean dbClose() {
        try {
            if (!conn.isClosed() || conn != null) {
                conn.close();
                return true;
            }
        } catch (SQLException e) {
            return false;
        }
        return false;
    }

    public boolean isDbConnected() {
        try {
            if (!conn.isClosed() || conn != null) {
                javax.swing.JOptionPane.showMessageDialog(null, "successfully connected to the database abde ", "Etat de L'opération", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        } catch (SQLException e) {
            return false;
        }
        return false;
    }

    public ResultSet select(String req) {

        Statement s = null;
        ResultSet rs = null;
        try {
            s = conn.createStatement();
            rs = s.executeQuery(req);
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Erreur get data", "Etat de L'op�ration", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(jdbcManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public int update(String req) {
        int i = 0;
        try {
            Statement s = conn.createStatement();
            i = s.executeUpdate(req);
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return i;
    }

    public java.io.InputStream getUserImage(String req) throws Exception {
        java.io.InputStream istreamImage = null;
        // String req = "SELECT Photo FROM TABLE_UTILISATEUR WHERE IDUTILISATEUR ="+IdUtilisateur;
        //Connection conn = sopro.SoproConnectionManager.getMyConnection();
        ResultSet resultSet1 = conn.createStatement().executeQuery(req);
        if (resultSet1.next()) {
            istreamImage = resultSet1.getBinaryStream("Photo");
        }

        return istreamImage;
    }
    /**
     * public static void main(String[] arg) { try { jdbcManager c = new
     * jdbcManager(); c.update("insert into etudiant values(16,'toto','coco')");
     * ResultSet rs = c.select("select * from etudiant"); while (rs.next()) {
     * System.out.println( "Cne:" + rs.getString(1) + " Nom:" +
     * rs.getString("Nom") + " Prenom:" + rs.getString(3)); } } catch
     * (SQLException ex) {
     * Logger.getLogger(jdbcManager.class.getName()).log(Level.SEVERE, null,
     * ex); } }
     *
     */
}
