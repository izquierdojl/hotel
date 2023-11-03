/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Habana;

import java.util.ArrayList;

/**
 *
 * @author jlizquierdo
 * Paquete para gestionar el salón
 * Contiene un ArrayList de objetos de las reservas
 */
public class Habana {
    
    private ArrayList<ReservaHabana> reservas = new ArrayList<ReservaHabana>(); 

    
    /**
     * Constructor principal
     */
    public Habana() {
    }
    
    /**
     * Constructor 
     */
    public Habana( ArrayList<ReservaHabana> reservas ) {
        this.reservas = reservas;
    }

    /**
     * Getter
    */
    public ArrayList<ReservaHabana> getReservas() {
        return reservas;
    }

    /**
     * Setter
    */
    public void setReservas(ArrayList<ReservaHabana> reservas) {
        this.reservas = reservas;
    }
    
    public void addReserva( ReservaHabana reserva )
    {
        reservas.add(reserva);
    }
    
}
