package academy.prog;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class CounterServlet extends HttpServlet {
    private final AtomicInteger temp1 = new AtomicInteger(0);
    private final AtomicInteger temp2 = new AtomicInteger(0);

    public CounterServlet() {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String answer = request.getParameter("gender");
        if ("male".equals(answer)) {
            temp1.incrementAndGet();
        } else {
            temp2.incrementAndGet();
        }
            doGet(request, response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("a");
        if ("reset".equals(action)) {
            temp1.set(0);
            temp2.set(0);
            response.sendRedirect("vote");
        } else {
            request.setAttribute("male", temp1.get());
            request.setAttribute("female", temp2.get());

            RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            }
        }
    }

}
