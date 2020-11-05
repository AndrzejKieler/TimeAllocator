package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.NoteGetService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="Hello", urlPatterns = {"/api/*"})
public class TimeAllocatorServlet extends HttpServlet {
    private Logger logger = LoggerFactory.getLogger(TimeAllocatorServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Request got");
        String id = req.getParameter("note");
        if (id != null) {
            String name = NoteGetService.noteGetService.getById(id);
            resp.getWriter().write("Witaj "+ name +"u!");
        }
        else resp.getWriter().write("Siemson Brdolson!");
    }
}
