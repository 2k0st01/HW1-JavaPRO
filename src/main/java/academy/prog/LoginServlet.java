package academy.prog;

import academy.prog.users.DataSave;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoginServlet extends HttpServlet {
    private static final List<DataSave> accounts = new ArrayList<>();
    private static DataSave ac1 = new DataSave("user", "pass");
    private static DataSave ac2 = new DataSave("admin", "pass");
    private static DataSave ac3 = new DataSave("bot", "pass");
    static {
        accounts.add(ac1);
        accounts.add(ac2);
        accounts.add(ac3);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String login = request.getParameter("login");
        String pass = request.getParameter("password");

        for (DataSave ac : accounts) {
            if (ac.getLogin().equals(login) && ac.getPassword().equals(pass)) {
                HttpSession session = request.getSession(true);
                session.setAttribute("user_login", login);
                session.setAttribute("dataSave", ac);
            }
        }
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String a = request.getParameter("a");
        HttpSession session = request.getSession(false);

        if ("exit".equals(a) && (session != null))
            session.removeAttribute("user_login");
        response.sendRedirect("index.jsp");
    }
}
