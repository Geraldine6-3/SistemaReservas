/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemareservas;

/**
 *
 * @author Geral
 */
import java.util.Date;

public class Reserva {
    private final String nombre;
    private final String espacio;
    private final Date fecha; 
    private final int duracion;

    public Reserva(String nombre, String espacio, Date fecha, int duracion) {
        this.nombre = nombre;
        this.espacio = espacio;
        this.fecha = fecha;
        this.duracion = duracion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getEspacio() {
        return espacio;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getDuracion() {
        return duracion;
    }
}