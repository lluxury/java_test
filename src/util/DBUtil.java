package util;

import anno.JDBCConfig;

@JDBCConfig(ip = "192.168.142.10", database = "test", encoding = "UTF-8", loginName = "root", password = "admin")
public class DBUtil {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}