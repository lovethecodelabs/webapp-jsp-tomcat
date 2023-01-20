<%-- 
    Document   : header
    Created on : Sep 6, 2021, 5:58:34 PM
    Author     : Levitt
--%><%@page contentType="text/html" pageEncoding="UTF-8"%><nav class="navbar fixed-bottom navbar-expand-sm navbar-dark bg-dark">
  <div class="container-fluid">
    <div>
      <ul class="navbar-nav">
        <li class="nav-item ">
          <a class="nav-link <%
              if(request.getAttribute("Name").equals("index")) { 
                  out.print("active"); 
              }
          %>" aria-current="page" href="/">Home</a>
        </li>
        <li class="nav-item ">
          <a class="nav-link <%
              if(request.getAttribute("Name").equals("about")) { 
                  out.print("active"); 
              }
          %>" href="/about.do">About</a>
        </li>
        <li class="nav-item ">
          <a class="nav-link <%
              if(request.getAttribute("Name").equals("contact")) { 
                  out.print("active"); 
              }
          %>" href="/contact.do">Contact</a>
        </li>
      </ul>
    </div>
  </div>
</nav>