<%-- 
    Document   : Criar Tela de Login
    Created on : 05/11/2019, 00:56:17
    Author     : Adavilson
--%>

<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/TelaDeLogin.css"></link>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <script src="js/jquery-3.3.1.slim.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="css/bootstrap.min.css"></script>
         <title>DigiCanvas</title>
    </head>


    <body class="container-fluid">


        <section class="corpo">

            <div class="body-index">
                <div class="text-center">

                    <div class="conteudo">
                        <div  class="imagem">
                            <figure>
<!--                                <img src="nucleoIncubador.png" alt=" Logomarca Canvas" >-->
                            </figure>
                        </div>

                        <div class="texto">
                            <ul >
                                <form method = "POST" action ="context.xhml">
                                    <input style="" type="email" placeholder="Usuário"></input></br></br>
                                    <input type="password"  placeholder="Senha"></input></br></br>
                                    <input type="submit"  placeholder="ACESSAR"></input>
                                </form>

                                <a href= "">Ainda não é inscrito? <strong>Cadastre-se!</strong></a>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>

</html>
