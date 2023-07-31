package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/parametros/url-get")
public class ParametrosGetServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      resp.setContentType("text/html");
      PrintWriter out = resp.getWriter();

      String saludo = req.getParameter("saludo");
      out.print("<!DOCTYPE html>");
      out.print("<html>");
      out.print("     <head>");
      out.print("     <meta charset=\"UTF-8\">");
      out.print("     <title>Parametros get de la URL</title>");
      out.print("     </head>");
      out.print("     <body>");
      out.print("         <h1>Parametros get de la URL</h1>");
      out.println("       <h2>El saludo enviado es:" + saludo  + "</h2>");
      out.print("     </body>");
      out.print("</html>");
      out.close();
        
    }
}
