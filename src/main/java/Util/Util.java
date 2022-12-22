package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/javastudy";  //"db.url";
    private static final String LOGIN = "root";//"db.username";
    private static final String PASSWORD = "pass";//"db.password";
    static Connection connection = null;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
        } catch (SQLException e) {
            System.out.println("<<<Util getConnection()>>> Ошибка подключения");
            e.printStackTrace();
        }
        return connection;
    }

    private static void loadDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("<<<Util>>> \"com.mysql.cj.jdbc.Driver\"" + e);
            throw new RuntimeException(e);
        }
    }
}