package figurasAmbienteGrafico;
import java.util.*;
public class rectangulo {

	private double Largo;
	private double Ancho;
	
	public void setLargo(double _largo){
		Largo=_largo;
	}
	public void setAncho(double _ancho){
		Ancho=_ancho;
	}
	public double getLargo(){
		return Largo;
	}
	public double getAncho(){
		return Ancho;
	}
	
	public double calcular_area(double Largo, double Ancho){
		double area=Largo*Ancho;
		return area;
	 }
	
	 public double calcular_perimetro(double Largo, double Ancho){
	double perimetror=Largo+Largo+Ancho+Ancho;
	return perimetror;
	 }

}
