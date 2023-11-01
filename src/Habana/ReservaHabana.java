/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Habana;

import java.util.Date;

/**
 *
 * @author jlizquierdo
 */
public class ReservaHabana {
    
    Date fecha;
    String nombre;
    String telefono;
    String tipo;
    int habitaciones;
    int personas;
    int dias;
    String cocina;
    
    public ReservaHabana() {
    }
    
    /**
     * Constructor
     * @param fecha  Fecha de la reserva
     * @param nombre Nombre de la reserva
     * @param telefono Teléfono de contacto
     * @param tipo Tipo de Reserva
     * @param habitaciones Número de Habitaciones
     * @param personas Personas
     * @param dias Días
     * @param cocina Cocina
     */
    
    public ReservaHabana(Date fecha, String nombre, String telefono, String tipo, int habitaciones, int personas, int dias, String cocina) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.telefono = telefono;
        this.tipo = tipo;
        this.habitaciones = habitaciones;
        this.personas = personas;
        this.dias = dias;
        this.cocina = cocina;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getCocina() {
        return cocina;
    }

    public void setCocina(String cocina) {
        this.cocina = cocina;
    }
    
}
