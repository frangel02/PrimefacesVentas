package com.prinfacesventas.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * Dao
 * Date: 2/23/2019
 * Time: 8:15 PM
 * Created by frodriguez on
 */
public class Dao {

    private Connection connection;


    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void connect() throws Exception {

        try {

            Class.forName("com.mysql.jdbc.Driver");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/prinfaces_ventas?user=root&password=");

        } catch (Exception e) {
            throw e;
        }


    }

    public void close() throws SQLException {

        try{

            if(connection != null){

                if(connection.isClosed() == false){
                    connection.close();
                }
            }

        }catch(Exception e){
            throw e;
        }

    }
}
