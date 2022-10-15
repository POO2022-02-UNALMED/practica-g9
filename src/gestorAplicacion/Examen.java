/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestorAplicacion;

import java.time.LocalDateTime;

import gestorAplicacion.personas.Medico;
import gestorAplicacion.personas.Paciente;

/**
 *
 * @author Roger Vera
 */
public class Examen extends Consulta {

    private tipoExamen tipo;
    private boolean autorizado;
    
    // Constructor
    public Examen(int id, Paciente paciente, tipoExamen tipo, boolean autorizado) {
    	this(id, paciente, null, null, null, null, tipo, autorizado);
    }
    
    public Examen(int id, Paciente paciente, Medico medico, Consultorio consultorio, LocalDateTime fecha, 
    		Pago pago, tipoExamen tipo, boolean autorizado) {
    	this.id = id;
    	this.paciente = paciente;
    	this.medico = medico;
    	this.consultorio = consultorio;
    	this.fecha = fecha;
    	this.pago = pago;
    	this.tipo = tipo;
    	this.autorizado = autorizado;
    }
    
	// Getters y Setters
	public tipoExamen getTipo() {
		return tipo;
	}
	public void setTipo(tipoExamen tipo) {
		this.tipo = tipo;
	}
	public boolean isAutorizado() {
		return autorizado;
	}
	public void setAutorizado(boolean autorizado) {
		this.autorizado = autorizado;
	}
}