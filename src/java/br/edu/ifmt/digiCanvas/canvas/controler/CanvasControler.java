package br.edu.ifmt.digiCanvas.canvas.controler;

import br.edu.ifmt.digiCanvas.canvasDAO.CanvasDAOControler;
import br.edu.ifmt.digiCanvas.entidade.cavas.CanvasModel;
import java.util.ArrayList;
import java.util.List;
//
///**
// *
// * @author Adavilson 20/09/2019
// */

public class CanvasControler {

    private static final ArrayList<CanvasModel> listaCanvas = new ArrayList<CanvasModel>();

    public static void inserir(CanvasModel novoCanvas) {

        listaCanvas.add(novoCanvas);
    }

    public static void alterar(CanvasModel alterarCanvas) {
        inserir(alterarCanvas);
    }

    public static void excluir(int idCanvas) {
        CanvasModel canvasId = CanvasControler.buscarCanvasPorId(idCanvas);
        CanvasDAOControler canvasDAO = new CanvasDAOControler();
        canvasDAO.remover(canvasId);

    }

    public static List<CanvasModel> listar() {
        CanvasDAOControler canvasDAO = new CanvasDAOControler();
        return canvasDAO.listaCanvas();
    }

    public static CanvasModel buscarCanvasPorId(int id_Canvas) {
        CanvasDAOControler canvasDAO = new CanvasDAOControler();
        return canvasDAO.obterIdCanvas(id_Canvas);
    }

}
