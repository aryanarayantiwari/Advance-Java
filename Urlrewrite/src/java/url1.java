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
public class url1 extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException {
    String url;
    response.setContentType("text/html");
    PrintWriter out=response.getWriter();
    url="http://localhost:8080/Urlrewrite/url2?s_id1=054&s_id2=055";
    out.println("<a href="+url+">Next Page</a>");
}
}    