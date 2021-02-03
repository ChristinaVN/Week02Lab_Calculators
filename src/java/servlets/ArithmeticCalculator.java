
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String result;
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        boolean isInt = true;
        try { 
            Integer.parseInt(first); 
            Integer.parseInt(second); 
	} 
        catch(Exception e) { 
            isInt = false; 
        }
        
        if (first.length() == 0 || second.length() == 0 || !isInt) {
            result = "invalid";
        }
        
        else {
            result = "Unknown";
        }
        
        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
    }
}
