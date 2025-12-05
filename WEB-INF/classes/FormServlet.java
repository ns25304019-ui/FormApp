import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");

        String fullname = req.getParameter("fullname");
        String telephone = req.getParameter("tel");

        req.setAttribute("fullname", fullname);
        req.setAttribute("tel", telephone);

        RequestDispatcher dispatcher = req.getRequestDispatcher("formresult");

        dispatcher.forward(req, res);
    }
}