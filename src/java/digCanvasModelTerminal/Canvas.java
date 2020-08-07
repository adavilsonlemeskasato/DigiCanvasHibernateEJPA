package digCanvasModelTerminal;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Adavilson 17/08/2019
 */
@Entity
@Table(name = "canvas")
public class Canvas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_canvas;

    private String parceiro_chave;

    private String atividade_chave;

    private String recurso_chave;

    private String proposta_valor;

    private String relacionamento_com_Cliente;

    private String segmentos_de_clientes;

    private String canais;

    private String estrutura_de_recurso;

    private String fonte_de_segmento;

    private int id_grupoNucleoIFMT;

    public int getId_canvas() {
        return id_canvas;
    }

    public void setId_canvas(int id_canvas) {
        this.id_canvas = id_canvas;
    }

    public String getParceiro_chave() {
        return parceiro_chave;
    }

    public void setParceiro_chave(String parceiro_chave) {
        this.parceiro_chave = parceiro_chave;
    }

    public String getAtividade_chave() {
        return atividade_chave;
    }

    public void setAtividade_chave(String atividade_chave) {
        this.atividade_chave = atividade_chave;
    }

    public String getRecurso_chave() {
        return recurso_chave;
    }

    public void setRecurso_chave(String recurso_chave) {
        this.recurso_chave = recurso_chave;
    }

    public String getProposta_valor() {
        return proposta_valor;
    }

    public void setProposta_valor(String proposta_valor) {
        this.proposta_valor = proposta_valor;
    }

    public String getRelacionamento_com_Cliente() {
        return relacionamento_com_Cliente;
    }

    public void setRelacionamento_com_Cliente(String relacionamento_com_Cliente) {
        this.relacionamento_com_Cliente = relacionamento_com_Cliente;
    }

    public String getSegmentos_de_clientes() {
        return segmentos_de_clientes;
    }

    public void setSegmentos_de_clientes(String segmento_de_cliente) {
        this.segmentos_de_clientes = segmento_de_cliente;
    }

    public String getCanais() {
        return canais;
    }

    public void setCanais(String canais) {
        this.canais = canais;
    }

    public String getEstrutura_de_recurso() {
        return estrutura_de_recurso;
    }

    public void setEstrutura_de_recurso(String estrutura_de_recurso) {
        this.estrutura_de_recurso = estrutura_de_recurso;
    }

    public String getFonte_de_segmento() {
        return fonte_de_segmento;
    }

    public void setFonte_de_segmento(String fonte_de_segmento) {
        this.fonte_de_segmento = fonte_de_segmento;
    }

    public int getId_grupoNucleoIFMT() {
        return id_grupoNucleoIFMT;
    }

    public void setId_grupoNucleoIFMT(int id_grupoNucleoIFMT) {
        this.id_grupoNucleoIFMT = id_grupoNucleoIFMT;
    }

    @Override
    public String toString() {
        return "Canvas{" + "ID DO canvas= " + id_canvas
                + "Parceiro Chave= " + parceiro_chave
                + "Atividade_chave= " + atividade_chave
                + "Recurso_chave= " + recurso_chave
                + "Proposta_valor= " + proposta_valor
                + "Relacionamento_com_Cliente= " + relacionamento_com_Cliente
                + "Segmentos_de_clientes= " + segmentos_de_clientes
                + "Canais= " + canais
                + "Estrutura_de_recurso= " + estrutura_de_recurso
                + "Fonte_de_segmento= " + fonte_de_segmento
                + "Id_grupoNucleoIFMT= " + id_grupoNucleoIFMT + '}';
    }

}
