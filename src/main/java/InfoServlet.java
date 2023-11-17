import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/ProcessForm")
public class InfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("templates/FormPage.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws IOException {
        String nome = req.getParameter( "nome");
        String email = req.getParameter( "email");

        response.setContentType( "text/html;charset=UTF-8" );
        response.getWriter().println( "<html><head><title>Dados Recebidos</title></head><body>" );
        response.getWriter().println( "<h2>Dados Recebidos:</h2>" );
        response.getWriter().println( "<p>Nome: " + nome + "</p>");
        response.getWriter().println( "<p>Email: " + email + "</p>");
        response.getWriter().println( "</body></html>");
    }
}