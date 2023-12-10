package AmbienteVisualEJERCICIO;
import java.util.*;
public class triangulo {
	
	private double base;
	private double altura;
	
	public void setbase(double _base){
		base=_base;
	}
	public void setaltura(double _altura){
		altura=_altura;
	}
	public double getbase(){
		return base;
	}
	public double getaltura(){
		return altura;
	}
	
	public double calcula_area(){
		double area=altura*base/2;
		return area;
	}

}
