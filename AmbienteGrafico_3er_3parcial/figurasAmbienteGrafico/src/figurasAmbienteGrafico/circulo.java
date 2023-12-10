package figurasAmbienteGrafico;
import java.util.*;
public class circulo {
	
	 private double Radio;
	 
	 public void setRadio(double _radio){
		 Radio=_radio;
	 }
	 public double getRadio(){
		 return Radio;
	 }
	 
	 public double calcular_area(double Radio){
		 double areac=(Radio*Radio)*3.1416;
		 return areac;
		 }
	 
	 public double calcular_perimetro(double Radio){
		 double perimetroc=2*3.1416*Radio;
		 return perimetroc;
	}

}
