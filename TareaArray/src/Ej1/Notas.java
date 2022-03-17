package Ej1;
/**
 * @author Lucas Garcia Nevado
 */
import java.util.Arrays;
import java.util.Scanner;

public class Notas {
	public static Scanner entrada = new Scanner(System.in);
	public static int cont = 0;//Contador global
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			double [] notas = new double [10];//Creación del array notas
			int num;//Definicion de variable para introducir números
			
			//Realizamos un do while para crear el menú que queremos que nos muestre
			do {
				System.out.println("Op -1.Introducir notas.");
				System.out.println("\nOp -2.Mostrar todas las notas.");
				System.out.println("\nOp -3.Buscar nota.");
				System.out.println("\nOp -4.Ordena las notas de menor a mayor.");
				System.out.println("\nOp -5.Mostrar nota media.");
				System.out.println("\nOp -6.Mostrar número de aprobados."); 
				System.out.println("\nOp -7.Mostrar la nota más alta.");
				
				System.out.println("\n¿Qué deseas hacer?");
				num = entrada.nextInt();//Le pedimos al usuario que nos introduzca un numero comprendido entre los casos 

				switch(num) {
				
				case 1: if (cont < 10) {
					introducirNotas(notas);
				}//Llamamos al método introducirNotas
				break;
				
				case 2: if(cont > 0) {
					mostrarNotas(notas);
				}//Llamamos al método mostrarNotas
				break;
				
				case 3: if(cont > 0) {
					buscarNotas(notas);
				}//Llamamos al método buscarNotas
				break;
				
				case 4: if(cont > 0) {
					ordenarNotas(notas);
				}//Llamamos al método ordenarNotas
					
				break;
				
				case 5: if(cont > 0) {
					mediaNota(notas);
				}
					
				break;
				
				case 6: if(cont > 0) {
					numAprobados(notas);
				}
				
				break;
				
				case 7: if(cont > 0 ) {
					notaAlta(notas);
				}
				break;
				
				}
			}
			while(num>0);//El programa llegará a su fin cuando se introduzca un 0
			
			System.out.println("Programa terminado");
		}
		
		/**
		 * Método que nos permitirá introducir notas
		 * @param notas
		 */
		public static void introducirNotas(double[]notas) {
		
			for(int i = 0;i < notas.length;i++) {
				
				System.out.println("Introduce la nota: ");
			   notas[i] = entrada.nextDouble();
				
				cont++;
			}
		}
		
		/**
		 * Método que nos permitirá mostrar las notas anteriores
		 * Si en el caso que no hubiese notas no mostraria nada
		 * @param notas
		 */
		public static void mostrarNotas(double []notas) {
			
			for(int i = 0;i < notas.length;i++) {
				
				System.out.println(notas[i]);
			}
		}
		
		/**
		 * Método que nos permitirá ordenar las notas introducidas
		 * @param notas
		 */
		public static void ordenarNotas(double[]notas) {
		
			int cont1 = 0 ;
			for(boolean ordenado = false;!ordenado;) {
				for(int i = 0;i < notas.length - 1;i++) {
					if(notas[i]> notas[i+1]) {
						
						double aux = notas[i];
						notas[i] = notas[i+1];
						notas[i+1] = aux;
						
						cont1++;
					}
				}
				if(cont1 == 0){
					ordenado = true;
				}
				cont1 = 0;
			}
			
		}

		/**
		 * Creacion de un metodo que nos ayuda a buscar las notas que ha introducido el usuario
		 * Utilizando la clase Arrays para que ordene los números antes de buscarlos por si en el menú
		 * @param notas
		 */
		public static void buscarNotas(double[]notas) {
			
			int posicion;//Definicion de variables locales
			double buscar;//Definicion de variables locales
			
			
			System.out.println("Introduce la nota que deseas buscar: ");//Le pedimos al usuario que introduzca la nota que quiera buscar
			buscar = entrada.nextDouble();
			
			Arrays.sort(notas);//Utilizamos este metodo para que nos ordene las notas una vez pedidas
			
			posicion = Arrays.binarySearch(notas, buscar);
			System.out.println("La posición donde se encuentra la nota es: "+posicion);//Luego le mostramos por consola la posicion en la que se encuentra la nota
				
		}
	
		/**
		 * Creamos el metodo mediaNota para realizar la media de las notas introducidas
		 * Primero creo una variable local
		 * Luego creo un for para la utilizacion del array y con la varible local se lo sumo al array
		 * @param notas
		 */
		
		public static void mediaNota(double[]notas) {
		
			double suma = 0;//Definicion de una variable local
			
			for(int i = 0; i<notas.length;i++) {
				suma = suma +notas[i];
			}
			System.out.println("La media es: " +suma/notas.length);	
		}
		
		/**
		 * Creamos el metodo de numeros aprobados para ver cuantos alumnos han aprobado
		 * @param notas
		 */
		
		public static void numAprobados(double[]notas) {
			
			double contA = 0;
			
			for(int i = 0; i <notas.length -1; i++) {
				
				if(notas[i] >= 5) {
					contA++;
				}
			}
			
			System.out.println("El numero de aprobados es: " +contA);
		}
		
		/**
		 * Creamos el metodo notaAlta, para ver cual es la nota mas alta de las que han introducido
		 * Creacion de una varible local
		 * Creamos un for para la utilizacion del array y despues creamos un if
		 * @param notas
		 */
		
		public static void notaAlta(double[]notas) {
			
			double nota = 0; //Declaracion de variable local
			
			for(int i = 0; i < notas.length; i++) {
				
				if(nota < notas[i]) {
					
					nota = notas[i];
				}
			}
			
			System.out.println("La nota mas alta es: " +nota);
		}
}