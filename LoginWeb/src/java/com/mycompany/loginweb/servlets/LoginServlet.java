package com.mycompany.loginweb.servlets;

import com.mycompany.loginweb.dao.UsuarioDAO;
import com.mycompany.loginweb.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombreUsuario = request.getParameter("nombre_usuario");
        String clave = request.getParameter("clave");

        UsuarioDAO dao = new UsuarioDAO();
        Usuario usuario = dao.validarLogin(nombreUsuario, clave);

        if (usuario != null) {
          
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuario);

            response.sendRedirect("home.jsp");
        } else {
            response.getWriter().println("<h2>Usuario o clave incorrectos</h2>");
            response.getWriter().println("<a href='index.jsp'>Intentar nuevamente</a>");
        }
    }
}