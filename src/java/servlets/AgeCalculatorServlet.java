
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        
        boolean isInt = true;
        try { 
            Integer.parseInt(age); 
	} 
        catch(Exception e) { 
            isInt = false; 
        }
        
        if (age.length() == 0)  {
            getServletContext().getRequestDispatcher("/WEB-INF/empty.jsp").forward(request, response);
        }
        else if (isInt)  {
            int intAge = Integer.parseInt(age)+ 1;
            request.setAttribute("age", intAge);
            getServletContext().getRequestDispatcher("/WEB-INF/nextBirthday.jsp").forward(request, response);
        }
        else    {
            getServletContext().getRequestDispatcher("/WEB-INF/invalid.jsp").forward(request, response);
        }
    }
}
    