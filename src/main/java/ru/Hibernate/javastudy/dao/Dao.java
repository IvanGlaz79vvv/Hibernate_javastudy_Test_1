package ru.Hibernate.javastudy.dao;

import Util.Util;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.Date;

public class Dao {

    private static final Connection conn = Util.getConnection();
    private final String CREATE_USER = "INSERT INTO contact " +
            "(first_name" +
            ", last_name" +
            ", birt_date" +
            ", version) value (?, ? , ?, ?)";

    /*Java.util.Класс Date в Java представляет определенный момент времени (например, 25 ноября 2013 года, 16:30:45 с точностью до миллисекунд), но тип данных DATE в базе данных представляет только дату (например, 25 ноября 2013 года).). Чтобы вы не могли предоставить java.util.Объект Date в БД по ошибке Java не позволяет вам устанавливать параметр SQL в java.util.Дата напрямую:

     PreparedStatement st = ...
     java.util.Date d = ...
     st.setDate(1, d); //will not work
     Но это все равно позволяет вам делать это принудительно / намеренно (тогда часы и минуты будут игнорироваться драйвером БД). Это делается с помощью класса java.sql.Date:

     PreparedStatement st = ...
     java.util.Date d = ...
     st.setDate(1, new java.sql.Date(d.getTime())); //will work
     Объект java.sql.Date может хранить момент времени (так что его легко создать из java.util.Date), но выдаст исключение, если вы попытаетесь запросить у него часы (чтобы обеспечить соблюдение его концепции только даты). Ожидается, что драйвер БД распознает этот класс и просто использует 0 для часов. Попробуйте это:

     public static void main(String[] args) {
     java.util.Date d1 = new java.util.Date(12345);//ms since 1970 Jan 1 midnight
     java.sql.Date d2 = new java.sql.Date(12345);
     System.out.println(d1.getHours());
     System.out.println(d2.getHours());
     }
     */
    public static  void save_user(String first_name, String last_name, Data date, )

}

