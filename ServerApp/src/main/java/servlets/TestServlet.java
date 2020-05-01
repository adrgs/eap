package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/laborator")
public class TestServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.getRequestDispatcher("page1.jsp").forward(req, resp);
        //resp.getWriter().println("Mesaj din metoda");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//        String name = req.getParameter("name");
//        PrintWriter writer =  resp.getWriter();
//        writer.println("Hello " + name);
//
//        Map<String, Object> map = new HashMap<>();
//
//
//        String linie;
//        while ((linie = req.getReader().readLine())!=null) {
//            map.put(linie.split("=")[0], linie.split("=")[1]);
//        }
//
//        System.out.println(map);

        String line = req.getReader().readLine();
        line = URLDecoder.decode(line);
        System.out.println(line);

        if (line.contains("=") && line.split("=").length == 2) {
            line = line.split("=")[1];
            req.setAttribute("mesaj", line);
        }

        req.getRequestDispatcher("page1.jsp").forward(req, resp);
    }

}
