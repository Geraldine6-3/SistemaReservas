/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.sistemareservas;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Geral
 */
@WebServlet(name = "ReservaServlet", urlPatterns = {"/ReservaServlet"})
public class ReservaServlet extends HttpServlet {

    public static List<Reserva> reservas = new ArrayList<>(); 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String espacio = request.getParameter("espacio");
        String fechaStr = request.getParameter("fecha");
        int duracion;

        try {
            duracion = Integer.parseInt(request.getParameter("duracion"));
        } catch (NumberFormatException e) {
            response.sendRedirect("index.html?error=DuracionInvalida");
            return;
        }

        if (nombre != null && espacio != null && fechaStr != null) {
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
            Date fecha = null;
            try {
                fecha = sdf.parse(fechaStr);
            } catch (ParseException e) {
                response.sendRedirect("index.html?error=FormatoFechaIncorrecto");
                return;
            }
            
            Reserva nuevaReserva = new Reserva(nombre, espacio, fecha, duracion);
            reservas.add(nuevaReserva);
            response.sendRedirect("listarReservas");
        } else {
            response.sendRedirect("index.html?error=DatosIncompletos");
        }
    }
}
