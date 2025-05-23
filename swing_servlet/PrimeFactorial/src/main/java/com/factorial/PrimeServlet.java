// 6c. Build a servlet program to check the given number is prime number or not using HTML with step
// by step procedure.


package com.factorial;


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));
            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // HTML response
            out.println("<html>");
            out.println("<head><title>Prime Checker Result</title></head>");
            out.println("<body>");
            out.println("<h2>Prime Number Checker Result</h2>");
            out.println("<p>Entered Number: " + number + "</p>");
            if (isPrime) {
                out.println("<p style='color:green;'>" + number + " is a Prime Number.</p>");
            } else {
                out.println("<p style='color:red;'>" + number + " is NOT a Prime Number.</p>");
            }
            out.println("<a href='index.html'>Check Another Number</a>");
            out.println("</body>");
            out.println("</html>");
        } catch (NumberFormatException e) {
            out.println("<p style='color:red;'>Invalid input. Please enter a valid integer.</p>");
            out.println("<a href='index.html'>Try Again</a>");
        }
    }
}
