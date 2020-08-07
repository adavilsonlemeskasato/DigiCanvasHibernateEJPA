package br.edu.digiCanvas.servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.edu.ifmt.digiCanvas.canvas.controler.CanvasControler;
import br.edu.ifmt.digiCanvas.entidade.cavas.CanvasModel;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author davi
 */
@WebServlet(urlPatterns = {"/SeveletCanvasListar"})
public class SeveletCanvasListar extends HttpServlet {

//    CanvasDAO CanvasDao = new CanvasDAO();
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);

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
        System.out.println("Passei no do listar");


            String nomeCanvas = request.getParameter("Canvas");
            int idCanvas = Integer.parseInt(nomeCanvas);

            CanvasModel canvas = CanvasControler.buscarCanvasPorId(idCanvas);

            System.out.println(idCanvas);
            request.setAttribute("canvas", canvas);
            System.out.println("saindo do  listar");
            RequestDispatcher rd = request.getRequestDispatcher("MostrarCanvas.jsp");
            rd.forward(request, response);
   
    }
}
