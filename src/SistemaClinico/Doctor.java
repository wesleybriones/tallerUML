
package SistemaClinico;

/**
 *
 * @author Joyce Rojas
 */
public class Doctor extends Persona{
	protected int regDoctor;  
	protected String especialidad;    
	protected Secretaria secretaria; 

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
} 
