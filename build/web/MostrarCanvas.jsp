<%-- 
     Document   : MostrarCanvas
    Created on : 26/10/2019, 01:51:03
    Author     : davi
--%>

<%@page import="br.edu.ifmt.digiCanvas.entidade.cavas.CanvasModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <script src="js/jquery-3.3.1.slim.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="css/bootstrap.min.css"></script>
        <title>DigiCanvas</title>
    </head>
    <body>

        <table   border="1" width="100%" height="100%">
            <tr>
            <form align="center" action="SeveletCanvasAlterar" method="post">
                <table class="table" border="1">

                    <%

                        CanvasModel canvas = (CanvasModel) request.getAttribute("canvas");

                        System.out.println(canvas);

                    %>

                    <tr><td colspan="5"><h1 align="center "> 
                                </br> 
                                <% out.print(canvas.getNomeCanvasWeb());%>
                                <input type="hidden" name="nomeCanvasWeb" value="<% out.print(canvas.getNomeCanvasWeb()); %>">
                            </h1></td> </tr>


                    <tr>
                        <td rowspan="2" width="20%" >

                            <h1 align="center "> Parceiros Chave</h1>

                            <textarea class="form-control rounded-0" rows="30" cols="40" maxlength="500" type="text" name="parceiros" id="parceiros"   >  <% out.print(canvas.getParceiro_chave());%>      </textarea>

                        </td>

                        <td  width="20%"  >

                            <h1 align="center ">  Atividades Chave</h1>

                            <textarea class="form-control rounded-0" rows="15" cols="40" maxlength="500" type="text" name="atividades"  id="atividades"  >  <% out.print(canvas.getAtividade_chave());%>     </textarea>

                        </td>

                        <td rowspan="2" width="20%">
                            <h1 align="center ">   Proposta de Valor</h1>
                            <textarea class="form-control rounded-0" rows="28" cols="40" maxlength="500" type="text" name="proposta"  id="proposta">  <% out.print(canvas.getProposta_valor());%>     </textarea>
                        </td>

                        <td width="20%" >

                            <h1 align="center ">  Relacionamento com Clientes</h1>
                            <textarea class="form-control rounded-0" rows="13" cols="40" maxlength="500" type="text" name="relacionamento"   id="relacionamento">  <% out.print(canvas.getRelacionamento_com_Cliente());%>      </textarea>

                        </td>

                        <td rowspan="2" width="20%" >

                            <h1 align="center ">  Segmento de Clientes</h1>
                            <textarea class="form-control rounded-0" rows="28" cols="40" maxlength="500" type="text" name="segmento"   id="segmento" >   <% out.print(canvas.getSegmentos_de_clientes());%>      </textarea>

                        </td>

                    </tr>

                    <tr><td >
                            <h1 align="center "> Recursos Chave</h1>
                            <textarea class="form-control rounded-0" rows="10" cols="40" maxlength="500" type="text" name="recursos" id="recursos" >  <% out.print(canvas.getRecurso_chave());%>      </textarea>
                        </td><td >

                            <h1 align="center ">  Canais </h1>
                            <textarea class="form-control rounded-0" rows="10" cols="40" maxlength="500" type="text" name="canais"  id="canais" >  <% out.print(canvas.getCanais());%>     </textarea>

                        </td></tr>
                    <tr><td colspan="5">
                            <table border="1" width="100%" height="100%">
                                <tr><td width="50%" >

                                        <h1 align="center ">   Estruturas de custos</h1>
                                        <textarea class="form-control rounded-0" rows="10" cols="40" maxlength="500" type="text" name="estruturas" id="estruturas"  >  <% out.print(canvas.getEstrutura_de_recurso());%>     </textarea>
                                    </td><td >
                                        <h1 align="center ">  fontes de receitas</h1>
                                        <textarea class="form-control rounded-0" rows="10" cols="40" maxlength="500" type="text" name="fontes"  id="fontes"  >  <% out.print(canvas.getFonte_de_segmento());%>    </textarea>
                                    </td></tr>
                            </table>
                        </td></tr>

                </table>

                <input align="center" type="hidden" name="idCanvas" value="<% out.print(canvas.getId_canvas());%>">

                <input align="center" type="submit" value="Alterar" >

            </form>


        </tr>

    </table>

</body>
</html>
