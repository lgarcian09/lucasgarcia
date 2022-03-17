package Ej2;
/**
 * 
 * @author Lucas Garcia Nevado
 *
 */
public class PC {

	//Declaracion de variables
	
	private String identificador; 
	private String modelo;
	
	
	/**
	 * Constructor por defecto de la clase PC
	 */
	public PC(){
		
	}
	
	/**
	 * Constructor parametrizado utilizando el operador this.
	 * @param identificador
	 * @param modelo
	 */
	public PC(String identificador, String modelo) {
		
		this.identificador = identificador;
		this.modelo = modelo;
		
	}
	
	/**
	 * Creacion de los metodos set para la carga de datos
	 */
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	/**
	 * Creacion de todos los metodos get, para salida de datos, estos se tienen que hacer ya que son privados.
	 */
	
	public String getIdentificador() {
		return identificador;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	
	public String toString() {
		
		String mensj = "El identificador del PC es: " +this.identificador+ "\nEl modelo del PC es: " +this.modelo;
		return mensj;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
