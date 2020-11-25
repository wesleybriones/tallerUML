/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaClinico;

/**
 *
 * @author Joyce Rojas
 */
public class Secretaria extends Persona{      
        protected Cita cita;  
        protected Doctor doctor;  
	public void verificarCita(){      

	}
	public void agendarCita(){  

	} 
        public boolean atenderPaciente(){    
            cita.consultarCita(cita.paciente);  
            if (doctor.getStatusDoctor()){ 
                doctor.setStatusDoctor(false);
                return true;  
            }
            return false;
        }
      

} 
