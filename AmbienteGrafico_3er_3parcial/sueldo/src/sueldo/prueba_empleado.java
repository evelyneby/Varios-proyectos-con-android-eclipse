package sueldo;
import java.util.*;
public class prueba_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Teclado=new Scanner(System.in);
		empleado e=new empleado();
		
		System.out.println("Dame tu nombre");
		String nombre=Teclado.nextLine();
		e.setNombre(nombre);
		System.out.println("Dame tu departamento donde estas");
		String depa=Teclado.nextLine();
		e.setDepartamento(depa);
		System.out.println("Dame tu sueldo diario");
		double sueldo=Teclado.nextDouble();
		e.setSueldoDiario(sueldo);
		
		double sueldos=e.calcula_sueldoSemanal(sueldo);
		double impuesto=e.calcula_impuesto(sueldos);
		double sueldot=e.calcula_sueldototal(sueldos,impuesto);
		
		System.out.println("tu nombre es " +e.getNombre());
		System.out.println("tu departamento es " +e.getDepartamento());
		System.out.println("tu sueldo diario es " +e.getSueldoDiario());
		System.out.println("tu sueldo de una semana es "+ sueldos);
		System.out.println("tu sueldto total es "+ sueldot);

	}

}
