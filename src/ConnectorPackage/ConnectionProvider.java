/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectorPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author vivek
 */
public class ConnectionProvider {
    public static  Connection getcon(){
        try{
            // Class.forName("com.mysql.jdbc.Driver");
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentResultSystem", "root", "vivek@1994");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
           return null; 
        }
    }
}
