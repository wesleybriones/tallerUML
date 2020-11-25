package SistemaClinico;

/**
 *
 * @author wesley
 */
public class Paciente extends Persona{
    protected String email;
    protected Cita cita;
    protected HistoriaClinica historia;
    protected Receta receta;
    
    public Paciente(String email, HistoriaClinica historia, Receta r){
        this.email = email;
        this.historia = historia;
        this.receta = r;
    }
    
    public void  consultarCitasDisponibles(){
        
    }
    
    public boolean solicitarCita(){
        consultarCitasDisponibles();
        if (cita.agendarCita()){
            cita.enviarCorreo();
            return true;
        }return false;
    }
}
