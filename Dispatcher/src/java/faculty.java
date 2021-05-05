
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class faculty extends HttpServlet{
public void doPost(HttpServletRequest request,HttpServletResponse response )
throws ServletException,IOException
{
    response.setContentType("text/html");
            PrintWriter out=response.getWriter();
            RequestDispatcher rd;
            String login=request.getParameter("login");
            String pwd=request.getParameter("pwd");
            if(login.equalsIgnoreCase("faculty") && pwd.equals("java")){
            rd=request.getRequestDispatcher("fwdfaculty");
            rd.forward(request,response);}
            else{
            out.println("<p><h1 style=\"color:white; background-color:red; text-align:center; font-size:1rem; font-weight:bold; padding:0 2rem;\"">Incorrect Login ID/Password ID</h1></p>");
            rd=request.getRequestDispatcher("/index.html");
                    rd.include(request,response);}
}
}
