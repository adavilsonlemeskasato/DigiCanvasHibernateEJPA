package br.edu.digiCanvas.servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@WebServlet(urlPatterns = {"/SeveletCanvasInserir"})
public class SeveletCanvasInserir extends HttpServlet {

    CanvasModel canvasNovo = new CanvasModel();

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
        System.out.println("Passei no dopost");
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

        canvasNovo.setNomeCanvasWeb(nomeCanvasWeb);
        canvasNovo.setParceiro_chave(parceiroChave);
        canvasNovo.setAtividade_chave(atividadeChave);
        canvasNovo.setRecurso_chave(recursosChave);
        canvasNovo.setProposta_valor(propostaDeValor);
        canvasNovo.setRelacionamento_com_Cliente(relacionamentoComClientes);
        canvasNovo.setSegmentos_de_clientes(segmentoDeClientes);
        canvasNovo.setCanais(canais);
        canvasNovo.setEstrutura_de_recurso(estruturasDeCustos);
        canvasNovo.setFonte_de_segmento(fontesDeReceitas);

        CanvasDAOControler conn = new CanvasDAOControler();
        conn.salvar(canvasNovo);

        request.setAttribute("mensagem", "Canvas Salvo com sucesso");
        RequestDispatcher dispatherCanvas = request.getRequestDispatcher("ListarCanvas.jsp");
        dispatherCanvas.forward(request, response);
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
