package sueldo;
import java.util.*;
public class empleado {
	
	private String Nombre;
	private String Departamento;
	private double SueldoDiario;
	
	public String getNombre(){
		return Nombre;
	}
	public void setNombre(String Nombre){
		this.Nombre=Nombre;
	}
	
	public String getDepartamento(){
		return Departamento;
	}
	
	public void setDepartamento(String Departamento){
		this.Departamento=Departamento;
	}
	
	public double getSueldoDiario(){
		return SueldoDiario;
	}
	
	public void setSueldoDiario(double SueldoDiario){
		this.SueldoDiario=SueldoDiario;
	}
	
	public double calcula_sueldoSemanal(double _sueldodiario){
		double sd=_sueldodiario*5;
		return sd;
	}
	
	public double calcula_impuesto(double _sueldosemanal){
		double impuesto=_sueldosemanal*.05;
		return impuesto;
	}
	
	public double calcula_sueldototal(double _sueldoSemanal, double _impuesto){
		double sueldototal=_sueldoSemanal-_impuesto;
		return sueldototal;
	}
	

}
