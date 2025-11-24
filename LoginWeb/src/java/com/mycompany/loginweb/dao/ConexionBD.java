package com.mycompany.loginweb.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConexionBD {

    private static DataSource dataSource;

    static {
        try {
            Context ctx = new InitialContext();
            dataSource = (DataSource) ctx.lookup("jdbc/MySQLPool");
        } catch (NamingException e) {
            throw new RuntimeException("No se pudo encontrar jdbc/MySQLPool: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException("Error obteniendo conexión: " + e.getMessage());
        }
    }
}