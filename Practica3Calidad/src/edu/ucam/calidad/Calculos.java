package edu.ucam.calidad;

public class Calculos {

	public static double n1;
	public static double n2;
	public static double n3;
	public static String nombre;
	public static int array[];
	
	
	public Calculos (double n1, double n2, double n3){
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	public Calculos (String nombre){
		this.nombre = nombre;
	}
	
	public Calculos (int array[]){
		this.array = array;
	}
	
	public double suma() {
		double resultado = n1 + n2 + n3;
		return resultado;
	}
	
	
	public double resta() {
		double resultado = n1 - n2 - n3;
		return resultado;
	}
	
	public double multi() {
		double resultado = n1 * n2 * n3;
		return resultado;
	}
	
	public double dividir() {
		double resultado = n1 / n2 / n3;
		return resultado;
	}
	
	public String nombre() {
		String resultado = nombre;
		return resultado;
	}
	
	public int[] array() {
		int[] resultado = array;
		return resultado;
	}
	
}
