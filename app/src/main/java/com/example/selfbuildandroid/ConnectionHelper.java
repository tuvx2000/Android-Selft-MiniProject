package com.example.selfbuildandroid;

import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionHelper {

        private static final String LOG = "DEBUG";
        private static final String port = "1433";
        private static final String db = "xuantudb.cmxxavfzjxrv.ap-northeast-1.rds.amazonaws.com";
        private static final String DBname = "WebProject";
        private static final String username = "xuantuDB";
        private static final String password = "xuantuDB";
        public static Connection connectclass() {
            Connection conn = null;

            String ConnURL;
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                String connectionUrl =
                        "jdbc:sqlserver://"+ db +":1433/"
                                +  DBname+ "?"
                                + "user=" + username +"&"
                                + "password=" + password;



                conn = DriverManager.getConnection(connectionUrl);
            } catch (SQLException e) {
                Log.d(LOG, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

                Log.d(LOG, e.getMessage());

            } catch (ClassNotFoundException e) {
                Log.d(LOG, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

                Log.d(LOG, e.getMessage());
            }




            return conn;
        }

}
