package figurasAmbienteGrafico;
import java.util.*;
public class cuadrado {
	
	 private double Lado;
	 
	 public void setLado(double _lado){
		 Lado=_lado;
	 }
	 public double getLado(){
		 return Lado;
	 }
	 
	 public double calcula_area(double Lado){
		 double area=Lado*Lado;
		 return area;
	 }
	 public double calcular_perimetro(double Lado){
		 double perimetro=Lado*4;
		 return perimetro;
}

}
