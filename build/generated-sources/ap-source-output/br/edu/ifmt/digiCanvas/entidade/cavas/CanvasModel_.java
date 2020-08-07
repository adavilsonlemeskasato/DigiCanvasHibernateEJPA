package br.edu.ifmt.digiCanvas.entidade.cavas;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CanvasModel.class)
public abstract class CanvasModel_ {

	public static volatile SingularAttribute<CanvasModel, String> parceiro_chave;
	public static volatile SingularAttribute<CanvasModel, String> recurso_chave;
	public static volatile SingularAttribute<CanvasModel, String> proposta_valor;
	public static volatile SingularAttribute<CanvasModel, String> canais;
	public static volatile SingularAttribute<CanvasModel, String> relacionamento_com_Cliente;
	public static volatile SingularAttribute<CanvasModel, String> estrutura_de_recurso;
	public static volatile SingularAttribute<CanvasModel, String> fonte_de_segmento;
	public static volatile SingularAttribute<CanvasModel, String> atividade_chave;
	public static volatile SingularAttribute<CanvasModel, String> segmentos_de_clientes;
	public static volatile SingularAttribute<CanvasModel, Integer> id_canvas;
	public static volatile SingularAttribute<CanvasModel, String> nomeCanvasWeb;

	public static final String PARCEIRO_CHAVE = "parceiro_chave";
	public static final String RECURSO_CHAVE = "recurso_chave";
	public static final String PROPOSTA_VALOR = "proposta_valor";
	public static final String CANAIS = "canais";
	public static final String RELACIONAMENTO_COM__CLIENTE = "relacionamento_com_Cliente";
	public static final String ESTRUTURA_DE_RECURSO = "estrutura_de_recurso";
	public static final String FONTE_DE_SEGMENTO = "fonte_de_segmento";
	public static final String ATIVIDADE_CHAVE = "atividade_chave";
	public static final String SEGMENTOS_DE_CLIENTES = "segmentos_de_clientes";
	public static final String ID_CANVAS = "id_canvas";
	public static final String NOME_CANVAS_WEB = "nomeCanvasWeb";

}

