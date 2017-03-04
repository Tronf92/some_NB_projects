/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testsql;
import java.sql.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Ady
 */
public class Testsql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //DRIVER={SQL Server};SERVER=localhost, 1433;DATABASE=firme;UID=adrian;PWD=blabla
        try{
            String url = "jdbc:sqlserver://localhost:1433";
            String user = "adrian";
            String pass = "blabla";
            //Class.forName("com.sqlserver.jdbc.SQLServerDriver").newInstance();
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            
            String SQL = "SELECT * FROM db_owner.Lista";
            ResultSet res = stmt.executeQuery(SQL);
            System.out.println(res);
            if(res.next()){
                String id = res.getString("Nume");
                System.out.println(id);
            }
		  } catch (SQLException e) {
                      System.out.println(e.getMessage());
		  }
    

    }
    
}
