<%-- 
    Document   : envio
    Created on : 04-oct-2016, 13:17:29
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.mensaje"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Generación de Mensajes</title>
    </head>
    <body>
        <%if(request.getParameter("texto")!=null){%>
            //para importar
            <jsp:useBean id="mensa" scope="request" class="mensaje"/>
            <jsp:setProperty name="mensa" property="*"/>
        <%}%>
        <h1>Generación de mensajes</h1>
        <form method="post">//al no ponerse action, la página vuelve a recargarse
            //con el mensaje anterior rellenado y se manda al JavaBean
            <br/><br/>
            Introduzca destinatario: <input type="text" name="destinatario"/><br/><br/>
            Introduzca remitente: <input type="text" name="remitente"/><br/><br/>
            Introduzca el mensaje: <br/>
            <textarea name="texto"/><br/><br/>
        </form>
    </body>
</html>
