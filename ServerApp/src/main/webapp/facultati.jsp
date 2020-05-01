<%@ page import="models.Facultate" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: adragos
  Date: 01/05/2020
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Facultati</title>
</head>
<body>

<h3 align="center">Introdu numele orasului pentru care vrei sa vezi ce facultati exista:</h3>

<form align="center" method="post" action="/facultati">

    <label for="oras">Oras:</label><br/>
    <input type="text" id="oras" name="oras"><br/>
    <input type="submit" value="Cauta!">
</form>

<%

    if (request.getAttribute("facultati") != null)
    {
        List<Facultate> facultati = (List<Facultate>) request.getAttribute("facultati");
        if (facultati.size() == 0) out.println("Nu au fost gasite facultati");
        for (Facultate facultate : facultati)
        {
            out.println(facultate);
        }
    }

%>

</body>
</html>
