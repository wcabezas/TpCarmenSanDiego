package Tp;
import java.util.List;

public class Caso {
	public Villano responsable;
	public List<Pais>planDeEscape;
	public String reporte;
	public String objetoRobado;
	public Pais paisDondeOcurrioElSiniestro;
	
	public Boolean seEncuentraPaisEnElPanDeEscape(Pais paisCualquiera) {
		return planDeEscape.contains(paisCualquiera);
		
	}
}
