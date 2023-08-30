
package servlets;

import com.umariana.mundo.Video;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvVideo", urlPatterns = {"/SvVideo"})
public class SvVideo extends HttpServlet {

    
    
    //Array en el cual se van a guardar los videos
    ArrayList <Video> misVideos = new ArrayList<>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Aqui viene los datos por GET
      
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String idVideo = request.getParameter("idvideo");
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String anio = request.getParameter("anio");
        String categoria = request.getParameter("categoria");
        String enlace = request.getParameter("url");
        String letra = request.getParameter("name");
     
        
       
//        System.out.println("idVideo: " + idVideo);
//        System.out.println("Titulo: " + titulo);
//        System.out.println("Autor: " + autor);
//        System.out.println("Año: " + anio);
//        System.out.println("Categoria: " + categoria);
//        System.out.println("Enlace: " + enlace);
//        System.out.println("Letra: " + letra);


    // Ingresar datos a el objeto 
         
        Video miVideo = new Video(Integer.parseInt(idVideo), titulo, autor, anio, categoria, enlace, letra);
        
        
        misVideos.add(miVideo);
        
        
        //agragar el arrayList al objeto de solicitud como atributo
        request.setAttribute("misVideos", misVideos);
        
        
        //Redireccionar a la pagina web de destino
        request.getRequestDispatcher("listadoVideo.jsp").forward(request, response);
        
        
       
            
        
    }// aqui viene por post


    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
}
