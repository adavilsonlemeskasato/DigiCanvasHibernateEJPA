package br.edu.digiCanvas.servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.edu.ifmt.digiCanvas.canvas.controler.CanvasControler;
import br.edu.ifmt.digiCanvas.canvasDAO.CanvasDAOControler;
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
@WebServlet(urlPatterns = {"/SeveletCanvasAlterar"})
public class SeveletCanvasAlterar extends HttpServlet {

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
        System.out.println("Passei no do Alterar");

        String nomeCanvas = request.getParameter("idCanvas");
        System.out.println(nomeCanvas);
        int idCanvas = Integer.parseInt(nomeCanvas);
        System.out.println(idCanvas);
        CanvasModel canvas = CanvasControler.buscarCanvasPorId(idCanvas);
        String nomeCanvasWeb = request.getParameter("nomeCanvasWeb");
        String parceiroChave = request.getParameter("parceiros");
        String atividadeChave = request.getParameter("atividades");
        String recursosChave = request.getParameter("recursos");
        String propostaDeValor = request.getParameter("proposta");
        String relacionamentoComClientes = request.getParameter("relacionamento");
        String canais = request.getParameter("canais");
        String segmentoDeClientes = request.getParameter("segmento");
        String estruturasDeCustos = request.getParameter("estruturas");
        String fontesDeReceitas = request.getParameter("fontes");
        if (idCanvas == canvas.getId_canvas()) {
            canvas.setNomeCanvasWeb(nomeCanvasWeb);
            canvas.setParceiro_chave(parceiroChave);
            canvas.setAtividade_chave(atividadeChave);
            canvas.setRecurso_chave(recursosChave);
            canvas.setProposta_valor(propostaDeValor);
            canvas.setRelacionamento_com_Cliente(relacionamentoComClientes);
            canvas.setSegmentos_de_clientes(segmentoDeClientes);
            canvas.setCanais(canais);
            canvas.setEstrutura_de_recurso(estruturasDeCustos);
            canvas.setFonte_de_segmento(fontesDeReceitas);

            CanvasDAOControler conn = new CanvasDAOControler();
            conn.salvar(canvas);

            System.out.println("Canvas Alterado Com sucesso ");
        }
        RequestDispatcher dispatherCanvas = request.getRequestDispatcher("ListarCanvas.jsp");
        dispatherCanvas.forward(request, response);

    }
}
