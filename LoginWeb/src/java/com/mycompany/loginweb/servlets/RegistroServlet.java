package com.mycompany.loginweb.servlets;

import com.mycompany.loginweb.dao.UsuarioDAO;
import com.mycompany.loginweb.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registrar")
public class RegistroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombreUsuario = request.getParameter("nombre_usuario");
        String clave = request.getParameter("clave");
        String nombreCompleto = request.getParameter("nombre_completo");

        Usuario usuario = new Usuario(nombreUsuario, clave, nombreCompleto);

        UsuarioDAO dao = new UsuarioDAO();
        boolean registrado = dao.registrarUsuario(usuario);

        response.setContentType("text/html;charset=UTF-8");

        if (registrado) {
            response.getWriter().println("<h2>Registro exitoso </h2>");
            response.getWriter().println("<a href='index.jsp'>Volver al login</a>");
        } else {
            response.getWriter().println("<h2>Error al registrar usuario </h2>");
            response.getWriter().println("<a href='registro.jsp'>Volver</a>");
        }
    }
}