package servlets;

import models.Facultate;
import repositories.FacultateRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/facultati")
public class FacultateServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("facultati.jsp").forward(req,resp);

//        String oras = req.getParameter("oras");
//        if (oras==null) {
//            resp.getWriter().println("oras parameter missing");
//        }
//        else {
//            try {
//                List<Facultate> facultati = FacultateRepository.findByOras(oras);
//
//                for (Facultate facultate : facultati) {
//                    resp.getWriter().println(facultate);
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String line = req.getReader().readLine();
        line = URLDecoder.decode(line);
        System.out.println(line);

        String oras;
        if (line.contains("=") && line.split("=").length == 2) {
            oras = line.split("=")[1];
            try {
                req.setAttribute("facultati", FacultateRepository.findByOras(oras));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        req.getRequestDispatcher("facultati.jsp").forward(req,resp);
    }
}
