<%-- 
    Document   : ListarCanvas
    Created on : 08/10/2019, 00:05:59
    Author     : davi
--%>

<%@page import="br.edu.ifmt.digiCanvas.canvas.controler.CanvasControler"%>
<%@page import="br.edu.ifmt.digiCanvas.entidade.cavas.CanvasModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <script src="js/jquery-3.3.1.slim.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="css/bootstrap.min.css"></script>
        <title>DigiCanvas</title>

    </head>

    <body>

        <form align="center " action="CriarCanvas" method="get">
            <br></br>

            <h1 >Bem vindo ao DigiCanvas</h1>
            <h1>Lista de Canvas Criados</h1>





            <table align="center " border="2" width="100%" height="25%" >
                <br></br>
                <%  out.print("<a href=\"CriarCanvas.jsp?Canvas=\">");%>
                <% out.print("Criar Canvas" + "<br/></br></a>");%>


                <td >


                    <%

                        List<CanvasModel> canvas = (CanvasControler.listar());

                        for (CanvasModel cadaCanvas : canvas) {
                            System.out.println(cadaCanvas.getId_canvas());

                    %>

                <tr >
                    <td align="center " >

                        <%  out.print("<a href=\"SeveletCanvasListar?Canvas=" + cadaCanvas.getId_canvas() + "\">");%>
                        <% out.print(cadaCanvas.getNomeCanvasWeb() + "<br/></a>");%>
                    <td align="center ">
                        <%  out.print("<a href=\"SeveletCanvasListar?Canvas=" + cadaCanvas.getId_canvas() + "\">");%>
                        <% out.print("Alterar" + "<br/></a>");%>
                    </td >
                    <td align="center ">
                        <%  out.print("<a href=\"SeveletCanvasExcluir?Canvas=" + cadaCanvas.getId_canvas() + "\">");%>
                        <% out.print("Excluir" + "<br/></a>");%>
                    </td> 

                </tr>

                <%
                    }

                %>
                </td>

            </table>
        </form>
        <input type="submit"  value="Voltar">



        <footer> 
        </footer>
    </body>                     
</html>
