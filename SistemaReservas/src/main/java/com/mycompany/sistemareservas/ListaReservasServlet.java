/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.sistemareservas;

import java.io.IOException;
import java.text.SimpleDateFormat;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Geral
 */
@WebServlet("/listarReservas")
public class ListaReservasServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Reservas</title></head><body>");
        response.getWriter().println("<h2>Lista de Reservas</h2>");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 

        for (Reserva r : ReservaServlet.reservas) {
            String fechaStr = sdf.format(r.getFecha()); 
            response.getWriter().println("<p>" + r.getNombre() + " reservó " + r.getEspacio() +
                                         " el " + fechaStr + " por " + r.getDuracion() + " horas.</p>");
            response.getWriter().println("<form action='eliminarReserva' method='post'>" +
                                         "<input type='hidden' name='fecha' value='" + fechaStr + "'>" +
                                         "<button type='submit'>Eliminar</button></form>");
        }

        response.getWriter().println("</body></html>");
    }
}
