package servlets;

import models.Student;
import repositories.StudentRepository;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/studenti")
public class StudentServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Map<String, String> map = new HashMap<>();

        String linie;
        while ((linie = req.getReader().readLine())!=null) {
            map.put(linie.split("=")[0], linie.split("=")[1]);
        }

        Student student = new Student(
                map.get("nume"),
                map.get("username"),
                Integer.parseInt(map.get("idFacultate"))
        );

        try {
            if (StudentRepository.findByUsername(map.get("username")) != null)
            {
                resp.getWriter().println("Exista deja un user in baza de date");
            } else {
                StudentRepository.save(student);
                resp.getWriter().println("Username-ul a fost creat");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
