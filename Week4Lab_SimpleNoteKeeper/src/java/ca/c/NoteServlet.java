/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.c;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*; 

/**
 *
 * @author mucky
 */
@WebServlet(name = "NoteServlet", urlPatterns = {"/Note"})
public class NoteServlet extends HttpServlet {
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */



    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet( HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        String title = br.readLine();
        String contents = br.readLine(); 
        
        
        
          Note note = new Note(title, contents);
          request.setAttribute("note", note);
          String edit = request.getParameter("edit"); 
          
          if (edit != null ) {
               this.getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);

          } else {
                 this.getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);

          }
 
   
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {  
        
        String title = request.getParameter("title");
        System.out.println(title);
        String contents = request.getParameter("contentsTB");
         System.out.println(contents);
        String path = getServletContext().getRealPath( "/WEB-INF/note.txt"); 
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
                pw.println(title);
                pw.println(contents);
                pw.close();
                response.sendRedirect("Note");
                
                
    }
}
