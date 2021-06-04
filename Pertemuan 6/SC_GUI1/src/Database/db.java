/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class db {
    
    public static Connection koneksi;
    
    public static Connection getConnection(){
        if (koneksi == null){
            try{
                koneksi = DriverManager.getConnection("jdbc:mysql://localhost/tokopedia", "root","");
            }catch(SQLException sqlex){
                System.out.println(sqlex.getMessage());
            }
        }
        return koneksi;
    }
    
}
