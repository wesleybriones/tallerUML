
package SistemaClinico;
import java.util.Date;
/**
 *
 * @author ANGIE
 */
public class Cita {
    protected Date fecha; 
    protected boolean pagada; 
    protected String registradoPor;
    protected Paciente paciente;
    
    public void realizarPago(Pago pago){
    }
    
    public boolean agendarCita(){
        if (pagada == false){
            System.out.println("No agendada");
            return false;
        }System.out.println("Agendada");
        return true;
    }
    
    public void enviarCorreo(){
        if (agendarCita()==true)
            System.out.println("Correo enviado.");
        System.out.println("Necesita agendar cita");
    }
}
