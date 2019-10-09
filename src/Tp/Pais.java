package Tp;
import java.util.*;

public class Pais {
	public String nombrePais;
	public List<String>caracteristicasDelPais;
	public List<LugarDeInteres>lugaresInteres;
	public List<Pais>paisesConConexionAerea;
	
	
	public boolean tieneConexionAereaCon(Pais otroPais) {
		return this.paisesConConexionAerea.contains(otroPais)&& otroPais.paisesConConexionAerea.contains(this);		
	}
	public List<String> darCaracteristicas(int cantidadCaracteristicasaDar){
		List<String> caracteristicasADar = null;
		for(int i=0;i<cantidadCaracteristicasaDar;i++) {
			caracteristicasADar.add(caracteristicasDelPais.get(i));
		}
		return caracteristicasADar;
	}
	

}
