package com.mycompany.loginweb.dao;

import com.mycompany.loginweb.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public boolean registrarUsuario(Usuario usuario) {

        String sql = "INSERT INTO usuarios (nombre_usuario, clave_hash, nombre_completo) VALUES (?, ?, ?)";

        ConexionBD conexion = new ConexionBD();  

        try (Connection conn = conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNombreUsuario());
            stmt.setString(2, usuario.getClave());
            stmt.setString(3, usuario.getNombreCompleto());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
            return false;
        }
    }

    public Usuario validarLogin(String nombreUsuario, String clave) {

        String sql = "SELECT * FROM usuarios WHERE nombre_usuario = ? AND clave_hash = ?";

        ConexionBD conexion = new ConexionBD();

        try (Connection conn = conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombreUsuario);
            stmt.setString(2, clave);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setNombreUsuario(rs.getString("nombre_usuario"));
                u.setClave(rs.getString("clave_hash"));
                u.setNombreCompleto(rs.getString("nombre_completo"));
                return u;
            }

        } catch (SQLException e) {
            System.out.println("Error al validar login: " + e.getMessage());
        }

        return null;
    }
}