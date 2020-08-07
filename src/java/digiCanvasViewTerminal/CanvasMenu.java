package digiCanvasViewTerminal;

import digCanvasAPPBaseTerminal.NumerosNegativosExcepition;
import digCanvasAPPBaseTerminal.Teclado;
import digCanvasModelTerminal.Canvas;
import digiCanvasControlerTerminal.CanvasControler;
import java.util.List;


public class CanvasMenu {

//
    public void menu() {

        boolean continua = true;

        do {
            try {
                System.out.println("<<IFMT BANCO DADOS>>");
                System.out.println("<<Cadastro de Professores.>>");
                int opcaoCadastro = Teclado.lerInt("Digite (1)Para Cadastrar  (2) Para Alterar (3)Para Deletar (4)Para consulta (5) Para sair");
                if (opcaoCadastro < 0) {
                    throw new NumerosNegativosExcepition("Erro numero negativo informado");
                }
                switch (opcaoCadastro) {
                    case 1:
                        cadastrar();
                        break;
                    case 2:
                        alterar();
                        break;
                    case 3:
                        excluir();
                        break;
                    case 4:
                        consultar();
                        break;
                    case 5:
                        System.out.println("<<<FIM DA APLICAÇÂO >>>");
                        System.exit(0);
                        break;

                }
//
            } catch (java.util.InputMismatchException erro1) {
                System.out.println("Não informe apenas números Inteiros!!!");
            } catch (NumerosNegativosExcepition erro2) {
                System.out.println(erro2.getMessage());
            }

        } while (continua);
    }
//

    public void cadastrar() {
        int id_canvas = Teclado.lerInt("Digite o ID do canvas:");
        String parceiro_chave = Teclado.lerString("Digite quem seria seu  parceiro chave :");
        String atividade_chave = Teclado.lerString("Digite qual é sua atividade chave:");
        String recurso_chave = Teclado.lerString("Digite qual é  o recurso chave:");
        String proposta_valor = Teclado.lerString("Digite qual é sua proposta valor:");
        String relacionamento_com_Cliente = Teclado.lerString("Digite qual é o relacionamento com Cliente:");
        String segmentos_de_clientes = Teclado.lerString("Digite qual é o segmento de clientes:");
        String canais = Teclado.lerString("Digite quais são os canais:");
        String estrutura_de_recurso = Teclado.lerString("Digite qual é sua estrutura de recurso:");
        String fonte_de_segmento = Teclado.lerString("Digite qual é sua fonte de segmento:");
        int id_grupoNucleoIFMT = Teclado.lerInt("Digite o numero da matricula do IFMT:");

        Canvas principalCanva = new Canvas();
        principalCanva.setId_canvas(id_canvas);
        principalCanva.setParceiro_chave(parceiro_chave);
        principalCanva.setAtividade_chave(atividade_chave);
        principalCanva.setRecurso_chave(recurso_chave);
        principalCanva.setProposta_valor(proposta_valor);
        principalCanva.setRelacionamento_com_Cliente(relacionamento_com_Cliente);
        principalCanva.setSegmentos_de_clientes(segmentos_de_clientes);
        principalCanva.setCanais(canais);
        principalCanva.setEstrutura_de_recurso(estrutura_de_recurso);
        principalCanva.setFonte_de_segmento(fonte_de_segmento);
        principalCanva.setId_grupoNucleoIFMT(id_grupoNucleoIFMT);

        CanvasControler conn = new CanvasControler();
        conn.salvar(principalCanva);

        System.out.println("Salvo Com sucesso !!!");
        menu();
    }

    public void alterar() {

        int id_canvas = Teclado.lerInt("Digite o Id do Canvas a ser Alterado:");
        String parceiro_chave = Teclado.lerString("Digite o novo  parceiro chave :");
        String atividade_chave = Teclado.lerString("Digite a novo atividade chave:");
        String recurso_chave = Teclado.lerString("Digite o  novo  recurso chave:");
        String proposta_valor = Teclado.lerString("Digite o  novo  proposta valor:");
        String relacionamento_com_Cliente = Teclado.lerString("Digite o  novo  relacionamento com Cliente:");
        String segmentos_de_clientes = Teclado.lerString("Digite o  novo  segmento de clientes:");
        String canais = Teclado.lerString("Digite o  novo  canais:");
        String estrutura_de_recurso = Teclado.lerString("Digite a novo  estrutura de recurso:");
        String fonte_de_segmento = Teclado.lerString("Digite o novo fonte de segmento:");
        int id_grupoNucleoIFMT = Teclado.lerInt("Digite o novo id_grupoNucleoIFMT:");

        Canvas principalCanva = new Canvas();
        principalCanva.setId_canvas(id_canvas);
        principalCanva.setParceiro_chave(parceiro_chave);
        principalCanva.setAtividade_chave(atividade_chave);
        principalCanva.setRecurso_chave(recurso_chave);
        principalCanva.setProposta_valor(proposta_valor);
        principalCanva.setRelacionamento_com_Cliente(relacionamento_com_Cliente);
        principalCanva.setSegmentos_de_clientes(segmentos_de_clientes);
        principalCanva.setCanais(canais);
        principalCanva.setEstrutura_de_recurso(estrutura_de_recurso);
        principalCanva.setFonte_de_segmento(fonte_de_segmento);
        principalCanva.setId_grupoNucleoIFMT(id_grupoNucleoIFMT);

        CanvasControler conn = new CanvasControler();
        conn.editar(principalCanva);

        System.out.println("Alterado Com sucesso !!!");
        menu();
    }

    public void excluir() {
        int id_canvas = Teclado.lerInt("Digite o Id Canvas");
        CanvasControler conn = new CanvasControler();
        Canvas canvasId = conn.obterIdCanvas(id_canvas);
        CanvasControler teste = new CanvasControler();
        teste.remover(canvasId);

        System.out.println("Canvas Deletado com Sucesso");
        menu();
    }
//

    public void consultar() {
        CanvasControler conn = new CanvasControler();
        conn.listaCanvas();
        CanvasControler ListaConexao = new CanvasControler();
        List<Canvas> canvas = ListaConexao.listaCanvas();
        for (int i = 0; i < canvas.size(); i++) {
            System.out.println( canvas.toString());
            System.out.println("Canvas \n " + "ID DO canvas= " + canvas.get(i).getId_canvas()
                    + "\n Parceiro Chave= " + canvas.get(i).getParceiro_chave()
                    + "\n Atividade_chave= " + canvas.get(i).getAtividade_chave()
                    + "\n Recurso_chave= " + canvas.get(i).getRecurso_chave()
                    + "\n Proposta_valor= " + canvas.get(i).getProposta_valor()
                    + "\n Relacionamento_com_Cliente= " + canvas.get(i).getRelacionamento_com_Cliente()
                    + "\n Segmentos_de_clientes= " + canvas.get(i).getSegmentos_de_clientes()
                    + "\n Canais= " + canvas.get(i).getCanais()
                    + "\n Estrutura_de_recurso= " + canvas.get(i).getEstrutura_de_recurso()
                    + "\n Fonte_de_segmento= " + canvas.get(i).getFonte_de_segmento()
                    + "\n Id_grupoNucleoIFMT= " + canvas.get(i).getId_grupoNucleoIFMT());
        }
        menu();
    }

    public static void main(String[] args) {

//     Inicia a aplicação do swit e case 
        CanvasMenu principalCanvas = new CanvasMenu();
        principalCanvas.menu();

    }

}
