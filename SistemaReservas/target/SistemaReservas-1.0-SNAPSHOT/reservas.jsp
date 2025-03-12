<%-- 
    Document   : reservas
    Created on : 12/03/2025, 4:10:35 p. m.
    Author     : Geral
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.mycompany.sistemareservas.Reserva" %>
<%@ page import="com.mycompany.sistemareservas.ReservaServlet" %>

<!DOCTYPE html>
<html>
<head>
    <title>Lista de Reservas</title>
</head>
<body>
    <h2>Lista de Reservas</h2>
    <table border="1">
        <tr>
            <th>Nombre</th>
            <th>Espacio</th>
            <th>Fecha</th>
            <th>Duración (horas)</th>
            <th>Acción</th>
        </tr>
        <%
            List<Reserva> reservas = ReservaServlet.reservas; // Obtiene la lista de reservas
            for (Reserva r : reservas) {
        %>
        <tr>
            <td><%= r.getNombre() %></td>
            <td><%= r.getEspacio() %></td>
            <td><%= r.getFecha() %></td>
            <td><%= r.getDuracion() %></td>
            <td>
                <form action="eliminarReserva" method="post">
                    <input type="hidden" name="fecha" value="<%= r.getFecha() %>">
                    <button type="submit">Eliminar</button>
                </form>
            </td>
        </tr>
        <% } %>
    </table>
</body>
</html>

