/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ARYA
 */
public class fwdfaculty extends HttpServlet {
public void doPost(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException{
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    String username=request.getParameter("login");
    out.println("<h1 style=\"color:purple; text-align:center;\">Shri Vaishnav Vidyapeeth Vishwavidyala</h1><p style=\"font-family:Helvetica;\"><b><u>Faculty Section</u></b></p>"    );
    out.println("<h2 style=\"color:blue;font-family:Arial\">"+"Welcome "+username+"!</h2>");
    out.println("<button style=\" font-family:Arial\";>Upload Attendance</button>");
    out.println("<button style=\" font-family:Arial\";>Upload Result</button>");
    out.println("<button style=\" font-family:Arial\";>Upload Assignment</button>");
}
  
    }

    
