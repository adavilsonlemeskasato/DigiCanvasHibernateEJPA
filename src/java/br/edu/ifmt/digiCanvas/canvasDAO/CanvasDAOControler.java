/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifmt.digiCanvas.canvasDAO;

import br.edu.ifmt.digiCanvas.entidade.cavas.CanvasModel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author davi
 */
public class CanvasDAOControler {

    EntityManagerFactory emf;
    EntityManager em;
    CanvasModel canvasId;
//  Crinado Construtor da class

    public CanvasDAOControler() {
        emf = Persistence.createEntityManagerFactory("canvas");
        em = emf.createEntityManager();
    }

//  Obtendo o Id do banco de dados 
    public CanvasModel obterIdCanvas(int id) {
        em.getTransaction().begin();
        this.canvasId = em.find(CanvasModel.class, id);
        em.getTransaction().commit();

//      Perguntar por que ao fechar a conexao no listar ele não consegue se reconectar!!!
        emf.close();
        return this.canvasId;
    }

//  Criando metodo de salvar e alterar no banco
    public CanvasModel salvar(CanvasModel canvas) {
        em.getTransaction().begin();
        if (canvas.getId_canvas() == null) {
            em.persist(canvas);
        }
        em.merge(canvas);
        em.getTransaction().commit();
        emf.close();
        return canvas;
    }

//  Criando metodo de remover no banco
    public void remover(CanvasModel canvas) {
        em.getTransaction().begin();
        Query q = em.createNativeQuery("delete canvas from canvas where id_canvas=" + canvas.getId_canvas());
        q.executeUpdate();
        em.getTransaction().commit();
        emf.close();
    }

//    Criando metodo de listar tudo do banco
    public List<CanvasModel> listaCanvas() {
        Query consultaDeCanvas = em.createQuery("select canvas from CanvasModel canvas");
        List<CanvasModel> listCanvas = consultaDeCanvas.getResultList();
        return listCanvas;
    }

}
