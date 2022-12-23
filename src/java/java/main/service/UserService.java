package main.service;

import main.dao.Dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

public class UserService {

    private static int id = 0;
    private static String first_name = null;
    private static String last_name = null;
    private static Date birth_date = null;
    private static int version = 0;

    public static void CreateUser() throws SQLException, IOException {
        Dao.save_user(first_name, last_name, String.valueOf(birth_date), version);
    }
}
