import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/items")
public class ItemServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Abacaxi");
        listaFrutas.add("Banana");
        listaFrutas.add("Caja");
        listaFrutas.add("Damasco");

        // Adicionamos o atributo Lista de frutas à requisição
        req.setAttribute("listaFrutas", listaFrutas);

        /* Usamos um requestDispatcher, que age como um carregador(dispatcher),
        para o path onde queremos que a requisição seja processada*/
        RequestDispatcher dispatcher = req.getRequestDispatcher("items.jsp");

        // Usando o dispatcher enviamos a requisição para o path selecionado items.jsp
        dispatcher.forward(req, resp);
    }
}
