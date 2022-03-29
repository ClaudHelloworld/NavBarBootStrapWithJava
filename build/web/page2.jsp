<%-- 
    Document   : index
    Created on : 28 de mar. de 2022, 19:47:27
    Author     : Fatec
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>       
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">       
        <title>Juros Compostos</title>        
    </head>
    <body>
        <%@include file="WEB-INF/jspf/navbar.jspf" %>
        
        <br/>
        <div class="container-fluid">
            <h1><i class="bi bi-twitch"></i> Juros Compostos</h1>      
        </div>
        
        <form method="post" action="juros-composto.html">
             Valor Inicial: <p><input type="number" name="value2" value="1"/></p>
             Juros:  <p><input type="number"  name="porcent2" value="1"/></p>
             Meses:  <p><input type="number"  name="date2" value="1"/></p>
             <p><input type="submit" value="Calcular"/></p>
        </form>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
