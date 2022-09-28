<%-- 
    Document   : editnote
    Created on : Sep 27, 2022, 7:44:36 AM
    Author     : mucky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    <h1>Simple Note Keeper!</h1>
    <h2>View Note</h2>
   
    <form action="Note" method="post">
        <p> 
        <label>
                Title: 
                <input type ="text" id="title" name="title"> 
        </label>
        </p>
        
        <p>
        <label for="contentsTB" >Contents</label>
        <textarea id="contents"  name="contentsTB"></textarea>
         </p>
         <button type="submit">Save </button> 
          
         
    </form>
   
    </body>
</html>
