package com.worldpopulation;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    //Connection
    //Statement/PreparedStatement
    //ResultSet

    private Connection getConnection(String ipaddress, int portno, String dbname, String username, String password) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + ipaddress + ":" + portno + "/" + dbname, username,
                    password);
            System.out.println("Successful Connection");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Connection con = m.getConnection("localhost", 3306, "world_population",
                "root", "");
    }
}