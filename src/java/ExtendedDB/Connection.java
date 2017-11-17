package ExtendedDB;


import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mravenec
 */
public class Connection {

    public static java.sql.Connection conn = null;

    public static java.sql.Connection connect() {
        try {
            String dbURL = "jdbc:sqlserver://DESKTOP-0BR1UC1\\MRAVENECSQL:1433; databaseName=MravenecDB;user=MravenecSQL;password=sprchovat";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            //Get a connection
            conn = DriverManager.getConnection(dbURL);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}