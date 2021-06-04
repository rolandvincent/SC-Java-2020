package sc_gui1.view;

import Database.db;
import javax.swing.JOptionPane;

public class SC_GUI1 {
    public static void main(String[] args) {
        if (db.getConnection() == null){
            JOptionPane.showMessageDialog(null, "Gagal koneksi ke server MySQL, periksa apakah server MySQL sudah berjalan!", "Error SQL", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        // TODO code application logic here
        viewLogin login = new viewLogin();
        login.setVisible(true);
    }
    
}
