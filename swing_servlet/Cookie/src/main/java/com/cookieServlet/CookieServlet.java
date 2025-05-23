
// 6b. Build a servlet program to create a cookie to get your name through text box and press submit
// button( through HTML) to display the message by greeting Welcome back your name ! , you have
// visited this page n times ( n = number of your visit ) and demonstrate the expiry of cookie also.



package com.cookieServlet;

// Required imports for Jakarta EE 9+
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    // Step 3: Handle GET requests
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Step 4: Create or retrieve cookies
        String userName = request.getParameter("userName");
        if (userName != null && !userName.isEmpty()) {
            // Create a new cookie
            Cookie userCookie = new Cookie("user", userName);
            userCookie.setMaxAge(60); // Cookie expires in 1 minute
            userCookie.setPath("/");
            response.addCookie(userCookie);
        }

        // Step 5: Read existing cookies
        Cookie[] cookies = request.getCookies();
        String existingUser = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("user".equals(cookie.getName())) {
                    existingUser = cookie.getValue();
                    break;
                }
            }
        }

        // Step 6: Session-based visit counter
        HttpSession session = request.getSession();
        Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            count = 1;
        } else {
            count++;
        }
        session.setAttribute("count", count);

        // Step 7: Generate HTML response
        out.println("<html>");
        out.println("<head><title>Cookie Example</title></head>");
        out.println("<body>");

        if (existingUser != null) {
            out.println("<font color='blue'><h2>Welcome back, " + existingUser + "!</h2></font>");
            out.println("<font color='magenta'><h2>You have visited this page " + count + " times!</h2></font>");
            out.println("<form action='CookieServlet' method='post'>");
            out.println("<input type='submit' value='Logout'>");
            out.println("</form>");
        } else {
            out.println("<h2>Welcome Guest!</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("Enter your name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }

        out.println("</body>");
        out.println("</html>");
    }

    // Step 8: Handle POST requests (Logout)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Delete the cookie
        Cookie cookie = new Cookie("user", "");
        cookie.setMaxAge(0);
        cookie.setPath("/");
        response.addCookie(cookie);

        // Invalidate the session counter
        HttpSession session = request.getSession();
        session.invalidate();

        // Redirect back to GET
        response.sendRedirect("CookieServlet");
    }
}
