package Tp;
import java.util.*;

public class Villano{
	public String nombre;
	public String sexo;
	public List<String>seniasParticulares;
	public List<String>hobbies;
	private List<Pais>rutaDeescape;
	
	public List<Pais> getRutaDeescape() {
		return rutaDeescape;
	}
	public void setRutaDeescape(List<Pais> rutaDeescape) {
		this.rutaDeescape = rutaDeescape;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public List<String> getSeniasParticulares() {
		return seniasParticulares;
	}
	public void setSeniasParticulares(List<String> seniasParticulares) {
		this.seniasParticulares = seniasParticulares;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
}
