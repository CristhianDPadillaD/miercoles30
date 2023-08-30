<%-- 
    Document   : listadoVideo
    Created on : 30/08/2023, 5:19:38 p. m.
    Author     : Sistemas
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.umariana.mundo.Video"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado de videos</h1>
        
        <%
            //obtener  el arrayList de la solicitud 
            ArrayList<Video> misVideos = (ArrayList<Video>)request.getAttribute("misVideos");
            

            //mostrar los datos del array 
             for(Video v: misVideos){
             
            out.println("idVideo: " + v.getIdVideos()+ "<br>" );
            out.println("Titulo: " + v.getTitulo()+ "<br>");
            out.println("Autor: " + v.getAutor()+ "<br>");
            out.println("Anio: " + v.getAnio()+"<br>");
            out.println("Categoria: " + v.getCategoria()+ "<br>");
            out.println("Enlace: " + v.getUrl()+"<br>");
            out.println("Letra: " + v.getLetra()+"<br>" );
            
        }
            %>
            
    <li> <a href="index.jsp"> regresar </a></li>
        
    </body>
</html>
