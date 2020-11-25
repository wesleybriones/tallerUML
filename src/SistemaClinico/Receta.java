package SistemaClinico;

/**
*
* @author Marck Murillo
*/

import java.util.Date;

public class Receta {
	
	public Medicamento medicamentos;
	public PlanNutricional planNut;
	protected Date fecha;
        
    public Receta(Medicamento medicamentos, PlanNutricional planNut){
        this.medicamentos = medicamentos;
        this.planNut = planNut;
    }    
	
}
