/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Levitt
 */
@WebServlet(urlPatterns={"/test", "/test/"})
public class Controller extends HttpServlet {
    
    private PageDAO data;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controller at " + request.getServerName() + "</h1>");
            out.println("Action " + request.getParameter("action"));
            out.println("</body>");
            out.println("</html>");
        }
    }


    
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        this.data = new PageDAO();

        StringBuffer url=request.getRequestURL(); 
        String pageName=url.substring(url.lastIndexOf("/")+1);
        PageDAO data = new PageDAO();
        
        //String pageName =request.getParameter("action");       
        if(pageName==null || pageName.equals("")){ 
            String tmplName = "View_homepage.jsp";
            Page home = new Page();
            home.setPageName("index");
            request.setAttribute("Name","index");
            request.setAttribute("Title", "Matthew's Business");
            request.setAttribute("metaKey", "Home Key1, Home Key2");
            request.setAttribute("metaDesc", "This is a good meta description for /");
            home.setPageLoc("main");
            try {
                request.setAttribute("main",this.data.queryPageContent("index","main"));
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            home.setPageLoc("side1");
            try {
                request.setAttribute("side1",this.data.queryPageContent("index","side1"));
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            home.setPageLoc("side2");
            try {
                request.setAttribute("side2",this.data.queryPageContent("index","side2"));
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.getRequestDispatcher(tmplName).forward(request, response);
        } else if (pageName.equalsIgnoreCase("t") || pageName.equals("t.do")) { 
            String tmplName = "t.jsp";
            Page t = new Page();
            t.setPageName("t");
            request.setAttribute("Title", "About Matthew's Business");
            request.setAttribute("metaKey", "About Key1, About Key2");
            request.setAttribute("metaDesc", "This is a good meta description for /about.jsp");
            request.getRequestDispatcher(tmplName).forward(request, response);
        } else if (pageName.equalsIgnoreCase("about") || pageName.equals("about.do")) { 
            String tmplName = "View.jsp";
            Page about = new Page();
            about.setPageName("about");
            request.setAttribute("Name","about");
            request.setAttribute("Title", "About Matthew's Business");
            request.setAttribute("metaKey", "About Key1, About Key2");
            request.setAttribute("metaDesc", "This is a good meta description for /about.jsp");
            about.setPageLoc("main");
            try {
                request.setAttribute("main",this.data.queryPageContent("about","main"));
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            about.setPageLoc("side1");
            try {
                request.setAttribute("side1",this.data.queryPageContent("about","side1"));
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            about.setPageLoc("side2");
            try {
                request.setAttribute("side2",this.data.queryPageContent("about","side2"));
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.getRequestDispatcher(tmplName).forward(request, response);
        } else if (pageName.equalsIgnoreCase("contact") || pageName.equals("contact.do")) {
            String tmplName = "View.jsp";
            Page contact = new Page();
            contact.setPageName("contact");
            request.setAttribute("Name","contact");
            request.setAttribute("Title", "Contact Matthew");
            request.setAttribute("metaKey", "Contact Key1, Contact Key2");
            request.setAttribute("metaDesc", "This is a good meta description for /contact.jsp");
            contact.setPageLoc("main");
            try {
                request.setAttribute("main",this.data.queryPageContent("contact","main"));
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            contact.setPageLoc("side1");
            try {
                request.setAttribute("side1",this.data.queryPageContent("contact","side1"));
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            contact.setPageLoc("side2");
            try {
                request.setAttribute("side2",this.data.queryPageContent("contact","side2"));
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.getRequestDispatcher(tmplName).forward(request, response);
        } else {
            processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
