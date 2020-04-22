package servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/laborator")
public class TestServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        PrintWriter writer =  resp.getWriter();
        writer.println("Hello " + name);
        writer.println(Integer.parseInt(req.getParameter("age")) + 7);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        PrintWriter writer =  resp.getWriter();
        writer.println("Hello " + name);

        Map<String, Object> map = new HashMap<>();


        String linie;
        while ((linie = req.getReader().readLine())!=null) {
            map.put(linie.split("=")[0], linie.split("=")[1]);
        }

        System.out.println(map);
    }

}
