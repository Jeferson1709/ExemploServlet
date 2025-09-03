package br.senac.tads.dsw.exemplo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "ExemploServLet" , urlPatterns = {"/exemplo-servlet"})
public class ExemploServLet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
    if (nome  == null){
        nome = "visitantes";
    }
    resp.setContentType("text/html; charset=UTF-8");
    resp.getWriter().println("<DOCTYPE html>");
    resp.getWriter().println("<html>");
    resp.getWriter().println("<head> <title> Exemplo ServLet </title> </head>");
    resp.getWriter().println("<body>");
    resp.getWriter().println("<h1> Olá, "+ nome +"! </h1>");
    resp.getWriter().println("</body>");

    resp.getWriter().println("</html>");

    }
}
