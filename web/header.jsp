<%-- 
    Document   : header
    Created on : Sep 6, 2021, 5:58:34 PM
    Author     : Levitt
--%><%@page contentType="text/html" pageEncoding="UTF-8"%><nav class="navbar fixed-top navbar-expand-md navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="/">Matthew's Business</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
      <ul class="navbar-nav me-auto mb-2 mb-md-0">
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