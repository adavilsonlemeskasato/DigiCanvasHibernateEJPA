/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digiCanvasControlerTerminal;

import digCanvasModelTerminal.Canvas;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author davi
 */
public class CanvasControler {

    EntityManagerFactory emf;
    EntityManager em;
    Canvas canvasId;
//  Crinado Construtor da class

    public CanvasControler() {
        emf = Persistence.createEntityManagerFactory("canvas");
        em = emf.createEntityManager();
    }

//  Obtendo o Id do banco de dados 
    public Canvas obterIdCanvas(int id) {
        em.getTransaction().begin();
        this.canvasId = em.find(Canvas.class, id);
        em.getTransaction().commit();

//      Perguntar por que ao fechar a conexao no listar ele não consegue se reconectar!!!
//        emf.close();
        return this.canvasId;
    }

//  Criando metodo de salvar e alterar no banco
    public Canvas salvar(Canvas canvas) {
        em.getTransaction().begin();
        em.merge(canvas);
        em.getTransaction().commit();
        emf.close();
        return canvas;
    }

    public Canvas editar(Canvas canvas) {
        em.getTransaction().begin();
        em.merge(canvas);
        em.getTransaction().commit();
        emf.close();
        return canvas;
    }

//  Criando metodo de remover no banco
    public void remover(Canvas canvas) {
        em.getTransaction().begin();
        Query q = em.createNativeQuery("delete canvas from canvas where id_canvas=" + canvas.getId_canvas());
        q.executeUpdate();
        em.getTransaction().commit();
        emf.close();
    }

//    Criando metodo de listar tudo do banco
    public List<Canvas> listaCanvas() {
        em.getTransaction().begin();
        Query consultaDeCanvas = em.createQuery("select canvas from Canvas canvas");
        List<Canvas> listCanvas = consultaDeCanvas.getResultList();
        em.getTransaction().commit();
        emf.close();
        return listCanvas;
    }

}
