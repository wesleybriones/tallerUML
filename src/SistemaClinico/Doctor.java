
package SistemaClinico;

/**
 *
 * @author Joyce Rojas
 */
public class Doctor extends Persona{
	protected int regDoctor;  
	protected String especialidad;    
	protected Secretaria secretaria;   
        protected Cita cita;  
        protected Receta receta; 
        public boolean disponible; 

	public void recetar(){  

	}  

	public void agregarPlanNut(){  

	} 
	public void imprimirReceta() {

	}  

	public void registraSecretaria(){ 
		System.out.println("Secretaria registrada");
	}       
	public int getRegDoctor(){  
		return regDoctor;  
	}
	public String getEspecialidad(){  
		return especialidad;  
	}
	public Secretaria getSecretaria(){  
		return secretaria;  
	}
        public boolean getStatusDoctor(){
            return disponible;  
        }
        public void setStatusDoctor(boolean b){
            this.disponible=b;
        }
} 
