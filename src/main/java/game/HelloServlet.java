package game;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/hello")
public class HelloServlet extends HttpServlet
{
    private static final Logger LOGGER = LogManager.getLogger(HelloServlet.class);
    private final String path = "/WEB-INF/views/play.jsp";
    private String stateString = "Ты потерял память. Принять вызов НЛО?";
    private String answerYes = "Принять вызов НЛО?";
    private String answerNo = "Отклонить вызов НЛО?";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        LOGGER.info("User Name is: " + name);
        HttpSession session = req.getSession(true);
        LOGGER.info("User`s Session iD: " + session.getId());
        session.setAttribute("name", name);
        session.setAttribute("stateString", stateString);
        LOGGER.info("User`s stateString: " + stateString);
        req.setAttribute("stateString", stateString);
        req.setAttribute("answerYes", answerYes);
        req.setAttribute("answerNo", answerNo);
        getServletContext().getRequestDispatcher(path).forward(req, resp);
        LOGGER.warn("request and response " + req + resp.toString());
    }
}
