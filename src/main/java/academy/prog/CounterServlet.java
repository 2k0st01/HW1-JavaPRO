package academy.prog;

import academy.prog.users.DataSave;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterServlet extends HttpServlet {
    public CounterServlet() {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String answer = request.getParameter("gender");
        String answer2 = request.getParameter("animal");
        HttpSession session = request.getSession(true);
        DataSave dataSave = (DataSave) session.getAttribute("dataSave");
        if (dataSave == null) {
            dataSave = new DataSave();
            session.setAttribute("dataSave", dataSave);
        }
        if ("male".equals(answer)) {
            dataSave.incrementMale();
        } else {
            dataSave.incrementFemale();
        }
        if ("cat".equals(answer2)) {
            dataSave.incrementCat();
        } else {
            dataSave.incrementDog();
        }
        session.setAttribute("dataSave", dataSave);
        doGet(request,response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String a = request.getParameter("a");
        HttpSession session = request.getSession(true);
        DataSave dataSave = (DataSave) session.getAttribute("dataSave");
        if ("reset".equals(a)) {
            dataSave.setMale(new AtomicInteger(0));
            dataSave.setFemale(new AtomicInteger(0));
            dataSave.setCat(new AtomicInteger(0));
            dataSave.setDog(new AtomicInteger(0));
            response.sendRedirect("result");
        } else {
            request.setAttribute("male", dataSave.getMale());
            request.setAttribute("female", dataSave.getFemale());
            request.setAttribute("cat", dataSave.getCat());
            request.setAttribute("dog", dataSave.getDog());

            RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            }
        }
    }

}
