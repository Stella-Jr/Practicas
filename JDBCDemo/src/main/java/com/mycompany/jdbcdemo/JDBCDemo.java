package com.mycompany.jdbcdemo;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo {
    
    private static final String URL = "jdbc:mysql://localhost:3306/practicasdb?serverTimezone=UTC&useSSL=false";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Demo JDBC: insertar y consultar personas ===");
        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine().trim();

        System.out.print("Ingrese edad: ");
        String edadStr = sc.nextLine().trim();
        int edad;
        
        try {
            edad = Integer.parseInt(edadStr);
        } catch (NumberFormatException e) {
            System.out.println("Edad invalida. Saliendo.");
            sc.close();
            return;
        }

        //Conexión y operacion INSERT + SELECT con try-with-resources
        String sqlInsert = "INSERT INTO personas (nombre, edad) VALUES (?, ?)";
        String sqlSelect = "SELECT id, nombre, edad FROM personas ORDER BY id";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            
            String ddl = "CREATE TABLE IF NOT EXISTS personas ("
                       + "id INT AUTO_INCREMENT PRIMARY KEY, "
                       + "nombre VARCHAR(100) NOT NULL, "
                       + "edad INT NOT NULL)";
            try (Statement st = conn.createStatement()) {
                st.execute(ddl);
            }

            
            try (PreparedStatement ps = conn.prepareStatement(sqlInsert)) {
                ps.setString(1, nombre);
                ps.setInt(2, edad);
                int filas = ps.executeUpdate();
                System.out.println("Insertado correctamente. Filas afectadas: " + filas);
            }

            
            try (PreparedStatement ps2 = conn.prepareStatement(sqlSelect);
                 ResultSet rs = ps2.executeQuery()) {
                System.out.println("\nListado de personas en la base de datos:");
                
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String n = rs.getString("nombre");
                    int e = rs.getInt("edad");
                    System.out.printf("%d - %s - %d años%n", id, n, e);
                }
            }

        } catch (SQLException ex) {
            System.out.println("Error de base de datos: " + ex.getMessage());
            ex.printStackTrace();
        }

        sc.close();
    }
}