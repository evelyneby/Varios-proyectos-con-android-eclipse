package figurasAmbienteGrafico;
import java.util.*;
public class triangulo {
	
	private double Base;
	private double Altura;
	private double Lado1;
	private double Lado2;
	private double Lado3;
	
	public void setBase(double _base){
		Base=_base;
	}
	
	public void setAltura(double _altura){
		Altura=_altura;
	}
	
	public double getBase(){
		return Base;
	}
	public double getAltura(){
		return Altura;
	}
	
	public void setLado1(double _lado1){
		Lado1=_lado1;
	}
	public void setLado2(double _lado2){
		Lado2=_lado2;
	}
	public void setLado3(double _lado3){
		Lado3=_lado3;
	}
	public double getLado1(){
		return Lado1;
	}
	public double getLado2(){
		return Lado2;
	}
	public double getLado3(){
		return Lado3;
	}
	
	public double calcular_area(double Base, double Altura){
		double areat=(Base*Altura)/2;
		return areat;
	}
	
	public double calcula_perimetro(double Lado1,double Lado2, double Lado3){
		 double perimetro=Lado1+Lado2+Lado3;
		return perimetro;
	}
}
